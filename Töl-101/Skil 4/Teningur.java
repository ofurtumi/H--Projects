/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-09 10:49:07
 * @ Lýsing: 	Tekur inn tvö gildi, fjölda kasta og hliðargildi, og reiknar út hversu oft hliðargildið kemur upp
 */

public class Teningur {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        int output = 0;
        if (h >= 1 && h <= 6) {
            for (int i = 0; i < t; i++) {
                int kast = StdRandom.uniform(1,7);
                // System.out.println(kast);
                if (kast == h) output++;
            }
            
            System.out.println(output);
        }
        else {
            System.out.println("Ólögleg hlið");
        }

    }
}
