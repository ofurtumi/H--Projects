public class Plus {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println(++a);
        System.out.println(a);
        System.out.println(b++);
        System.out.println(b);
        System.out.println((++c) + (++c));
        System.out.println(c);
        System.out.println((d++) + (d++));
        System.out.println(d);
    }
}