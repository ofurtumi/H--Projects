import edu.princeton.cs.algs4.*;

public class threes {
    public static int findThrees(Digraph G) {
        int cnt = 0;
        int n = G.V();
        for (int i = 0; i < n; i++) {
            for (int root : G.adj(i)) {
                for (int child : G.adj(root)) {
                    boolean circle = false;
                    for (int connection : G.adj(child)) {
                        if (connection == root)
                            circle = true;
                    }
                    if (!circle)
                        cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Digraph DG = DigraphGenerator.simple(5, 10);
        System.out.println("DG.toString() --> " + DG.toString());
        int D = findThrees(DG);
        System.out.println("D --> " + D);
    }
}