import edu.princeton.cs.algs4.*;

public class graph_2_9 {
    // Write a method that checks whether or not a given permutation of a DAG’s
    // vertices
    // is a topological order of that DAG.
    public static boolean checkOrder(Digraph dg, Integer[] topologicalOrder) {
        for (int i = 0; i < topologicalOrder.length; i++) {
            DepthFirstDirectedPaths df = new DepthFirstDirectedPaths(dg, topologicalOrder[i]);
            for (int j = 0; j < i; j++) {
                if (df.hasPathTo(topologicalOrder[j])) return false;
            }
        }
        return true;
    }
}