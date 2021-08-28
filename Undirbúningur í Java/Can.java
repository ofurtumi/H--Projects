public class Can {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double u = Double.parseDouble(System.console().readLine("Can circumfrence in cm: ")); //circumfrence of the can in cm
        double h = Double.parseDouble(System.console().readLine("Can height in cm: ")); //height of the can in cm

        double diameterBottom = u/PI;
        double areaBottom = PI*Math.pow((diameterBottom/2),2);
        double areaSides = u*h;
        double areaTotal = 2*areaBottom+areaSides;
        double volume = areaBottom*h;

        System.out.println("Bottom diameter: " + diameterBottom);
        System.out.println("Bottom area: " + areaTotal);
        System.out.println("Side area: " + areaSides);
        System.out.println("Total area: " + areaTotal);
        System.out.println("Volume: " + volume);

    }
}
