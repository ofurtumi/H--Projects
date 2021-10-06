/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-04-10 18:19
 * @ Klárað: 	2021-04-10 18:33
 * @ Lýsing: 	Tekur inn tvö gildi, neðri og efri, og filterar út tölur sem eru á því bili
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class FilterOut {
    public static void main(String[] args) {
        double nedri = Double.parseDouble(args[0]);
        double efri = Double.parseDouble(args[1]);

        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);

        String out = "";
        double temp = 0;
        while (s.hasNext()) {
            temp = s.nextDouble();
            if (temp < nedri || temp > efri) out = out + temp + " ";
        }

        System.out.println(out);
    }
}
