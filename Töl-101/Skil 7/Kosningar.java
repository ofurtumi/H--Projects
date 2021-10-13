/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-13-10 08:27
 * @ Lýsing: 	Reiknar út landstölur fyrir kosningar útfrá tveimur gefnum heiltölufylkjum, 
 *              fjölda þingmanna og atkvæði
 */

import java.util.Arrays;

public class Kosningar {
    public static void main(String[] args) {
        int[] atkvaedi = {27699,44371,13519,55758,40581};
        int[] thingmenn = {9,14,3,16,12};
        
        double[][] lokatolur = landstolur(atkvaedi,thingmenn);
        for (int i = 0; i < lokatolur.length; i++) {
            System.out.println(Arrays.toString(lokatolur[i]));
        }
    }

    public static double[][] landstolur(int[] atkvaedi, int[] thingmenn) {
        double[][] utkoma = new double[atkvaedi.length][thingmenn.length];

        for (int i = 0; i < atkvaedi.length; i++) {
            for (int j = 0; j < thingmenn.length; j++) {
                utkoma[i][j] = (double)atkvaedi[j] / (thingmenn[j]+i+1);
            }
        }
        return utkoma;
    }
}
