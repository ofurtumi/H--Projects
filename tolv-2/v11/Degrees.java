import java.util.ArrayList;

import edu.princeton.cs.algs4.*;

public class Degrees {
    private Digraph dg;

    public Degrees(Digraph dg) {
        this.dg = dg;
    }

    public int indegree(int v) {
        int counter = 0;
        for (int i = 0; i < dg.V(); i++) {
            BreadthFirstDirectedPaths bf = new BreadthFirstDirectedPaths(dg, i);
            if (bf.distTo(v) == 1)
                counter++;

        }

        return counter;
    }

    public int outdegree(int v) {
        int counter = 0;
        BreadthFirstDirectedPaths bf = new BreadthFirstDirectedPaths(dg, v);
        for (int i = 0; i < dg.V(); i++) {
            if (bf.distTo(i) == 1)
                counter++;
        }

        return counter;
    }

    public Iterable<Integer> sources() {
        ArrayList<Integer> sources = new ArrayList<Integer>();
        for (int i = 0; i < dg.V(); i++) {
            if (indegree(i) == 0)
                sources.add(i);
        }
        return sources;
    }

    public Iterable<Integer> sinks() {
        ArrayList<Integer> sinks = new ArrayList<Integer>();
        for (int i = 0; i < dg.V(); i++) {
            if (outdegree(i) == 0)
                sinks.add(i);
        }
        return sinks;
    }

    public boolean isMap() {
        for (int i = 0; i < dg.V(); i++) {
            if (outdegree(i) != 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Digraph DG = DigraphGenerator.simple(5, 10);
        System.out.println("DG.toString() --> " + DG.toString());
        Degrees D = new Degrees(DG);
        System.out.println("D.indegree(4) --> " + D.indegree(4));
        System.out.println("D.outdegree(4) --> " + D.outdegree(4));
    }
}
