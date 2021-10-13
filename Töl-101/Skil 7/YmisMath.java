/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-13-10 08:50
 * @ Lýsing: 	Fallið sigmoid tekur inn eina kommutölu og notar hana í stærðfræðifallið "Sigmoid function"
 *              og skilar útkomunni úr því
 */

public class YmisMath {
    public static double sigmoid (double x) {
        double safx = 1/(1+Math.pow(Math.E, -x));
        return safx;
    }
    public static void main(String[] args) {
        Double x = -6.0;
        for (int i = 1; i <= 25; i++) {
            System.out.println("S(" + x +") = " + sigmoid(x));
            x = x+0.5;
        }
    }    
}
