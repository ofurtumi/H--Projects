public class NutBoltMatch {
    public static void match(Nut[] a, Bolt[] b) {
        sort(a, 0, a.length - 1, b);
    }

    private static void sort(Nut[] a, int lo, int hi, Bolt[] b) {
        if (hi <= lo)
            return;
        int part = partition(a, lo, hi, b[hi]);
        partition(b, lo, hi, a[part]);
        sort(a, lo, part - 1, b);
        sort(a, part + 1, hi, b);
    }

    private static int partition(Nut[] a, int lo, int hi, Bolt v) {
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (a[j].compareTo(v) > 0) {
                switchNuts(a, i, j);
                i++;
            } else if (a[j].compareTo(v) == 0) {
                switchNuts(a, j, hi);
                j--;
            }
        }

        switchNuts(a, i, hi);
        return i;
    }

    private static void switchNuts(Nut[] n, int i, int j) {
        Nut tempNut = n[i];
        n[i] = n[j];
        n[j] = tempNut;
    }

    private static int partition(Bolt[] b, int lo, int hi, Nut v) {
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (v.compareTo(b[j]) < 0) {
                switchBolts(b, i, j);
                i++;
            } else if (v.compareTo(b[j]) == 0) {
                switchBolts(b, j, hi);
                j--;
            }
        }
        switchBolts(b, i, hi);
        return i;
    }

    private static void switchBolts(Bolt[] b, int i, int j) {
        Bolt tempBolt = b[i];
        b[i] = b[j];
        b[j] = tempBolt;
    }

    // ******************************************************************************
    // Hér eru test og testföll ef þau eru ekki commentuð út þá fer autograder í
    // fýlu
    // ******************************************************************************
    
    private static String ts(Nut[] o) {
    String s = "";
    for (Nut n : o) {
    s += n.value + " ";
    }
    return s;
    }

    private static String ts(Bolt[] o) {
        String s = "";
        for (Bolt b : o) {
            s += b.value + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Nut[] a = { new Nut(3), new Nut(1), new Nut(2), new Nut(4), new Nut(5), new Nut(6), new Nut(7), new Nut(8),
                new Nut(9), new Nut(10) };
        Bolt[] b = { new Bolt(4), new Bolt(2), new Bolt(5), new Bolt(1), new Bolt(3), new Bolt(6), new Bolt(10),
                new Bolt(7), new Bolt(8), new Bolt(9) };

        System.out.println(ts(a));
        System.out.println(ts(b));

        match(a, b);

        System.out.println(ts(a));
        System.out.println(ts(b));
    }
}