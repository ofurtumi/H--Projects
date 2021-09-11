/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-11-09 14:49:16
 * @ Lýsing: 	Tekur inn heiltölu sem er loftgæði og segir til um hvort þau séu góð eða vond
 */

public class LoftG {
    public static void main(String[] args) {

        try {
            int tala = Integer.parseInt(args[0]);
            
            if (tala < 0) System.out.println("Sláðu inn jákvæða heiltölu");

            else if (tala <= 350) System.out.println("Góð"); 
            
            else if (tala > 350) System.out.println("Ekki góð");  
        } catch (NumberFormatException e) {
            System.out.println("Ólöglegt inntak - Sláðu inn heiltölu");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vantar inntak - Sláðu inn heiltölu");
        }

        
    }
}
