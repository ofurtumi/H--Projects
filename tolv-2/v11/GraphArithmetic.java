import java.util.Hashtable;

import edu.princeton.cs.algs4.*;

public class GraphArithmetic {

    private static Hashtable<Integer, Double> HT = new Hashtable<>();
    // ! nauðsynlegt fyrir fibonacci
    // ? heldur utan um reiknuð gildi

    public static double calculate(Digraph dg, String[] vertexValues) {
        HT.clear();

        // * sá hnútur sem á að skila, eini sem er með indegree = 0
        int retVert = 0;
        for (int i = 0; i < dg.V(); i++) {
            if (dg.indegree(i) == 0) {
                retVert = i;
                break;
            }
        }

        // * byrja recursion frá hnút sem var fundinn
        return partition(retVert, dg, vertexValues);
    }

    private static double partition(int n, Digraph dg, String[] values) {
        // ! nauðsynlegt fyrir fibonacci
        // ? ef reiknað gildi á hnút n er til skila því, sleppa öllu hinu
        if (HT.containsKey(n))
            return HT.get(n);

        double out = 0;
        double[] vals = new double[dg.outdegree(n)];

        if (vals.length > 0) { // * er hnútur lauf?
            int cnt = 0;
            for (int i : dg.adj(n)) {
                vals[cnt++] = partition(i, dg, values);
                HT.put(i, vals[cnt - 1]);
            }
            switch (values[n]) {
                case "+":
                    for (int i = 0; i < vals.length; i++) {
                        out += vals[i];
                    }
                    break;
                case "*":
                    out = 1;
                    for (int i = 0; i < vals.length; i++) {
                        out *= vals[i];
                    }
                    break;
                default:
                    break;
            }

            HT.put(n, out);
            return out;
        }
        return Double.parseDouble(values[n]); // * þessi er bara fyrir lauf
    }

    public static void main(String[] args) {
        Digraph dg = new Digraph(9);
        dg.addEdge(0, 1);
        dg.addEdge(0, 3);
        dg.addEdge(1, 2);
        dg.addEdge(1, 3);
        dg.addEdge(2, 4);
        dg.addEdge(2, 5);
        dg.addEdge(3, 6);
        dg.addEdge(3, 7);
        dg.addEdge(4, 7);
        dg.addEdge(4, 8);
        String[] values = { "*", "*", "+", "+", "*", "-1", "4", "5", "2" }; // 729.0

        System.out.println("calculate(dg, values) --> " + calculate(dg, values));
        System.out.println("HT.toString() --> " + HT.toString());
    }
}