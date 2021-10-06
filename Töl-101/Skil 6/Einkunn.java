/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-10 18:24
 * @ Lýsing: 	Reiknar út fjölda og prósentu nemenda sem ná yfir einkunn sem tekin er inn af skipanalínu
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Einkunn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        double eink = Double.parseDouble(args[0]);

        int fjoldiNem = 0;
        int fjoldiNadu = 0;
        while (s.hasNext()) {
            double tempEinkunn = s.nextDouble();
            fjoldiNem++;
            if (tempEinkunn >= eink) {
                fjoldiNadu++;
            }
        }
        // s.close();
        double naduProsent = (100.0*fjoldiNadu) / fjoldiNem;

        System.out.printf("%d nemendur náðu sem er %.1f%%", fjoldiNadu, naduProsent);
    }
}