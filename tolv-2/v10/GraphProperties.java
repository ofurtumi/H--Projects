import edu.princeton.cs.algs4.*;

public class GraphProperties {
    private Graph G;
    private int vert; // fjöldi hnúta í neti svo þurfi ekki að athuga fyrir hverja aðgerð

    GraphProperties(Graph G) {
        this.G = G;
        this.vert = G.V();
    }

    public int eccentricity(int V) {
        DepthFirstPaths d = new DepthFirstPaths(G, V);
        BreadthFirstPaths b = new BreadthFirstPaths(G, V);
        int longestP = 0;
        int longestV = -1;

        for (int i = 0; i < vert; i++) {
            int cnt = 0;

            if (d.pathTo(i) != null)
                cnt = LOI(d.pathTo(i));

            if (cnt > longestP) {
                longestP = cnt;
                longestV = i;
            }
        }

        if (longestV != -1)
            return LOI(b.pathTo(longestV));

        return longestV;
    }

    public int diameter() {
        int longestP = 0;
        int[] longestV = {-1,-1};

        for (int i = 0; i < vert; i++) {
            DepthFirstPaths d = new DepthFirstPaths(G, i);
            for (int j = 0; j < vert; j++) {
                int cnt = 0;

                if (d.pathTo(j) != null) cnt = LOI(d.pathTo(j));
                if (cnt > longestP) {
                    longestP = cnt;
                    longestV[0] = i;
                    longestV[1] = j;
                }
            }
        }

        if (longestV[0] != -1) return longestP;
        return -1;
    }

    public int radius() {
        int cnt = 99999;
        for (int i = 0; i < vert; i++) {
            int temp = eccentricity(i);
            if (temp < cnt) cnt = temp;
        }

        if (cnt != 99999) return cnt;
        return -1;
    }

    public int center() {
        int rad = radius();
        for (int i = 0; i < vert; i++) {
            if (eccentricity(i) == rad) return i;
        }
        return -1;
    }

    /**
     * * LOI - Length Of Iterable
     * ? tekur inn iterable af hnútum og skilar fjölda vega á milli þeirra
     * 
     * @param it Iterable<integer>
     * @return int fjöldi vega
     */
    private int LOI(Iterable<Integer> it) {
        int cnt = 0;
        for (Integer i : it) {
            cnt++;
        }
        return cnt - 1;
    }

    public static void main(String[] args) {
        SymbolGraph sg = new SymbolGraph(args[0], args[1]);
        GraphProperties G = new GraphProperties(sg.graph());
        System.out.println("G.eccentricity(0) --> " + G.eccentricity(0));
        System.out.println("G.radius() --> " + G.radius());
        System.out.println("G.diameter() --> " + G.diameter());

    }
}
