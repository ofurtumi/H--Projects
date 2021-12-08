import java.util.;

public class Einkunn {
    public static void main(String[] args) {
        double lagmark = Double.parseDouble(args[0]);
        Scanner s = new Scanner(System.in,"utf-8");
        int nemCounter = 0;
        int nadCounter = 0;
        double einkunn = 0;

        while (s.hasNext()) {
            double temp = s.nextDouble();
            if (temp > lagmark) {
                nadCounter++;
            }
            nemCounter++;
            // einkunn += temp;
        }

        double hlutfall = ((1.0*nadCounter)/nemCounter)*100.0;

        System.out.printf("%d nemendur náðu sem er %.1f%%",nadCounter,hlutfall);
    }
}
