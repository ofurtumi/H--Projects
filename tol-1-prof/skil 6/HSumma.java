import java.util.Scanner;

public class HSumma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int[][] arr = new int[n][n];
        int tempnum = 0;
        int outnum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempnum = s.nextInt();
                if (j == n-1-i) {
                    outnum += tempnum;
                }
            }
        }
        System.out.println(outnum);
    }
}