public class Einkunn {
    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }

    public Einkunn(double m, int l) {
        double maeting = m;
        int lagmark = l;
    }

    private boolean erLoglegt(double m) {

    }

    public int getLokaprof() {

    }

    public void setLokaprof() {

    }

    public void setMaetingHlutfall(double m) {

    }

    public double getMaetingHlutfall() {

    }

    public boolean erLagmarkseinkunn() {

    }
}
