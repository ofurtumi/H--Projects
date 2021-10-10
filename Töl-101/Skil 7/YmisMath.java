public class YmisMath {
    public static double sigmoid (double x) {
        double safx = 1/(1+Math.pow(Math.E, -x));
        return safx;
    }
    public static void main(String[] args) {
        Double x = -6.0;
        for (int i = 1; i <= 25; i++) {
            System.out.println("S(" + x +") = " + sigmoid(x));
            x = x+0.5;
        }
    }    
}
