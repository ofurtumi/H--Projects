import edu.princeton.cs.algs4.*;

public class Bacon {
    public static void main(String[] args) {
        SymbolGraph sg = new SymbolGraph(args[0], args[1]);
        Graph G = sg.graph();
        String source = args[2];
        if (!sg.contains(source)) {
            StdOut.println(source + " not in database.");
            return;
        }
        int s = sg.indexOf(source);
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, s);
        while (!StdIn.isEmpty()) {
            String sink = StdIn.readLine();
            if (sg.contains(sink)) {
                int t = sg.indexOf(sink);
                int c = 0;
                if (bfs.hasPathTo(t)) {
                    for (int v : bfs.pathTo(t)) {
                        StdOut.println(" " + sg.nameOf(v));
                        c++;
                    }

                    System.out.println("c --> " + (c-1)/2);
                } else
                    StdOut.println("Not connected");
            } else
                StdOut.println("Not in database.");
        }
    }
}
