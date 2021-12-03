import java.util.Arrays;

public class Fylki {
    public static int[] samtalaFylki(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Test #" + (i+1));
            int f = (int)(1 + Math.random()*5);
            int[] a = new int[f];
            int[] b = new int[f];

            for (int j = 0; j < f; j++) {
                a[j] = (int)(Math.random()*20);
                b[j] = (int)(Math.random()*20);
            }

            int[] c = samtalaFylki(a, b);

            System.out.println("Array a: " +Arrays.toString(a));
            System.out.println("Array b: " +Arrays.toString(b));
            System.out.println("Array c: " +Arrays.toString(c));
        }
    }
}
