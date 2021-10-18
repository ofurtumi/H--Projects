public class Test {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdDraw.enableDoubleBuffering();

        for (int i = 0; i < N; i++) {
            double x = StdRandom.gaussian(-1.0,1.0);
            double y = StdRandom.gaussian(-1.0,1.0);

            int r = (int)StdRandom.gaussian(0,200);
            int g = (int)StdRandom.gaussian(0,200);
            int b = (int)StdRandom.gaussian(0,200);

            // StdDraw.setPenColor(r,g,b);
            StdDraw.point(x, y);

            if (i % 100 == 0) {
                StdDraw.show();
            }
        }
    }
}
