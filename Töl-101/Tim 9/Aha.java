/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 11:19
 * @ Lýsing: 	inniheldur tvö föll, endurkvæma fallið aha sem tekur inn tvær heiltölur og skilar heiltölu
 *              sem segir til um hversu oft það þurfti að endurtaka fallið til þess að önnur talan yrði 0
 *              , og main fallið sem sér um að prófa aha
 */

public class Aha {
    public static void main(String[] args) {
        System.out.println("aha(8,2): " + aha(8, 2));
        System.out.println("aha(6,2): " + aha(6, 2));
        System.out.println("aha(4,2): " + aha(4, 2));
        System.out.println("aha(2,2): " + aha(2, 2));
        System.out.println("aha(2,2): " + aha(0, 2));
    }    

    /**
     * fallið aha tekur inn tvær heiltölur, a og b, og framkvæmir endurkvæmingu sem kallar á 
     * fallið aftur nema þar sem a er orðið a-b, þetta er gert þangað til að a er minna en b
     * þá skilar fallið 0 og byrjar að vinna sig aftur til baka, þar sem það telur fjölda 
     * aðgerða sem tók til þess að enda með 0
     * @param a jákvæð heiltala 
     * @param b jákvæð heiltala
     * @return fjölda aðgerða sem það tók til þess að skila 0
     */
    public static int aha(int a, int b) {
        System.out.println(a + " " + b);
        if (a < b) return 0;
        return 1+aha(a-b,b);
    }
}
