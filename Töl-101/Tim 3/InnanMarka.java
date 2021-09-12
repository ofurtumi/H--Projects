/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-12-09 11:03:12
 * @ Lýsing: 	Tekur inn heiltölu af skipanalínu og segir hvort 
 *              hún sé innan eða utan markana [5,50]
 */

public class InnanMarka {
    public static void main(String[] args) {
    try {
        int tala = Integer.parseInt(args[0]);
        if (tala >= 5 && tala <= 50) System.out.println("Innan marka");
        else System.out.println("Utan marka");
        
        } catch (Exception e) {
            System.out.println("Ekki heiltala");
        }
    }
}
