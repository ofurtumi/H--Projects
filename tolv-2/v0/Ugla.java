import edu.princeton.cs.algs4.StdDraw;
import java.awt.Font;

public class Ugla {
    public static void main(String args[]) {
        Font font = new Font("Arial", Font.BOLD, 25);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.6, "Ég heiti Þorvaldur Tumi Baldursson");
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.text(0.5, 0.4, "og netfangið mitt er ttb3@hi.is");
    }
}