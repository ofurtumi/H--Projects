/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-04-09 12:19:31
 * @ Lýsing: 	Tekur inn þrjú gildi höfuðstól, nafnvexti 
 *              og fjölda ára og reiknar vaxtavexti
 */

public class Vaxtavextir {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);

        double vextir = p*(Math.pow((1+(i/100)),n)-1);

        System.out.println("Vaxtagreiðslan er:" + vextir);

    }
}
