/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-10-10 17:48
 * @ Lýsing: 	Fallið stjarna tekur inn heiltölu n og skilar streng af stjörnum með lengdina n
 */

public class Stjornur {
    public static String stjarna(int n) {
        String stjarnaOut = "";
        for (int i = 0; i < n; i++) {
            stjarnaOut += "*";
        }
        return stjarnaOut;
    }
    public static void main(String[] args) {
        System.out.println(stjarna(10));
    }
}
