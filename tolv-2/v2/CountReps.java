import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class CountReps {
    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        
        Stopwatch s = new Stopwatch();
        int rep = countReps(a);
        double t = s.elapsedTime();
        System.out.println("reps: " + rep);
        System.out.println("time: " + t);
    }

    public static int countReps(int[] a) {
        Arrays.sort(a);
        int rep = 0;
        int reference = a.length > 0 ? a[0]:0;
        int refNR = 0;
        int i = 1;
    
        while (i < a.length) {
            if (a[i] == reference) {
                refNR++;
            }
            else if (refNR > 0) {
                refNR++;
                rep += (refNR*(refNR-1))/2;
                reference = a[i];
                refNR = 0;
            }
            else {
                reference = a[i];
            }
            i++;
        }

        if (refNR != 0) {
            refNR++;
            rep += (refNR*(refNR-1))/2;
        }
        // if (a.length > 2 && a[0] == a[1]) rep++;
        return rep;
    }
}
