/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 14:17
 * @ Lýsing: 	klasinn DiscreteProfun inniheldur main fall og fallið discreteLikur,
 *              discreteLikur tekur inn kommutölufylki, likur, og heiltölu, n, það skilar heiltölufylki
 *              sem inniheldur n stök sem hafa random gildi útfrá líkindadreifingu sem gefin var með likur
 * 
 *              main fallið sér um að prófa discreteLikur fallið
 */

import java.util.Arrays;

public class DiscreteProfun {
    public static void main(String[] args) {
        double [] likindi1 = {0.30, 0.05, 0.05, 0.05, 0.05, 0.50};
        int [] utkoma1 = discreteLikur(likindi1, 10);
        double [] likindi2 = {0.50, 0.50};
        int [] utkoma2 = discreteLikur(likindi2, 0);
        int [] utkoma3 = discreteLikur(likindi2, 20);

        System.out.println(Arrays.toString(utkoma1));
        System.out.println(Arrays.toString(utkoma2));
        System.out.println(Arrays.toString(utkoma3));
    }

    /**
     * fallið discreteLikur tekur inn kommutölufylki og heiltölu og skilar heiltölufylki af lengd n 
     * með stök sem eru output úr Stdrandom.discrete þar sem miðað er við kommutölufylkið
     * @param double[] likur kommutölufylki þar sem summa allra staka í fylkinu er jafnt og 1
     * @param int n stærð fylkis sem fallið skilar
     * @return int[] heiltölufylki með dreifingu discrete fallsins
     */
    public static int[] discreteLikur(double[] likur, int n) {
        int[] arrayOut = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrayOut[i] = StdRandom.discrete(likur)+1;
        }
        return arrayOut;
    }
}
