import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        StdDraw.setScale(-10,10);
        double x1 = 11.0;
        double x2 = 11.0;
        double y1 = 11.0;
        double y2 = 11.0;
        while (true) {
            if (StdDraw.isKeyPressed(KeyEvent.VK_1)) {
                x1 = StdDraw.mouseX();
                y1 = StdDraw.mouseY();
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_2)) {
                x2 = StdDraw.mouseX();
                y2 = StdDraw.mouseY();

                if (x1 <= 10.0 && x2 <= 10 && y1 <= 10.0 && y2 <= 10) {
                    StdDraw.line(x1, y1, x2, y2);
                    x1 = 11.0;
                    x2 = 11.0;
                    y1 = 11.0;
                    y2 = 11.0;
                }
            }

        }
    }
}
