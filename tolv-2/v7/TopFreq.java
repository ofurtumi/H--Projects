import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import edu.princeton.cs.algs4.ST;

public class TopFreq {

    public static void ArrayImp(Scanner s, int k, int N) {
        List<String> words = new ArrayList<String>(); // frumstilli strengjalista til að taka við inntaki

        // while lykkja sem sér um að taka inn strengi af staðalinntakinu
        while (s.hasNext()) {
            String word = s.next();
            if (word.length() >= k) { // ef orð er ekki jafnlangt eða lengra en k skiptir það ekki máli
                words.add(word);
            }
        }
        s.close(); // loka s, ég er svo góður foritari :) :)

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
            if (wordsArray[i].equals(wordsArray[i - 1]))
                counter++; // telur upp ef tvö í röð
            else {

                // stoltur af þessari þótt hún sé ekki flókin
                for (int j = 0; j < ord.length; j++) {
                    if (fjoldi[j] < counter) { // ef counterinn er hærri en minnsta stak í output fylkinu
                        fjoldi[j] = counter; // skiptu því gildi út
                        ord[j] = wordsArray[i - 1]; // og líka orðinu sem á við
                        break; // stakið sem er fundið er alltaf minnst verður out listinn því í minnkandi röð
                    }
                }
                counter = 1; // núllstilla?? nei, einstilla!!
            }
        }

        for (int i = 0; i < ord.length; i++) {
            StdOut.println(ord[i] + " " + fjoldi[i]);
        }
    }

    public static void HashImp(Scanner s, int k, int N) {

        ST<String, Integer> st = new ST<String, Integer>();

        while (s.hasNext()) { // Build symbol table and count frequencies.
            String word = s.next();
            if (word.length() < k)
                continue; // Ignore short keys.
            if (!st.contains(word))
                st.put(word, 1);
            else
                st.put(word, st.get(word) + 1);
        }
        // Find a key with the highest frequency count.
        for (int i = 0; i < N; i++) {
            String max = "";
            st.put(max, 0);
            for (String word : st.keys())
                if (st.get(word) > st.get(max))
                    max = word;
            StdOut.println(max + " " + st.get(max));
            st.delete(max);
        }
    }

    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        Scanner s = new Scanner(System.in, "utf-8");

        Stopwatch time = new Stopwatch();
        // ArrayImp(s, k, N);
        HashImp(s, k, N);
        double elapsed = time.elapsedTime();
        System.out.println(elapsed);

        // áhugaverð og einföld útfærsla á þessu öllu:
        // cat tale.txt | tr " " "\n" | sort | uniq -c | sort -nr | head -100 | less
    }
}
