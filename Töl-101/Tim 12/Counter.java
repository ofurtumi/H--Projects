public class Counter {
    private final String nafn;
    private final int efriMork;
    private int tala;

    /**
     * Býr til Counter hlut
     * @param n String nafn á counter
     * @param eM int efri mörk counters
     */
    public Counter(String n, int eM) {
        nafn = n;
        efriMork = eM;
        tala = 0;
    }
    
    /**
     * Hækkar gildið á tala um 1 ef tala er minni en efri mörk
     */
    public void increment() {
        if (tala < efriMork) tala++;
    }

    /**
     * Skilar private gildinu tala
     * @return int tala
     */
    public int value() {
        return tala;
    }

    public String toString() {
        return nafn + ": " + tala;
    }

    public static void main(String[] args) {
        Counter a = new Counter("A", 10);
        for (int i = 0; i < 15; i++) {
            a.increment();
            System.out.println(a.toString());
        }

        
    }
}
