/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-09 22:51:04
 * @ Lýsing: 	Tekur inn tvær tölur og reiknar rúmmál og flatarmál sívalnings
 */

public class Sivalningur {
    public static void main(String[] args) {
        Double r = Double.parseDouble(args[0]);
        Double h = Double.parseDouble(args[1]);

        Double area = (2*Math.PI*r*(r+h));
        Double volume = (Math.PI*r*r*h);

        System.out.println("Flatarmál sívalnings með radíus " + r + " og hæð " + h + " er:" + area);
        System.out.println("Rúmmál sívalnings með radíus " + r + " og hæð " + h + " er:" + volume);
    }
}
