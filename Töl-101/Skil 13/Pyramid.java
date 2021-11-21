/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-21-11 16:45
 * @ Lýsing: 	býr til hlut af gerð Pyramid sem inniheldur aðferðir til þess að reikna út yfirborðsflatarmál
 *              og rúmmál pýramídans
 */

public class Pyramid extends Shape{
    private double h;

    public Pyramid(double height, double width, double pheight) {
        setHeight(height);
        setWidth(width);
        h = pheight;
    }

    /**
     * reiknar út yfirborðsflatarmál pýramídans í hlutnum
     * @return double yfirborðsflatarmál pýramídans
     */
    public double getArea() {
        double l = getHeight();
        double w = getWidth();
        return l*w+l*Math.sqrt(Math.pow(w/2, 2)+Math.pow(h, 2))+w*Math.sqrt(Math.pow(l/2, 2)+Math.pow(h, 2));
    }

    /**
     * reiknar út rúmmál pýramídans í hlutnum
     * @return double rúmmál pýramídans
     */
    public double getVolume() {
        double l = getHeight();
        double w = getWidth();
        return (l*w*h)/3;
    }

    public static void main(String[] args) {
        Pyramid p = new Pyramid(3.0, 4.0, 2.0);
        System.out.printf("%5.2f %n", p.getArea());
        System.out.printf("%5.2f %n", p.getVolume());
    }
}