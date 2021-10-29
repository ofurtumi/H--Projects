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
        int t = minniEn(a, 0, 5, 6);        
        System.out.println("utkoma: " + t); // prentast 5        
        t = minniEn(a, 0, 5, 2);        
        System.out.println("utkoma: " + t); // prentast 1        
        t = minniEn(a, 0, 5, 3);        
        System.out.println("utkoma: " + t); // prentast 2

        int[] b = {1};
        t = minniEn(b, 0, 0, 2);
        System.out.println("utkoma: " + t);

        t = minniEn(a,4,a.length-1,6);
        System.out.println(t);
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
        int k = (i + j) >>> 1;
        // System.out.println("k: "+k);
        if (j == i && a[k] < tala) return i+1;
        if (a[k] < tala) return minniEn(a, k+1, j, tala);
        if (a[k] > tala) return minniEn(a, i, k-1, tala);
        return k;
    }
}