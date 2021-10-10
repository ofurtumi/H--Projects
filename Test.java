import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        double eink = Double.parseDouble(args[0]);
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        s.useLocale(Locale.US);
        int fjoldi = 0;
        int heild = 0;

        while(s.hasNext()) {
            double tempEink = s.nextDouble();
            heild++;
            if (tempEink > eink) {
                fjoldi++;
            }
        }
        double prosent = (double)fjoldi / heild*100.0;
        System.out.printf("Fjöldi nemenda sem náðu eru %d sem eru %.1f%% af heildarfjölda nemenda",fjoldi,prosent);
    }   
}
