/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-10 23:20
 * @ Lýsing: 	Tekur inn tvö gildi, radíus hrings og hallatölu í gráðum, og teiknar
 *              "bannað að leggja" skilti eftir þeim leiðbeiningum
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
import java.awt.event.KeyEvent;


public class LeggjaAnim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        
        double rad = s.nextDouble();
        int halli = s.nextInt();
        double halliRad;
        
        StdDraw.enableDoubleBuffering();
        while (true) {
            while (!(StdDraw.isKeyPressed(KeyEvent.VK_1))) {
                halli += 1;
                halliRad = Math.toRadians(halli);
                double x1 = (1-1-rad+0.1*rad)*Math.cos(halliRad) - 0*Math.sin(halliRad);
                double y1 = 0*Math.cos(halliRad) + (1-1-rad+0.1*rad)*Math.sin(halliRad);
        
                double[] x = {x1,-x1};
                double[] y = {y1,-y1};
                
                StdDraw.clear();
    
                StdDraw.setScale(-1,1);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledCircle(0, 0, rad);
                StdDraw.setPenColor(StdDraw.BLUE);
                StdDraw.filledCircle(0, 0, 0.9*rad);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.setPenRadius(0.05*rad);
                StdDraw.polygon(x, y);
    
                StdDraw.show();
                StdDraw.pause(10);
    
            }
        }
    }    
}
