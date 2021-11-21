/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-21-11 17:35
 * @ Lýsing: 	inniheldur fallið tekk, sem hefur sína eigin javadoc lýsingu og main fall sem kallar einu sinni á tekk
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Tekk {

    /**
     * Tekur inn streng af staðalinntaki, splittar honum til þess að hægt sé að vinna með hann sem fylki
     * telur hversu mörg stök eru í fylkinu, ef stak er "missti" telur það líka telur það fjölda "missti"
     * strengja í röð til þess að hægt sé að sjá hvort réttu mynsturfari sé fylgt
     * @return fjölda kúnna og "Gölluð" ef mynsturfar er rangt
     */
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
