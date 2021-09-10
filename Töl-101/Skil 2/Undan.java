/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-04-09 11:48:48
 * @ Lýsing: 	tekur inn 2 dagsetningar, dag mánuð og ár, 
 *              tvisvar og prentar út hvort dagsetning 1 sé 
 *              á undan dagsetningu 2
 */

public class Undan {
    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int ar1 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int ar2 = Integer.parseInt(args[5]);

        boolean dagsetningin = (ar1 < ar2) || ((ar1 <= ar2) && (m1 < m2)) || ((ar1 <= ar2) && (m1 <= m2) && (d1 < d2));

        System.out.println("Fyrri dagsetningin er á undan seinni:" + dagsetningin);
    }    
}
