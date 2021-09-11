/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-11-09 17:33:48
 * @ Lýsing: 	Tekur tvö gildi frá skipanalínu, hámarkshraða og hraða bíls, og reiknar út upphæð sektar sem fylgir
 */

public class ReiknaSekt {
    public static void main(String[] args) {
        double hamarkshradi = Double.parseDouble(args[0]);
        double hradiBils = Double.parseDouble(args[1]);

        if (hradiBils <= hamarkshradi) System.out.println("Engin sekt");
        else if (hamarkshradi <= 30) System.out.println("Sektin er " + (hradiBils-hamarkshradi)*5000 + "kr");
        else if (hamarkshradi <= 60) System.out.println("Sektin er " + (hradiBils-hamarkshradi)*10000 + "kr");
        else if (hamarkshradi > 60) System.out.println("Sektin er " + (hradiBils-hamarkshradi)*15000 + "kr");
    }    
}
 