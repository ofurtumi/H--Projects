import java.util.Arrays;

public class Kosningar {
    public static void main(String[] args) {
        String[] flokkar2021 = {"D", "B", "V", "S", "G", "P", "C", "M" };
        int[] atkvaedi = {48708,34501,25114,19825,17672,17233,16628,10879};
        int[] thingmenn = {16,13,6,5,6,3,3,2};
        double[][] l2021 = landstolur(atkvaedi, thingmenn);

        String[] jofnun = flokkarJofnun(l2021, flokkar2021);
        System.out.println(Arrays.toString(jofnun));
    }

    public static String[] flokkarJofnun(double[][] l, String[] flokkar) {
        int n = l.length;
        int m = l[0].length;

        double[][] allarLands = new double[n*m][2];

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                allarLands[i*8+j][0] = l[i][j];
                allarLands[i*8+j][1] = j;
            }
        }
        
        double[][] tD = new double[9][2];
        for (int i = 0; i < allarLands.length; i++) {
            for (int j = 0; j < tD.length; j++) {
                if (allarLands[i][0] > tD[n-j][0]) {
                    for (int u = 0; u<n-2-j; u++) {
                        tD[u] = tD[u+1];
                    }

                    tD[n-j] = allarLands[i];
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(Arrays.toString(tD[i]));
        }
        System.out.println();

        System.out.println(n + " " + m);

        // tvívítt fylki sem notar tD[n][0] fyrir landstölu og tD[n][1] fyrir flokka index
        // double[][] tD = new double[9][2]; //tingmennData

        // for (int i = 0; i < l.length; i++) {
        //     //ytra fylki
        //     for (int j = 0; j < l[i].length; j++) {
        //         //innra fylki

        //     }
        // }

        // for (int i = 0; i < l.length; i++) {
        //     for (int j = 0; j < flokkar.length; j++) {
        //         if (l[i][j] > tingmennData[0][0]) {
        //             // System.out.print(l[i][j] + " ");
        //             // System.out.println(tingmennData[0][0]);
        //             for (int u = 0; u < 9; u++) {
        //                 if (l[i][j] < tingmennData[u][0] || tingmennData[u][0] == 0.0) {
                            
        //                     for (int x = 0; x<u-2;x++) {
        //                         tingmennData[x] = tingmennData[x+1];
        //                     }
                            
        //                     if (u == 0) {
        //                         tingmennData[u][0] = l[i][j];
        //                         tingmennData[u][1] = j;
        //                     }
        //                     else {
        //                         tingmennData[u-1][0] = l[i][j];
        //                         tingmennData[u-1][1] = j;
        //                     }
        //                 }
                        
        //                 // else {
        //                 //     System.out.println(l[i][j]);
        //                 //     System.out.println(tingmennData[u][0]);
        //                 //     tingmennData[8][0] = l[i][j];
        //                 //     tingmennData[8][1] = j;

        //                 // }
        //             }
        //         }
        //     }
        // }
        // String[] tingmenn = new String[9];
        // for (int i = 0; i < tingmennData.length; i++) {
        //     tingmenn[i] = flokkar[(int)tingmennData[i][1]];
        // }
        String[] test = {"a","s","s"};
        return test;
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
