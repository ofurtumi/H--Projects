/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  L?sing  : Klasi sem inniheldur miðju og stærð fernings
 *
 *
 *****************************************************************************/

public class Square {

    private double x;
    private double y;
    private double size;

    // smiður fyrir ferning í miðju xc, yc og stærð s
    public Square(double xc, double yc, double s) {
        x = xc;
        y = yc;
        size = s;
    }

    // nær í vinstri hlið fernings í dálki i
    public double getX0(int i, int n) {
        return x - size / 2 + size * i / n;
    }

    // nær í neðri hlið fernings í línu j
    public double getY0(int j, int n) {
        return y - size / 2 + size * j / n;
    }


    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(new Square(0.5, 0.5, 30));
    }
}
