public class Einkunn {
    private double maetingHlutfall ;
    private int lokaprof;

    public Einkunn(double m, int l) {
        if (erLoglegt(m)) maetingHlutfall = m;
        else maetingHlutfall = 0.0;
        lokaprof = l;
    }
    
    private boolean erLoglegt(double m) {
        if (m > 0.0 && m <= 1.0) return true;
        return false;
    }
    
    public int getLokaprof() {
        return lokaprof;
    }
    
    public void setLokaprof(int l) {
        this.lokaprof = l;
    }
    
    public void setMaetingHlutfall(double m) {
        if (erLoglegt(m)) this.maetingHlutfall = m;
    }
    
    public double getMaetingHlutfall() {
        return maetingHlutfall;
    }
    
    public boolean erLagmarkseinkunn() {
        if (lokaprof >= 5) return true;
        return false;
    }

    public static void main(String[] args) {
        Einkunn e = new Einkunn(0.5, 6);
        System.out.println(e.getMaetingHlutfall());
        e.setLokaprof(3);
        System.out.println(e.getLokaprof());
        e.setMaetingHlutfall(2.0);
        System.out.println(e.getMaetingHlutfall());
        System.out.println("einkunn er fyrir ofan lágmarkseinkunn? " + e.erLagmarkseinkunn());

        Einkunn e2 = new Einkunn(-0.3, 10);
        System.out.println(e2.getMaetingHlutfall());
    }
}
