import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(-10,10);
        double x1 = 11.0;
        double x2 = 11.0;
        double y1 = 11.0;
        double y2 = 11.0;

        ArrayList<Double> hnit = new ArrayList<Double>();
        while (true) {
            if (StdDraw.isKeyPressed(KeyEvent.VK_1)) {
                x1 = StdDraw.mouseX();
                y1 = StdDraw.mouseY();

                while (!StdDraw.isKeyPressed(KeyEvent.VK_2)) {
                    x2 = StdDraw.mouseX();
                    y2 = StdDraw.mouseY();
                    StdDraw.clear();
                    for (int i = 0; i<hnit.size(); i=i+4) {
                        StdDraw.line(hnit.get(i), hnit.get(i+1), hnit.get(i+2), hnit.get(i+3));
                    }
                    StdDraw.line(x1, y1, x2, y2);
                    StdDraw.show();
                }
                hnit.add(x1);
                hnit.add(y1);
                hnit.add(x2);
                hnit.add(y2);
            }
        }
    }
}
