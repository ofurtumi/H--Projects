import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Kosningar {
    public static double[][] landstolur(int[] a, int[] t) {
        double[][] landTOut = new double[a.length][a.length];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                landTOut[i][j] = a[j] / (t[j]+i);
            }
        }

        return landTOut;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        int staerd = s.nextInt();
        int[] atkvaedi = new int[staerd];
        int[] tingmenn = new int[staerd];
        
        int i = 0;
        while (s.hasNext()) {
            atkvaedi[i] = s.nextInt();
            tingmenn[i] = s.nextInt();
        }

        double[][] fylkiOut = landstolur(atkvaedi, tingmenn);
        for (int j = 0;j < fylkiOut.length;j++) {
            System.out.print("1. ");
            for (int u = 0; u < fylkiOut[j].length; u++) {
                System.out.print(fylkiOut[j][u]);
            }
            System.out.println();
        }
    }
}
