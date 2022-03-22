import edu.princeton.cs.algs4.*;

public class Dfsbridge {
    // 4.1.10
    public static int find(Graph g) {
        int vert = g.V();
        for (int i = 0; i < vert; i++) {
            if (g.degree(i) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SymbolGraph sg = new SymbolGraph(args[0], args[1]);
        Graph G = sg.graph();
        System.out.println(find(G));
    }
}