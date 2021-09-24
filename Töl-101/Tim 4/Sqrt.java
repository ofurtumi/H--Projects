public class Sqrt {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double t = c;
        double EPSILON = 1.0e-15;
        int count = 0;
        while (Math.abs(t-c/t) > EPSILON*t) {
            t = (t+c/t)/2.0;
            count++;
        }

        System.out.println("Ítranir " + count);
        System.out.println(t);
    }
}