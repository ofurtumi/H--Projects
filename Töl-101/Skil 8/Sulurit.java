/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 16:03
 * @ Lýsing: 	Klasi sem inniheldur tvö föll, birta og tidni, ásamt main falli til þess að prófa föllin
 */

import java.util.Arrays;

public class Sulurit {
    public static void main(String[] args) {
        int[] test1 = {3, 6, 1, 5, 1, 6, 1, 1, 6, 3};
        System.out.println(Arrays.toString(tidni(test1)));
    }

    /**
     * fall sem tekur inn heiltölufylki og reiknar út tíðni hvers og eins staks, skilar svo
     * kommutölufylki með stökum frá 0 upp í hæstu tölu inntökufylkisins
     * fallið endar á að kalla á fallið birta með outFylki sem parameter
     * @param fylki int[]
     * @return outFylki double[]
     */
    public static double[] tidni(int[] fylki) {
        int n = fylki.length;
        int max = fylki[0];
        for (int i = 0; i < n; i++) {
            if (fylki[i] > max) max = fylki[i];
        }

        double[] outFylki = new double[max];

        for (int j = 0; j < n; j++) {
            int temp = fylki[j];
            outFylki[temp-1]++;
        }

        birta(outFylki);
        return outFylki;
    }

    /**
     * tekur inn kommutölufylki og notar StdStats safnið til þess að teikna upp
     * súlurit notandi gögnin í fylkinu
     * @param fylki double[]
     */
    public static void birta(double[] fylki) {
        int n = fylki.length;
        StdDraw.setYscale(0,n);
        StdStats.plotBars(fylki);
    }
}
