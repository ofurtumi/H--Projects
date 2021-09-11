/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-11-09 15:12:24
 * @ Lýsing: 	Tekur inn þrjú gildi frá skipanalínu, stefnu bíls 1, akgrein bíls 2, fjarlægð bíliana og segir til um hvort bíll sé í hættu
 */

public class Vari {
    public static void main(String[] args) {
        char b1 = args[0].charAt(0);
        char b2 = args[1].charAt(0);
        int f = Integer.parseInt(args[2]);

        if (Math.abs(f) >= 4) System.out.println("Engin hætta: of langt í burtu");

        else if (b1 != b2) System.out.println("Engin hætta: stefna ekki á sömu akgrein");
        else {
            switch (b1) {
                case 'H':
                    System.out.println("Varúð til hægri");
                    break;
                
                case 'V':
                    System.out.println("Varúð til vinstri");
                    break;
            
                default:
                    break;
            }
        }
    }
}
