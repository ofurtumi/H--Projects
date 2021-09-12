/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-11-09 12:51:53
 * @ Lýsing: 	Tekur inn heiltölu sem er vindhraði og prentar út skilgreiningu á veðrinu sem fylgir
 */

public class Vindur {
    public static void main(String[] args) {
        int hradi = Integer.parseInt(args[0]);

        if (hradi > 31) System.out.println("Ofsaveður");
        else if (hradi >= 29 && hradi <= 31) System.out.println("Fárviðri");
        else if (hradi >= 24 && hradi <= 28) System.out.println("Rok");
        else if (hradi < 24) System.out.println("Annað");
    }
}