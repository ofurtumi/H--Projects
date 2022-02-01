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
        int reference = a.length > 0 ? a[0]:0; // ef a er tómt, ekki reyna að finna fyrsta stak
        int refReps = 0;
        int i = 1;
    
        while (i < a.length) {
            if (a[i] == reference) {
                refReps++;
            }
            else if (refReps > 0) {
                refReps++;
                rep += (refReps*(refReps-1))*0.5;
                reference = a[i];
                refReps = 0;
            }
            else {
                reference = a[i];
            }
            i++;
        }

        if (refReps != 0) {
            refReps++;
            rep += (refReps*(refReps-1))*0.5;
        }
        // if (a.length > 2 && a[0] == a[1]) rep++;
        return rep;
    }
}
