public class YmisMath {
    public static double sigmoid (double x) {
        return 1/(1+Math.pow(Math.E, -x));
    }

    public static void main(String[] args) {
        for (double i = -6.0; i <= 6.0 ; i += 0.5) {
            System.out.printf("val: %+.1f, sig: %.5f",i,sigmoid(i));
            System.out.println();
        }
    }
}