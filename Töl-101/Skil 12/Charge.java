import java.util.Objects;

/******************************************************************************
 *  Compilation:  javac Charge.java
 *  Execution:    java Charge x y
 *
 ******************************************************************************/

public class Charge {
    private final double rx, ry;   // position
    private final double q;        // charge

    public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    public double potentialAt(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return q + " at (" + rx + ", " + ry + ")";
    }

    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Charge that = (Charge) x;
        return (this.rx == that.rx) && (this.ry == that.ry);
    }

    public int hashCode() {
        return Objects.hash(rx, ry);
    }

    public static void main(String[] args) {
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        Charge c3 = new Charge(0.13, 0.94, 81.9);
        
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
    }
}
