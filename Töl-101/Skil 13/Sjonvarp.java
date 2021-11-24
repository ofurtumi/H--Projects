/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-11 10:37
 * @ Lýsing: 	Útbýr hlut af tegund sjónvarp sem heldur utan um dagskrá á n mörgum stöðum yfir 0-24 klst
 */

public class Sjonvarp implements SjonvarpSkil {
    private boolean kveikt;
    private final String[][] DAGSKRA;
    private int stod;
    private int klukka;

    public Sjonvarp(String[][] d) {
        int n1 = d.length;
        int n2 = d[0].length;

        this.DAGSKRA = new String[n1][n2];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                this.DAGSKRA[i][j] = d[i][j];
            }
        }
    }

    /**
     * kveikir ef það er slökkt
     */
    public void kveikja() {
        if (!kveikt)
            kveikt = true;
    }

    /**
     * slekkur ef það er kveikt
     */
    public void slokkva() {
        if (kveikt)
            kveikt = false;
    }

    /**
     * skiptir yfir á stöð nr s, ef það er kveikt á sjónvarpinu og s er gilt inntak
     * @param s int
     */
    public void skiptaUmStod(int s) {
        // System.out.println(s);
        if (kveikt && s <= DAGSKRA.length && s > 0) {
            stod = s;
        }
    }

    /**
     * færir klukkuna fram um klukkutíma ef það er kveikt á sjónvarpinu og dagskráin innheldur núverandi tíma + 1
     */
    public void afram() {
        if (kveikt && klukka < DAGSKRA[0].length-1) {
            klukka++;
        }
    }
    
    /**
     * færir klukkuna aftur um klukkutíma ef kveikt og núverandi klukka er meira en 0
     */
    public void afturabak() {
        if (kveikt && klukka > 0) {
            klukka--;
        }
    }

    public String toString() {
        if (kveikt) return "Á stöð " + stod + " klukkan " + klukka + " er " + DAGSKRA[stod-1][klukka];
        return "";        
    }

    public static void main(String[] args) {
        int MAXTIMI = Integer.parseInt(args[1]);
        In in = new In(args[0]);
        int fjoldiStodva = Integer.parseInt(args[2]);
        String[][] dagskra = new String[fjoldiStodva][MAXTIMI];
        for (int i = 0; i < fjoldiStodva; i++) {
            dagskra[i] = in.readLine().split(",");
        }
        Sjonvarp s = new Sjonvarp(dagskra);
        s.kveikja();
        // s.skiptaUmStod(0);
        s.afram();
        System.out.println("test 1 skipta um stöð: " + s);
        s.skiptaUmStod(fjoldiStodva);
        System.out.println("test 2 síðasta stöð " + s);
        s.afturabak();
        s.skiptaUmStod(2);
        System.out.println("test 3 afturábak " + s);
        for (int i = 0; i < 5; i++) s.afram();
        System.out.println("test 4 síðasta klukka " + s);
        s.afram();
        System.out.println("test 5 áfram en ekki hægt að fara lengra: " + s);
        s.skiptaUmStod(fjoldiStodva + 1);
        System.out.println("test 6 ólögleg stöð staða óbreytt " + s);
    }
}
