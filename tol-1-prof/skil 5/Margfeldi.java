import java.util.Arrays;

public class Margfeldi {
    public static void main(String[] args) {
        int n = args.length;
        int[] inArr = new int[n];
        int[] outArr = new int[n];

        for (int i = 0; i < n; i++) {
            inArr[i] = Integer.parseInt(args[i]);
        }

        outArr[0] = inArr[n-2] * inArr[n-1];
        outArr[1] = inArr[n-1] * inArr[0];

        for (int i = 2; i < n; i++) {
            outArr[i] = inArr[i-1] * inArr[i-2];
        }

        for (int i : outArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }    
}
