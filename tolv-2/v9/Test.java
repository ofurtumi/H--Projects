import java.util.Scanner;

import edu.princeton.cs.algs4.BST;
import edu.princeton.cs.algs4.LinearProbingHashST;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.SeparateChainingHashST;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "utf-8");
        // BST<String,Integer> words = new BST<String,Integer>();
        // RedBlackBST<String,Integer> words = new RedBlackBST<String,Integer>();
        // SeparateChainingHashST<String,Integer> words = new SeparateChainingHashST<String,Integer>();
        LinearProbingHashST<String,Integer> words = new LinearProbingHashST<String,Integer>();

        int i = 0;
        while (s.hasNext()) {
            String word = s.next();
            // System.out.println(i + " " + word);
            words.put(word,i);
            i++;
        }
        s.close(); // loka s, ég er svo góður foritari :) :)
        for (int j = 0; j < 10; j++) {
            Stopwatch time = new Stopwatch();
            
            double t = time.elapsedTime();
            System.out.printf("BST time: %.3f\n",t);
        }
    }    
}
