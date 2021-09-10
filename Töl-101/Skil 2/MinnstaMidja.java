/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-03-09 23:41:44
 * @ Lýsing: 	tekur inn 3 tölur og segir til um hvort miðjutalan sé lægst
 */

public class MinnstaMidja {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean midja =  !(b >= a) && !(b >= c);


        System.out.println("miðjustakið af " + a + "," + b + "," + c + " er minnst:" + midja);
    }    
}
