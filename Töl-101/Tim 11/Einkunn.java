public class Einkunn {
    private double maeting;
    private int lokaprof;

    public Einkunn(double m, int l) {
        double maeting = m;
        int lokaprof = l;
    }
    
    private boolean erLoglegt(double m) {
        if (m >= 0.0 && m <= 1.0) return true;
        return false;
    }
    
    public int getLokaprof() {
        return lokaprof;
    }
    
    public void setLokaprof(int l) {
        this.lokaprof = l;
    }
    
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m)) this.maeting = m;
    }
    
    public double getMaetingHlutfall() {
        return maeting;
    }
    
    public boolean erLagmarkseinkunn() {
        if (lokaprof >= 5) return true;
        return false;
    }

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
}
