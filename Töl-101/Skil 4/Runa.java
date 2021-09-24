/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-18-09 16:28:38
 * @ Lýsing: 	Tekur inn eitt heiltölugildi, lengd, og prentar út bitarunu af lengd lengd ásamt
 *              heildargildi rununar
 */

public class Runa {
    public static void main(String[] args) {
        try {
            int tala = Integer.parseInt(args[0]);
            int summa = 0;
            for (int i = 1; i <= Math.abs(tala); i++) {
                if (tala%i==0) {
                    System.out.print(1);
                    summa++;
                }
                else System.out.print(0);
            }
            System.out.println();
            System.out.println(summa);
        } catch (Exception e) {
            System.out.println("Ólöglegt inntak");
        }
    }
}
