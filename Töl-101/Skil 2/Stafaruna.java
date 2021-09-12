/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-09 23:05:24
 * @ Lýsing: 	breytir inntökum í char gildi og prentar þau út
 */

public class Stafaruna {
    public static void main(String[] args) {
        int aTala = Integer.parseInt(args[0]);
        int bil = Integer.parseInt(args[1]);

        char a = (char)aTala;
        char b = (char)(aTala + bil);
        char c = (char)(aTala + 2 * bil);

        System.out.println(""+a+b+a+c+a+b+a);
        
    }
}
