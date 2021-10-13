/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-13-10 08:50
 * @ Lýsing: 	fallið samtalaFylki tekur inn tvö heiltölufylki og skilar öðru
 *              heiltölufylki með stökum sem eru summa inntaksfylkjanna
 */

import java.util.Arrays;

public class Fylki {
    public static int[] samtalaFylki(int[] a, int[] b) {
        int[] fylkiOut = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            fylkiOut[i] = a[i]+b[i];
        }
        return fylkiOut;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {0,4,5,2,7};
        int[] c = new int[0];
        int[] d = new int[0];
        

        System.out.println(Arrays.toString(samtalaFylki(a,b)));
        System.out.println(Arrays.toString(samtalaFylki(c,d)));
    }
}
