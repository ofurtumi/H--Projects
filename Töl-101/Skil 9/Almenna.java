import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Almenna {
    private static int[] a = new int[0];
    private static int[] b = new int[0];
    private static int c = 0;
    private static int d = 0;
    public static void main(String[] args) {
        // dæmi um inntak: 2 0 1 0 0 1
        // væri þá a[0]=2, b[0]=2, a[1]=1, b[1]=0, c=0, d=1
        
        Scanner s = new Scanner(System.in,StandardCharsets.UTF_8);
        String abcd = s.nextLine();
        String xy = s.nextLine();
        
        String[] abcdSplit = abcd.split(" ");
        int n = abcdSplit.length;
        
        a = new int[(n-2)/2];
        b = new int[(n-2)/2];
        int ablength = ((n-2)/2)-1;
        
        for (int i = 0; i < (n-2)/2; i++) {
            a[i] = Integer.parseInt(abcdSplit[i*2]);
            b[i] = Integer.parseInt(abcdSplit[(i*2)+1]);
        }
        c = Integer.parseInt(abcdSplit[n-2]);
        d = Integer.parseInt(abcdSplit[n-1]);
        
        String[] xySplit = xy.split(" ");
        int xyn = xySplit.length;

        int[] xyFylki = new int[xyn];

        for (int i = 0; i < xyn/2; i++) {
            int tempx = xyFylki[i*2];
            int tempy = xyFylki[(i*2)+1];
            int fout = f(tempx,tempy,ablength);
            System.out.println(fout);
        }
    }

    public static int f(int x, int y, int i) {
        // System.out.println("x: "+x+", y: "+y+", i: "+i);
        int out = 0;
        if (x < 0 || y < 0) return d;
        if (i < 0) return c;
        return out + f(x-a[i],y-b[i],i-1);
    }
}
