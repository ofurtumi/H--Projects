import edu.princeton.cs.algs4.*;

public class GraphProperties {
    private Graph G;

    GraphProperties(Graph G) {
        this.G = G;
    }

    public int eccentricity(int V) {
        BreadthFirstPaths b = new BreadthFirstPaths(G, V);
        int longestP = 0;
        int longestV = -1;

        for (int i = 0; i < G.V(); i++) {
            int cnt = 0;

            if (b.pathTo(i) != null)
                cnt = LOI(b.pathTo(i));

            if (cnt > longestP) {
                longestP = cnt;
                longestV = i;
            }
        }

        if (longestV != -1)
            return LOI(b.pathTo(longestV));

        return 0;
    }

    public int diameter() {
        int longestP = 0;
        int longestV = -1;

        for (int i = 0; i < G.V(); i++) {
            int ecc = eccentricity(i);
            if (longestP < ecc) {
                longestP = ecc;
                longestV = i;
            }
        }

        if (longestV != -1)
            return longestP;
        return 0;
    }

    public int radius() {
        int shortestP = Integer.MAX_VALUE;
        int shortestV = -1;

        for (int i = 0; i < G.V(); i++) {
            int ecc = eccentricity(i);
            if (shortestP > ecc) {
                shortestP = ecc;
                shortestV = i;
            }
        }

        if (shortestV != -1)
            return shortestP;
        return 0;
    }

    public int center() {
        int rad = radius();
        for (int i = 0; i < G.V(); i++) {
            if (eccentricity(i) == rad)
                return i;
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
        System.out.println("G.eccentricity(5) --> " + G.eccentricity(5));
        System.out.println("G.diameter() --> " + G.diameter());
        System.out.println("G.radius() --> " + G.radius());
        System.out.println("G.center() --> " + G.center());
    }
}
