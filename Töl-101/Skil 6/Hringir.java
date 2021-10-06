/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-04-10 09:07
 * @ Lýsing: 	Teiknar ramma með gildum sem tekin eru inn af skipanalínu, tekur svo inn óþekktan fjölda af
 *              þrískiptum gögnum, xhnit yhnit og radíus, sem eru notuð til að teikna hringi ef þeir passa
 *              inn í rammann
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Hringir {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();

        StdDraw.setScale(-1.0,1.0);
        StdDraw.rectangle((x1+x2)/2, (y1+y2)/2, Math.abs(x1-x2)/2, Math.abs(y1-y2)/2);

        while (s.hasNext()) {
            StdDraw.setPenColor(StdDraw.BLACK);
            double h1 = s.nextDouble();
            double h2 = s.nextDouble();
            double r = s.nextDouble();

            //Ef hringirnir eru rauðir eiga þeir ekki að teiknast út ef þeir eru svartir teiknast þeir út
            //Myndirnar sem fylgja með og eru merktar b eru með rauðu hringjunum en a myndirnar teikna út
            //rétta mynd

            if (h1 - r < x1 && h1 - r > x2 && h1 + r < x1 && h1 + r > x2) StdDraw.circle(h1, h2, r);
            else if (h2 - r < y1 && h2 - r > y1 && h2 + r < y1 && h2 + r > y1) StdDraw.circle(h1, h2, r);
            // else {
            //     StdDraw.setPenColor(StdDraw.RED);
            //     StdDraw.circle(h1, h2, r);
            // }
        }
    }
}
