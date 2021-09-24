/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-19-09 14:00:35
 * @ Lýsing: 	Tekur inn jákvæða heiltölugildið lengd og prentar út tölu og fjölda myllumerkja sem
 *              samsvara tölunni
 */

public class Myllur {
    public static void main(String[] args) {
        int lengd = Integer.parseInt(args[0]);
        System.out.println("Myllurnar");
        for (int i = 1; i <= lengd; i++) {
            System.out.print(i);
            for (int u = 1; u <= i; u++) {
                System.out.print("#");
            }
        }
        System.out.println();
    }    
}
