public class Circle extends Shape{
    public Circle(double w) {
        setWidth(w/2);
    }

    public double getArea() {
        double area = Math.PI*Math.pow(getWidth(), 2);
        return area;
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.printf("%5.2f %n", c.getArea());
    }
}
