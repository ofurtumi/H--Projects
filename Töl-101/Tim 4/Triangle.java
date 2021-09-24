/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-20-09 13:13:30
 * @ Lýsing: 	Tekur inn eitt gildi, N, og teiknar út þríhyrning með hæð N
 */

public class Triangle {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int u = 0;
        for (int i = 1; i <= N; i++) {
            for (u = 0;u < i; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
