/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-10 23:20
 * @ Klárað: 	2021-04-10 09:05
 * @ Lýsing: 	Tekur inn tvö gildi, radíus hrings og hallatölu í gráðum, og teiknar
 *              "bannað að leggja" skilti eftir þeim leiðbeiningum
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Leggja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        double rad = s.nextDouble();
        double halli = Math.toRadians(s.nextInt());

        // double x1 = (0+0.05*rad)*Math.cos(halli)-(0+0.9*rad)*Math.sin(halli);
        // double x2 = (0+-0.05*rad)*Math.cos(halli)-(0+0.9*rad)*Math.sin(halli);
        // double x3 = (0+-0.05*rad)*Math.cos(halli)-(0+-0.9*rad)*Math.sin(halli);
        // double x4 = (0+0.05*rad)*Math.cos(halli)-(0+-0.9*rad)*Math.sin(halli);
        // double y1 = (0+0.9*rad)*Math.sin(halli)-(0+0.05*rad)*Math.sin(halli);
        // double y2 = (0+0.9*rad)*Math.sin(halli)-(0+-0.05*rad)*Math.sin(halli);
        // double y3 = (0+-0.9*rad)*Math.sin(halli)-(0+-0.05*rad)*Math.sin(halli);
        // double y4 = (0+-0.9*rad)*Math.sin(halli)-(0+0.05*rad)*Math.sin(halli);

        // double[] x = {x2,x1,x4,x3};
        // double[] y = {y2,y1,y4,y3};

        double x1 = (1-1-rad+0.1*rad)*Math.cos(halli) - 0*Math.sin(halli);
        double y1 = 0*Math.cos(halli) + (1-1-rad+0.1*rad)*Math.sin(halli);

        double[] x = {x1,-x1};
        double[] y = {y1,-y1};

        StdDraw.setScale(-1,1);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(0, 0, rad);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledCircle(0, 0, 0.9*rad);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(0.05*rad);
        StdDraw.polygon(x, y);
    }    
}
