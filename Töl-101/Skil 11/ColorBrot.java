/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-08-11 22:19
 * @ Lýsing: 	Inniheldur nokkur föll með sína eigin javadoc lýsingu ásamt main til þess að testa klasann,
 *              teiknar mandelbrot í litum
 */

import java.awt.Color;
import java.util.Arrays;

public class ColorBrot {
    // return number of iterations to check if c = a + ib is in Mandelbrot set
    /**
     * Skilar d fjölda af athugunum hvort c = a + ib sé Mandelbrot
     * @param z0 complex tala
     * @param d fjoldi endurtekninga
     * @return d
     */
    public static int mand(Complex z0, int d) {
        Complex z = z0;
        for (int t = 0; t < d; t++) {
            if (z.abs() > 2.0) return t;
            z = z.times(z).plus(z0);
        }
        return d;
    }

    /**
     * Reiknar út mandelbrot útfrá gefnum skilyrðum
     * @param s Square hlutur
     * @param n int fjöldi endurtekninga
     * @param iterations fjoldi aðgerða
     * @param colors fylki af Color gerð
     * @return skilar mynd
     */
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

    /**
     * Býr til Square hlut út frá skilyrðum teknum inn úr skrá
     * @param s Strengur með nafn á skrá
     * @return Square hlutur
     */
    public static Square lesaMidja(String s) {
        In in = new In(s);
        String lina = in.readLine();
        in.close();
        String[] gogn = lina.split(" ");
        return new Square(Double.parseDouble(gogn[0]),Double.parseDouble(gogn[1]),Double.parseDouble(gogn[2]));
    }

    /**
     * Skilar Color fylki útfrá gögnum teknum inn af staðalinntaki
     * @param skra String nafn á skrá
     * @param itranir int fjöldi lita sem á að búa til
     * @return Color fylki
     */
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