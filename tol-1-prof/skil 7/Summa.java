public class Summa {
    public static boolean summaTveir (int a, int b, int c) {
        int ab = a+b;
        int ac = a+c;
        int bc = b+c;

        if (c == ab) {
            return true;
        }
        if (b == ac) {
            return true;
        }
        if (a == bc) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("test 1,2,3: " + summaTveir(1,2,3));
        System.out.println("test 5,7,9: " + summaTveir(5,7,9));
        System.out.println("test 5,10,15: " + summaTveir(5,10,15));
        System.out.println("test 10,100,1000: " + summaTveir(10,100,1000));
    }
}
