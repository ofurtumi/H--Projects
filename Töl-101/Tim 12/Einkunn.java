/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-05-11 13:06
 * @ Lýsing: 	Klasi fyrir Einkunn gagnatagið
 */

public class Einkunn implements Comparable<Einkunn>{
    private double maetingHlutfall ;
    private int lokaprof;

    public Einkunn(double m, int l) {
        if (erLoglegt(m)) maetingHlutfall = m;
        else maetingHlutfall = 0.0;
        lokaprof = l;
    }
    
    /**
     * athugar hvort mætingareinkunn sé "lögleg" þ.e. á milli 0.0 og 1.0
     * @param m double mætingareinkunn
     * @return true ef einkunn er lögleg annars false
     */
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
    
    /**
     * setur nýja mætingareinkunn ef nýja er lögleg
     * @param m double nýja mætingareinkunn
     */
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

    public int compareTo(Einkunn o) {
        if (lokaprof < o.getLokaprof()) return -1;
        if (lokaprof > o.getLokaprof()) return 1;
        if (maetingHlutfall < o.getMaetingHlutfall()) return -1;
        if (maetingHlutfall > o.getMaetingHlutfall()) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Einkunn a = new Einkunn(0.75, 8);
        Einkunn b = new Einkunn(0.75, 9);
        Einkunn c = new Einkunn(0.24, 4);

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(a));
        System.out.println(c.compareTo(b));
    }
}
