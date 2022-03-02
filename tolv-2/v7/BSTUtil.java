import edu.princeton.cs.algs4.*;

public class BSTUtil {
    public static BSTNode min(BSTNode x) {
        if (x == null) return null;
        while (x.left != null) {
            x = x.left;
        }

        return x;
    }

    public static BSTNode secondMin(BSTNode x) {
        if (x == null) return null;
        if (x.left == null && x.right == null) return null;

        BSTNode y = min(x);
        if (y.right != null) return min(y.right);
        
        while ((x.left).left != null) {
            x = x.left;
        }
        return x;
    }

    public static void main(String[] args) {
        BSTNode a = new BSTNode("a");
        BSTNode b = new BSTNode("b");
        BSTNode c = new BSTNode("c");
        BSTNode d = new BSTNode("d");
        BSTNode e = new BSTNode("e");
        BSTNode f = new BSTNode("f");
        BSTNode g = new BSTNode("g");

        // a.left   = b;
        a.right  = c;

        b.left   = d;
        b.right  = e;

        c.left   = f;
        c.right  = g;

        System.out.println(min(a).key);
        System.out.println(secondMin(a).key);

        System.out.println(min(b).key);
        System.out.println(secondMin(b).key);
        System.out.println(secondMin(d));
    }
}