/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-25-09 10:41:22
 * @ Lýsing: 	Tekur inn fjórar heiltölur sem einkunnir með ákveðið vægi
 *              notar svo vægið og einkunnirnar til þess að reikna út lokaeinkunn
 */

public class Lokaeinkunn {
    public static void main(String[] args) {
        int N = args.length;
        int[] einkunn = new int[N];
        int[] vaegi = {10,20,20,50};
        int reiknudEinkunn = 0;
        
        if (N == 4) {
            for (int u = 0; u < 4; u++) {
                einkunn[u] = Integer.parseInt(args[u]);
            }

            for (int i = 0; i < 4; i++) {

                if (einkunn[i] < einkunn[3]) {
                    vaegi[3] += vaegi[i];
                    vaegi[i] = 0;
                }
                
                reiknudEinkunn += einkunn[i]*vaegi[i];
            }
            
            System.out.println(1.0*reiknudEinkunn/100.0);
        }
        else {
            System.out.println("Rangur fjöldi");
        }
    }    
}
