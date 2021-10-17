/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-17-10 13:52
 * @ Lýsing: 	Tekur inn heiltölu n af skipanalínu og tekur svo inn ótilgreindan fjölda heiltalna
 *              sem eru síðan notaðar til þess að finna stærstu heiltölu sem er minni en n
 *              Ef sú tala er til, prentar hana út ásamt smá texta, ef hún er ekki til prentar, "Engin tala minni en n"
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MaxBelow {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Scanner s = new Scanner(System.in,StandardCharsets.UTF_8);

        int staersta = 0;
        boolean erTil = false;
        while (s.hasNext()) {
            int temp = s.nextInt();
            if (temp < n && temp > staersta) {
                staersta = temp;
                erTil = true;
            }
        }

        if (erTil) {
            System.out.println("stærsta tala minna en " + n + " er " + staersta);
        }
        else {
            System.out.println("Engin tala minni en " + n);
        }
    }

}
