import java.awt.Color;
import java.util.Arrays;

public class ColorBrot {

    // return number of iterations to check if c = a + ib is in Mandelbrot set
    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }

    public static Picture reiknaMandelBrot(Square s, int n, int iterations, Color[] colors) {
        Picture pic = new Picture(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double x = s.getX0(i,n);
                double y = s.getY0(j,n);
                Complex z0 = new Complex(x, y);
                int t = mand(z0, iterations - 1);
                pic.set(i, n - 1 - j, colors[t]);
            }
        }
        return pic;
    }

    public static Square lesaMidja(String s) {
        In in = new In(s);
        String lina = in.readLine();
        in.close();
        String[] gogn = lina.split(" ");
        return new Square(Double.parseDouble(gogn[0]),Double.parseDouble(gogn[1]),Double.parseDouble(gogn[2]));
    }

    public static Color[] lesaColors(String skra, int itranir) {
        In in = new In(skra);
        Color[] colors = new Color[itranir];
        for (int i = 0; i < itranir; i++) {
            int r = in.readInt();
            int g = in.readInt();
            int b = in.readInt();
            colors[i] = new Color(r, g, b);
        }
        in.close();
        return colors;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int ITERS = Integer.parseInt(args[1]);

        Color[] litir = lesaColors("mandel.txt", ITERS);
        // System.out.println(Arrays.toString(litir));
        Square kassi = lesaMidja("midja.txt");

        
        Picture picture = reiknaMandelBrot(kassi, n, ITERS, litir);

        picture.show();
    }

}