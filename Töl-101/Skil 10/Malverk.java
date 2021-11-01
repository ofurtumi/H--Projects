import java.awt.Color;
import java.util.Arrays;

public class Malverk {
    public static void main(String[] args) {
        // Color[][] litir1 = mala(5, 5, 0.03, 100);
        // for (int i = 0; i < litir1.length; i++) {
        //     System.out.println(Arrays.toString(litir1[i]));
        // }

        Color[][] litir2 = mala(5, 10, 0.03, 100);
        for (int i = 0; i < litir2.length; i++) {
            System.out.println(Arrays.toString(litir2[i]));
        }

        // Color[][] litir3 = mala(100, 100, 0.05, 100000);
        // for (int i = 0; i < litir3.length; i++) {
        //     System.out.println(Arrays.toString(litir3[i]));
        // }
    }    

    /**
     * 
     * @param n
     * @param m
     * @param breidd
     * @param tilraunir
     * @return
     */
    public static Color[][] mala(int n, int m, double breidd, int tilraunir) {
        Color[][] colorOutArray = new Color[n][m];

        for (int i = 0; i < tilraunir; i++) {
            int nTala = StdRandom.uniform(0, n);
            int mTala = StdRandom.uniform(0, m);

            if (colorOutArray[nTala][mTala] == null) {

                int r = StdRandom.uniform(256);
                int g = StdRandom.uniform(256);
                int b = StdRandom.uniform(256);
    
                Color c = new Color(r,g,b);

                colorOutArray[nTala][mTala] = c;
            }
        }

        for (int i = 0; i < colorOutArray.length; i++) {
            for (int j = 0; j < colorOutArray[i].length; j++) {
                if (colorOutArray[i][j] == null) {
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.filledSquare(i, j, breidd);
                    // StdDraw.pause(10);
                }
                else {
                    StdDraw.setPenColor(colorOutArray[i][j]);
                    StdDraw.filledSquare(i*breidd+breidd/2, j*breidd+breidd/2, breidd/2);
                    // StdDraw.pause(10);
                }
            }
        }

        return colorOutArray;
    }
}
