/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-19-09 11:39:18
 * @ Lýsing: 	Tekur inn eitt gildi og reiknar út hæsta punkt grafs með Newton-Raphson aðferðinni út frá því
 */

public class Max {
    public static void main(String[] args) {
        double m = Math.abs(Double.parseDouble(args[0]));
        double xn = 0.0;
        double fMerktX = -56.0;
        double fTvimerktX = -20.0;
        double xnPlus1 = xn - (fMerktX/fTvimerktX);
        double dx = xnPlus1-xn;
        while (Math.abs(dx) > m) {
            xn = xn + dx;
            fMerktX = 9*Math.pow(xn, 2)-20*xn-56;
            fTvimerktX = 18*xn-20;
            xnPlus1 = xn - (fMerktX/fTvimerktX);
            dx = xnPlus1-xn;
        }

        System.out.println("xn er " + xn);


    }
}