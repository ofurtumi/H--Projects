/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-01-11 08:57
 * @ Lýsing: 	inniheldur tvö föll, main til þess að testa og f sem skilar fibonacci streng út frá gefnum gildum
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Test: "+f('x', 'y', n));
    }

    /**
     * Fall sem skrifar út fibonacci streng út frá gefnum char gildum ásamt fjölda aðgerða
     * @param a fyrra char gildi
     * @param b seinna char gildi
     * @param n fjöldi aðgerða sem á að taka
     * @return strengur sem samanstendur af char gildunum lagt við hvort annað
     */
    public static String f(char a, char b, int n) {
        if (n == 0) return ""+a;
        if (n == 1) return ""+b;
        return ""+f(a, b, n-1) + f(a, b, n-2);
    }
}