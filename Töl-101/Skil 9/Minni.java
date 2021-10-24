/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 14:44
 * @ Lýsing: 	klasinn inniheldur tvö föll, minniEn, sem athugar hversu mörg stök í röðuðu fylki eru minni en gefin tala
 *              og main sem sér um að prófa minniEn fallið
 */

public class Minni {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int t = minniEn(a, 0, a.length - 1, 6);        
        System.out.println(t); // prentast 5        
        t = minniEn(a, 0, a.length - 1, 2);        
        System.out.println(t); // prentast 1        
        int t1 = minniEn(a, 0, a.length - 1, 3);        
        System.out.println(t1);
    }   
    

    /**
     * fall sem notar helmingunarleit til þess að finna hversu mörg stök í röðuðu fylki a,
     * á bilinu frá og með i að og með j, eru minni en talan tala
     * @param a raðað heiltölufylki
     * @param i index úr a, lægra en j
     * @param j index úr a, stærra en i
     * @param tala heiltala sem miðað er við
     * @return fjölda staka sem eru minni en tala
     */
    public static int minniEn(int[] a, int i, int j, int tala) {
        if (j < i) return 0;
        int k = (i+j) >>> 1;
        if (a[k] < tala) {
            int fjoldi = 0;
            for (int u = i; u < j; u++) {
                fjoldi++;
                // System.out.println(fjoldi);
            }
            if (i==j) fjoldi++;
            return fjoldi;
        }
        return minniEn(a, i, k-1, tala);
    }
}
