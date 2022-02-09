import edu.princeton.cs.algs4.Merge;

public class Triplicate {
    public static String triplicate(String[] a, String[] b, String[] c) {
        Merge.sort(a);
        Merge.sort(b);
        Merge.sort(c);

        for (int i = 0; i < a.length; i++) {
            int lo = 0;
            int hi = b.length - 1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (a[i].compareTo(b[mid]) < 0)
                    hi = mid - 1;
                else if (a[i].compareTo(b[mid]) > 0)
                    lo = mid + 1;
                else {
                    int l = 0;
                    int h = c.length - 1;
                    while (l <= h) {
                        int m = (l + h) / 2;
                        if (a[i].compareTo(c[m]) < 0) {
                            h = m - 1;
                        }
                        else if (a[i].compareTo(c[m]) > 0) {
                            l = m + 1;
                        }
                        else {
                            return a[i];
                        }
                    }
                    break;
                }

            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] a = { "oli", "joi", "stebbi", "stjani" };
        String[] b = { "jenny", "stjani", "loa" };
        String[] c = { "aaa" };

        // Stopwatch s1 = new Stopwatch();
        System.out.println(triplicate(a, b, c));
        // double t1 = s1.elapsedTime();
        // System.out.println(t1);
    }
}