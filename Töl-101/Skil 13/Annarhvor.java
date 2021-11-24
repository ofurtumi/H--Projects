/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-21-11 14:36
 * @ Lýsing: 	inniheldur fallið Annarhvor sem hefur sína eigin javadoc lýsingu ásamt main falli til þess að testa
 */

public class Annarhvor {
    /**
     * Tekur inn string og skilar streng sem inniheldur annan hvern staf
     * @param s strengur
     * @return strengur sem inniheldur annan hvern staf í s
     */
    public static String annarhvor(String s) {
        int n = s.length();
        String out = "";
        for (int i = 0; i < n; i+=2) {
            out += s.charAt(i);
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(annarhvor("abcd"));
        System.out.println(annarhvor(""));
        System.out.println(annarhvor("abc"));
    }
}
