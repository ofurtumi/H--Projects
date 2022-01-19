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
  public static void main(String[] args) {
    LLNode n1 = new LLNode();
    n1.item = "abc";
    LLNode n2 = new LLNode();
    n2.item = "def";
    LLNode n3 = new LLNode();
    n3.item = "ghi";
    LLNode n4 = new LLNode();
    n4.item = "def";
    LLNode n5 = new LLNode();
    n5.item = "jkl";

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;

    printList(n1);
    System.out.println(findLast(n1, "def"));
    System.out.println("n2: " + n2);
    System.out.println("n4: " + n4);
    // LLNode ret = removeLast(n1);
  }
}