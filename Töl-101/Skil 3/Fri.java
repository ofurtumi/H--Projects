/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-11-09 13:29:04
 * @ Lýsing: 	Tekur inn staf af skipanalínu, stafirnir sem koma til greina eru M Þ I F Ö S L
 *              forritið prentar svo út Virkur dagur eða Helgi eftir því hvaða stafur er
 */

public class Fri {
    public static void main(String[] args) {
        char dagur = args[0].charAt(0);

        switch (dagur) {
            case 'M': case (char)222: case 'I': case 'F': case (char)214:
                System.out.println("Virkur dagur");
                break;
            
            case 'S': case 'L':
                System.out.println("Helgi");
                break;
        
            default:
                System.out.println("Villa í inntaki");
                break;
        }
    }
}
