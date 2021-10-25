/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 11:33
 * @ Lýsing: 	inniheldur tvö föll, main og printNumber, printNumber skilar streng allra talna frá
 *              gefinni tölu n og að 1, main fallið er bara notað til að prófa printNumber fallið
 */

public class Printnum {
    public static void main(String[] args) {
        System.out.println("n = 0: " + printNumber(0));
        System.out.println("n = 1: " + printNumber(1));
        System.out.println("n = 5: " + printNumber(5));
        System.out.println("n = 10: " + printNumber(10));
        System.out.println("n = 15: " + printNumber(15));
        System.out.println("n = 50: " + printNumber(50));
    }

    /**
     * tekur inn heiltölu n og skilar streng sem inniheldur allar tölur frá n og niður að 1
     * ef talan er minni en einn skilast tómur strengur
     * @param n jákvæð heiltala
     * @return strengur með tölunum n, n-1, n-2,...,2,1
     */
    public static String printNumber(int n) {
        String outString = "";
        if (n < 1) return outString;
        outString =  n + " ";
        return outString + printNumber(n-1);
    }
}