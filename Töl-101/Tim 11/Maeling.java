public class Maeling {
    public static double maelaDouble(int fjoldiSkrefa) {
        Stopwatch timer = new Stopwatch();
        double total = 0;
        for (int i=0; i<fjoldiSkrefa; i++) {
            total += i;
        }
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        System.out.println(maelaDouble(1000000000));
        System.out.println(maelaDouble(100000000));
    }
}
