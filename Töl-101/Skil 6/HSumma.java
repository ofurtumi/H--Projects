/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-10 23:09
 * @ Klárað: 	2021-03-10 23:19
 * @ Lýsing: 	Tekur inn eina tölu sem segir til um hæð og breidd tvívíðs fylki og reiknar summu gilda í efra 
 *              hægra horni og neðra vinstri horni
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HSumma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        int N = s.nextInt();
        int[][] a = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = s.nextInt();
            }
        }

        int out = 0;

        for (int j = 0; j < N; j++) {
            out = out + a[j][N-(j+1)];
        }

        System.out.println(out);
    }
}
