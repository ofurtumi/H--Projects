public class Magic {
    public static void main(String[] args) {
        final int n = 5;
        int square[][] = new int[n][n];
        int row = n / 2;
        int column = (n / 2) + 1;

        for (int i = 1; i <= Math.pow(n, 2); i++) {
            square[row][column] = i;
            ++column;
            --row;

            if (row < 0) row = n - 1;
            if (column == n) column = 0;
                

            if (square[row][column] != 0) {
                ++row;
                ++column;

                if (row == n) row = 0;
                if (column == n) column = 0;
            }
        }

        for (int[] x : square) {
            for (int y : x)
            {
                System.out.print(y + " ");
                if (y<10) System.out.print(" ");

            }
            System.out.println();
        }

    }

}
