import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TopFreq {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        List<String> words = new ArrayList<String>(); // frumstilli strengjalista til að taka við inntaki

        Scanner s = new Scanner(System.in,"utf-8");
            
        // while lykkja sem sér um að taka inn strengi af staðalinntakinu
        while (s.hasNext()) {
            String word = s.next();
            if (word.length() >= k) { // ef orð er ekki jafnlangt eða lengra en k skiptir það ekki máli
                words.add(word);
            }
        }

        // þarf að búa til strengjafylki af stærð listans fyrst 
        // til að geta gert toArray() yfir í strengjafylki frekar en object fylki
        // bara ehv fucky java shit

        String[] wordsArray = new String[words.size()];
        wordsArray = words.toArray(wordsArray); // að nota tilbúna strengjafylkið sem bæði variable og parameter :s
        Arrays.sort(wordsArray);

        int counter = 1;
        int[] fjoldi = new int[N];
        String[] ord = new String[N];

        for (int i = 1; i < wordsArray.length; i++) { // byrja á 1 frekar en 0 til að fá ekki nullpointer exception
            if (wordsArray[i].equals(wordsArray[i-1])) counter++; // telur upp ef tvö í röð
            else {

                // stoltur af þessari þótt hún sé ekki flókin
                for (int j = 0; j < ord.length; j++) {
                    if (fjoldi[j] < counter) {      // ef counterinn er hærri en minnsta stak í output fylkinu
                        fjoldi[j] = counter;        // skiptu því gildi út
                        ord[j] = wordsArray[i-1];   // og líka orðinu sem á við
                        break;
                    }
                }
                counter = 1; // núllstilla?? nei, einstilla!!
            }
        }

        System.out.println((Arrays.toString(ord)));
        System.out.println((Arrays.toString(fjoldi)));

        // áhugaverð og einföld útfærsla á þessu öllu: 
        // java TopFreq 10 10 < tale.txt | tr " " "\n" | sort | uniq -c | sort -nr | head -100 | less
    }
}
