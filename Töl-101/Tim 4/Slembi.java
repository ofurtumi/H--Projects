/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-20-09 13:07:17
 * @ Lýsing: 	Reiknar út slembitölu á milli 0.0 og 1.0 og skrifar hana út 
 *              þangað til að talan er 0.8 eða stærri
 */

public class Slembi {
    public static void main(String[] args) {
        double x = StdRandom.uniform(0.0,1.0);
        while (x < 0.8) {
            System.out.println(x);
            x = StdRandom.uniform(0.0,1.0);
        }
        
    }
}
