import edu.princeton.cs.algs4.Queue;

public class BSTUtil {
    public static void printLevel(BSTNode node) {
        if (node == null) {
            return;
        }
        Queue q = new Queue<BSTNode>();
        BSTNode temp;

        q.enqueue(node);
        while (!q.isEmpty()) {
            temp = (BSTNode) q.dequeue();
            System.out.println(temp.key);
            if (temp.left != null)
                q.enqueue(temp.left);
            if (temp.right != null)
                q.enqueue(temp.right);
        }
    }

    public static void main(String[] args) {
    BSTNode n1 = new BSTNode("1");
    BSTNode n2 = new BSTNode("2");
    BSTNode n3 = new BSTNode("3");
    BSTNode n4 = new BSTNode("4");
    BSTNode n5 = new BSTNode("5");
    BSTNode n6 = new BSTNode("6");
    BSTNode n7 = new BSTNode("7");
    BSTNode n8 = new BSTNode("8");
    BSTNode n9 = new BSTNode("9");
    BSTNode n10 = new BSTNode("10");

    n5.left = n3;
    n5.right = n8;
    n3.left = n1;
    n3.right = n4;
    n1.right = n2;
    n8.left = n7;
    n7.left = n6;
    n8.right = n10;
    n10.left = n9;

    printLevel(n5);

    printLevel(null);
    }
}