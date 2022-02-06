public class WeightedQuickUnionUF {
    private int[] id; // parent link (site indexed)
    private int[] sz; // size of component for roots (site indexed)
    private int count; // number of components

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++)
            sz[i] = 1;
    }

    public int count() {
        return count;
    }

    /**
     * athugar hvort p sé gild rót
     * 
     * @param p rót til að athuga
     * @return skilar true ef rótin er gild
     */
    private boolean isRoot(int p) {
        int n = id.length;
        if (p >= n || p < 0)
            return false;
        return true;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    private int find(int p) { // Follow links to find a root.
        if (!isRoot(p))
            throw new IllegalArgumentException("Ekki gild rót");

        // geymir upprunalega p
        int root = p;
        while (p != id[p]) {
            p = id[p];
        }

        // tekur p og færir það upp í efstu rót
        while (root != p) {
            int temp = id[root];
            id[root] = p;
            root = temp;
        }
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j)
            return;
        // Make smaller root point to larger one.
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) {
                continue;
            }
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
