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
        double[][] tingmennData = new double[9][2];

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < flokkar.length; j++) {
                if (l[i][j] > tingmennData[0][0]) {
                    for (int u = 0; u < 9; u++) {
                        if (l[i][j] < tingmennData[u][0]) {
                            for (int x = 0; x<u-2;x++) {
                                tingmennData[x] = tingmennData[x+1];
                            }
                            tingmennData[u-1][0] = l[i][j];
                            tingmennData[u-1][1] = j;
                        }
                    }
                }
            }
        }
        String[] tingmenn = new String[9];
        for (int i = 0; i < tingmennData.length; i++) {
            tingmenn[i] = flokkar[(int)tingmennData[i][1]];
        }
        return tingmenn;
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
