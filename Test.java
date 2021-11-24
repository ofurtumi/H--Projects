import java.io.Console;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[][] a;
        String[][] b = new String[2][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = ""+i+j;
            }
        }

        a = b;
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(a));
    }
}
