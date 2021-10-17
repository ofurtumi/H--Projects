/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 12:10
 * @ Lýsing: 	Klasi Minnsta sem inniheldur main fall og fallið minnsta, main fallið sér um að prófa minnsta
 *              bæði með föstum stærðum og líka hægt að taka inn fylki af staðalinntaki.
 *              Lýsing fyrir fallið minnsta er sett fram með javadocs hætti
 */

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Minnsta {
    public static void main(String[] args) {
        double[] out1 = {1.0, 2.0, 3.0};
        out1 = minnsta(out1);
        double[] out2 = {1.0, 3.0, 6.0, 2.0};
        out2 = minnsta(out2);
        double[] out3 = {9, 1.0, 8.0, 4.0, 2.0, 8.0, 9.0, 10.0};
        out3 = minnsta(out3);

        System.out.println(Arrays.toString(out1));
        System.out.println(Arrays.toString(out2));
        System.out.println(Arrays.toString(out3));

        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        if (s.hasNext()) {
            int n = s.nextInt();
            double[] test = new double[n];
            for (int i = 0; i < n; i++) {
                test[i] = s.nextDouble();
            }
            System.out.println(Arrays.toString(minnsta(test)));
        }
    }

    /**
     * Tekur inn einvítt fylki og skilar einvíðu fylki af sömu lengd
     * sem inniheldur minnsta stak fyrir hlutmengi inntaksmengis.
     * Hlutmengin eru skilgreind á þennan hátt: fyrsta, frá a[0] upp í a[n-1]
     * annað, frá a[1] upp í a[n-1] alveg upp að síðasta, frá a[n-1] upp í a[n-1]
     * 
     * @param a kommutölufylki
     * @return skilar fylki af minnstu stökum í hlutmengjum a[i] til a[n-1]
    */
    public static double [] minnsta(double [] a) {
        int n = a.length;
        double[] outArray = new double[n];

        for (int i = 0; i < n; i++) {
            double min = Double.POSITIVE_INFINITY;
            for (int j = i; j < n; j++) {
                if (a[j] < min) min = a[j];
            }
            outArray[i] = min;
        }

        return outArray;
    }
}
