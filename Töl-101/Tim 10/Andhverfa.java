/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-31-10 17:08
 * @ Lýsing: 	inniheldur tvö föll, main til að testa og andhverfa sem hefur sína eigin javadoc lýsingu
 */

import java.awt.Color;

public class Andhverfa {
    public static void main(String[] args) {
        Color testColor = new Color(10,20,30);
        System.out.println(testColor);
        
        System.out.println(andhverfa(testColor));
    }

    /**
     * Tekur inn hlut af týpunni color og skilar lit með 255 - inntakið í tilheyrandi stöðum
     * @param c hlutur af gerðinni java.awt.Color
     * @return hlutur af gerðinni java.awt.Color með 255 - c í réttum stöðum
     */
    public static Color andhverfa(Color c) {
        Color tempColor = new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
        return tempColor;
    } 
}
