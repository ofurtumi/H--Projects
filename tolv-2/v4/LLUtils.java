public class LLUtils {
  public static LLNode removeLast(LLNode first) {
    if (first == null || first.next == null) return null;
    LLNode nextToLast = first;
    for (LLNode x = first; x.next != null; x = x.next) {
      nextToLast = x;
    }
    nextToLast.next = null;
    return first;
  }

  public static LLNode findLast(LLNode first, String s) {
    LLNode sidastaGeymd = null;
    for (LLNode x = first; x != null; x = x.next) {
      if(x.item.equals(s)) {
        sidastaGeymd = x;
      }
    }
    
    return sidastaGeymd;
  }
  
  public static void printList(LLNode first) {
    for (LLNode x = first; x != null; x = x.next) {
      System.out.print(x.item);
      if (x.next != null) {
        System.out.print(" -> ");
      }
    }
    System.out.println();
  }
  
  public static LLNode join(LLNode node1, LLNode node2) {
    LLNode tempNode = new LLNode();
    LLNode lastNode = tempNode;

    while (true) {
      if (node1 == null) {
        lastNode.next = node2;
        break;
      }
      if (node2 == null) {
        lastNode.next = node1;
        break;
      }

      if (node1.item.compareTo(node2.item) <= 0) {
        lastNode.next = node1;
        node1 = node1.next;
      }

      else {
        lastNode.next = node2;
        node2 = node2.next;
      }

      lastNode = lastNode.next;
    }
    return tempNode.next;
  }

  public static void main(String[] args) {
    LLNode n1 = new LLNode();
    n1.item = "a";
    LLNode n2 = new LLNode();
    n2.item = "d";
    LLNode n3 = new LLNode();
    n3.item = "e";
    LLNode n4 = new LLNode();
    n4.item = "g";
    LLNode n5 = new LLNode();
    n5.item = "h";

    LLNode n6 = new LLNode();
    n6.item = "b";
    LLNode n7 = new LLNode();
    n7.item = "c";
    LLNode n8 = new LLNode();
    n8.item = "f";
    LLNode n9 = new LLNode();
    n9.item = "i";
    LLNode n10 = new LLNode();
    n10.item = "j";
    LLNode n11 = new LLNode();
    n11.item = "k";

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    n6.next = n7;
    n7.next = n8;
    n8.next = n9;
    n9.next = n10;
    n10.next = n11;

    // printList(n1);
    // printList(n6);
    printList(join(n1, n6));

    // System.out.println(findLast(n1, "def"));
    // System.out.println("n2: " + n2);
    // System.out.println("n4: " + n4);
    // LLNode ret = removeLast(n1);
  }
}