/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 14:09
 * @ Lýsing: 	klasinn inniheldur tvö föll, margfoldun, sem notar endurkvæmni til þess að finna margfeldi tveggja
 *              heiltalna, og main sem er notað til þess að prufa margfoldun fallið
 */

public class Reiknivel {
    public static void main(String[] args) {
        System.out.println(" 0 *  0 = " + margfoldun(0, 3));
        System.out.println(" 3 *  0 = " + margfoldun(0, 3));
        System.out.println(" 0 *  3 = " + margfoldun(0, 3));
        System.out.println(" 1 *  3 = " + margfoldun(1, 3));
        System.out.println(" 2 *  3 = " + margfoldun(2, 3));
        System.out.println(" 3 *  3 = " + margfoldun(3, 3));
        System.out.println(" 4 *  3 = " + margfoldun(4, 3));
        System.out.println(" 5 *  3 = " + margfoldun(5, 3));
        System.out.println("-5 *  3 =" + margfoldun(-5, 3));
        System.out.println("-5 * -3 = " + margfoldun(-5, -3));
        System.out.println(" 5 * -3 =" + margfoldun(5, -3));
    }

    /**
     * fall sem notar endurkvæmni til þess að finna margfeldi tveggja heiltalna
     * @param a heiltala
     * @param b heiltala
     * @return margfeldi a og b
     */
    public static int margfoldun(int a, int b) {
        // System.out.println(a);
        if (a == 0) return 0;
        else if (a < 0) return -b + margfoldun(a+1, b);
        return b + margfoldun(a-1, b);
    }
}