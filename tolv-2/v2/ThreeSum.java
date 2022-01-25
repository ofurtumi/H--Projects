import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        StdRandom.setSeed(42069);
        int N = Integer.parseInt(args[0]);
        int a[] = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 101);
        }
        int cnt = 0;
        Stopwatch s = new Stopwatch();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++)
                    if (i < j && j < k)
                        if (a[i] + a[j] + a[k] == 0)
                            cnt++;
        double t = s.elapsedTime();
        System.out.println(cnt);
        System.out.println("Time: " + t);
    }    
   }
