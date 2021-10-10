public class Summa {
    public static boolean summaTveir(int a, int b, int c) {
        boolean gildi = false;

        if (a+b == c) gildi = true;
        else if (a+c == b) gildi = true;
        else if (b+c == a) gildi = true;
        return gildi;
    }

    public static void main(String[] args) {
        boolean s1 = summaTveir(1,2,3);
        boolean s2 = summaTveir(5,10,15);
        boolean s3 = summaTveir(8,3,5);
        boolean s4 = summaTveir(3,5,7);

        System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);
    }
}
