public class LLMerge {
    /**
     * bara hér fyrir debug, tekur inn fyrsta stak lista og prentar út heildarlistann
     * @param first LLNode, það fyrsta
     */
    public static void printList(LLNode first) {
        for (LLNode x = first; x != null; x = x.next) {
            System.out.print(x.item);
            if (x.next != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static LLNode merge(LLNode a, LLNode b) {
        LLNode tempNode = new LLNode();
        LLNode lastNode = tempNode;

        while (true) {
            if (a == null) {
                lastNode.next = b;
                break;
            }
            if (b == null) {
                lastNode.next = a;
                break;
            }

            if (a.item.compareTo(b.item) <= 0) {
                lastNode.next = a;
                a = a.next;
            }

            else {
                lastNode.next = b;
                b = b.next;
            }

            lastNode = lastNode.next;
        }
        return tempNode.next;
    }

    public static void main(String[] args) {
        LLNode n11 = new LLNode();  n11.item = "a";
        LLNode n12 = new LLNode();  n12.item = "d"; n11.next = n12;
        LLNode n13 = new LLNode();  n13.item = "e"; n12.next = n13;
        System.out.println("Fyrri listi:");
        printList(n11);

        LLNode n21 = new LLNode();  n21.item = "b";
        LLNode n22 = new LLNode();  n22.item = "c"; n21.next = n22;
        LLNode n23 = new LLNode();  n23.item = "f"; n22.next = n23;
        System.out.println("Seinni listi:");
        printList(n21);

        System.out.println("Merged listar:");
        printList(merge(n11, n21));
    }
}