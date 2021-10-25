/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 16:03
 * @ Lýsing: 	Klasi sem inniheldur tvö föll, birta og tidni, ásamt main falli til þess að prófa föllin
 */

import java.util.Arrays;

public class Sulurit {
    public static void main(String[] args) {
        // int[] test1 = {3, 6, 1, 5, 1, 6, 1, 1, 6, 3};
        // System.out.println(Arrays.toString(tidni(test1)));
        // birta(tidni(test1));

        int[] test2 = {9,9,4,2,6,3,4,7,2,5,7,5,2,5,6,7,2,3,2,4,5,6,7,8,2,3,4,7,5,7,3,2,4,6,7};
        System.out.println(Arrays.toString(tidni(test2)));
        birta(tidni(test2));
    }

    /**
     * fall sem tekur inn heiltölufylki og reiknar út tíðni hvers og eins staks, skilar svo
     * kommutölufylki með stökum frá 0 upp í hæstu tölu inntökufylkisins
     * fallið endar á að kalla á fallið birta með outFylki sem parameter
     * @param fylki - int[] heiltölufylki sem inniheldur runu af tölum stærri en 0
     * @return double[] kommutölufylki sem innheldur upplýsingar um tíðni staka í inntökufylki
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

        return outFylki;
    }

    /**
     * tekur inn kommutölufylki og notar StdStats safnið til þess að teikna upp
     * súlurit notandi gögnin í fylkinu
     * @param fylki - double[] fylki sem inniheldur gögn um tíðni staka
     */
    public static void birta(double[] fylki) {
        int n = fylki.length;
        StdDraw.setYscale(0,n);
        StdStats.plotBars(fylki);
    }
}
