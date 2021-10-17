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
        int[] atkvaedi = {48708,34501,25114,19825,17672,17233,16628,10879};
        int[] thingmenn = {16,13,6,5,6,3,3,2};
        
        double[][] lokatolur = landstolur(atkvaedi,thingmenn);
        for (int i = 0; i < lokatolur.length; i++) {
            System.out.println(Arrays.toString(lokatolur[i]));
            System.out.println();
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
