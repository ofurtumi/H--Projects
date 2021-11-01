/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-31-10 17:20
 * @ Lýsing: 	inniheldur tvö föll, main fall til að testa og skiptaUt sem er með 
 *              sína eigin javadoc lýsingu
 */

public class Strengjavinnsla {
    public static void main(String[] args) {
        String s = "Tumi er lang lang bestur!";
        String u = "er";
        String v = "er ekki";

        System.out.println(skiptaUt(s, u, v));
    }   
    
    /**
     * Tekur inn þrjá strengi og skiptir fyrsta inntaki í öðru inntaki fyrir þriðja inntakið
     * @param s strengur sem á að skipta út
     * @param u strengur sem á að breyta
     * @param v strengur sem á að setja inn í stað s
     * @return strengur u þar sem búið er að skipta s út fyrir v
     */
    public static String skiptaUt(String s, String u, String v) {
        String tempString = s.replace(u, v);
        return tempString;
    }
}
