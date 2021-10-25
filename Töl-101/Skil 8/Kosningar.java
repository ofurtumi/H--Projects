/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 17:49
 * @ Lýsing: 	Inniheldur tvö föll flokkarJofnun, sem tekur inn tvívítt komutölufylki með landstölum
 *              og fylki með bókstöfum tilheyrandi flokka og reiknar út jafnaðarþingmenn, landstölur sem er 
 *              gamalt úr skilaverkefni 7 og reiknar út landstölur út frá atkvæðafjölda og þingmannafjolda.
 *              Auk þeirra er main fall sem prófar föllin með niðurstöðum úr kosningum 2007 og 2021
 */

import java.util.Arrays;

public class Kosningar {
    public static void main(String[] args) {
        String[] flokkar2021 = {"D", "B", "V", "S", "G", "P", "C", "M" };
        int[] atkvaedi2021 = {48708,34501,25114,19825,17672,17233,16628,10879};
        int[] thingmenn2021 = {16,13,6,5,6,3,3,2};
        double[][] l2021 = landstolur(atkvaedi2021, thingmenn2021);
        String[] jofnun2021 = flokkarJofnun(l2021, flokkar2021);
        System.out.println("kosningar 2021: " + Arrays.toString(jofnun2021));
        
        String[] flokkar2009 = {"B","D","O","S","V"};
        int[] atkvaedi2009 = {27699,44371,13519,55758,40581};
        int[] thingmenn2009 = {9,14,3,16,12};
        double[][] l2009 = landstolur(atkvaedi2009, thingmenn2009);
        String[] jofnun2009 = flokkarJofnun(l2009, flokkar2009);
        System.out.println("kosningar 2009: " + Arrays.toString(jofnun2009));
    }

    /**
     * Tekur inn tvívítt kommutölufylki sem inniheldur landstölur og einvítt strengjafylki sem inniheldur
     * bókstafi tilheyrandi flokka, finnur svo 9 hæstu landstölurnar og tilheyrandi flokk og skrifar 
     * flokksbókstafinn inn í strengjafylki sem er svo skilað
     * 
     * @param double[][] tvívítt kommutölufylki sem inniheldur landstölur
     * @param String[] einvítt strengjafylki sem inniheldur flokksbókstafi
     * @return String[] strengjafylki sem inniheldur flokksbókstafi sem samsvara jafnaðarþingmenn
     */
    public static String[] flokkarJofnun(double[][] l, String[] flokkar) {
        int n = l.length;
        int m = flokkar.length;

        double[][] landsogindex = new double[n*m][2];
        double[] lands = new double[n*m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                
                landsogindex[i*m+j][0] = l[i][j];
                landsogindex[i*m+j][1] = j;
                lands[i*m+j] = l[i][j];
            }
        }

        Arrays.sort(lands);
        int landslenght = lands.length;

        double[] landsMax = new double[9];
        for (int i = 0; i < 9; i++) {
            landsMax[i] = lands[landslenght-1-i];
        }


        String[] landsOut = new String[9];

        for (int i = 0; i < landsogindex.length; i++) {
            for (int j = 0; j < landsMax.length; j++) {
                if (landsogindex[i][0] == landsMax[j]) {
                    landsOut[j] = flokkar[(int)landsogindex[i][1]];
                }
            }
        }

        return landsOut;
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
