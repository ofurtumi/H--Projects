import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Tekk {
    public static String tekk() {
        Scanner s = new Scanner(System.in,StandardCharsets.UTF_8);
        String tempString = "";
        int counter = 0;
        int tempIndex = 0;
        int misstiCounter = 0;

        while (s.hasNext()) {
            tempString += s.next()+",";
        }
        String[] out = tempString.split(",");

        for (int i = 0; i < out.length; i++) {
            if (out[i].equals("missti")) {
                counter++;
                misstiCounter++;
            }
            else if (i != 0 && out[i-1].equals("missti")) {
                if (Integer.parseInt(out[i]) == tempIndex+misstiCounter) return "Gölluð";
                else {
                    counter++;
                    misstiCounter = 0;
                }
            }
            else {
                counter++;
                tempIndex = Integer.parseInt(out[i]);
            }
        }

        return Integer.toString(counter);
    }

    public static void main(String[] args) {
        System.out.println(tekk());
    }
}
