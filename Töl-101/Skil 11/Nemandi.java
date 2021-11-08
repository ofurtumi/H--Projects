import java.util.Objects;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *s
 *  Lýsing  : Inniheldur upplýsingar um nemanda, nafn og tölvupóst
 *
 *
 *****************************************************************************/

public class Nemandi {
    private String nafn;    // nafn nemanda
    private String tPostur; // tölvupóstur nemanda
    private Einkunn einkunn; // einkunn nemanda

    /**
     * Smiður sem tekur inn nafn og tölvupóst nemanda
     *
     * @param n nafn
     * @param t tölvupóstfang
     */
    public Nemandi(String n, String t) {
        einkunn = null;
        nafn = n;
        tPostur = t;
    }

    public Nemandi(Einkunn e, String n, String t) {
        einkunn = e;
        nafn = n;
        tPostur = t;
    }

    public Nemandi haerriEinkunn(Nemandi n) {
        if (n.getEinkunn().getLokaprof() > this.einkunn.getLokaprof()) return n;
        return this;
    }

    public Einkunn getEinkunn() {
        return einkunn;
    }

    public void setEinkunn(Einkunn e) {
        this.einkunn = e;
    }

    // gettera og settera þar ekki að skjala

    public String gettPostur() {
        return tPostur;
    }

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }


    public String toString() {
        return "Nemandi{" +
                "nafn='" + nafn + '\'' +
                ", tPostur='" + tPostur + '\'' +
                '}';
    }

    /**
     * Skilar true ef nafn er sama og fyrra stak gogn og tölvupóstur er sama og seinna stak gogn
     *
     * @param gogn gögn nemandans, nafn og tölvupóstur
     * @return satt ef gogn innihalda sama nafn og tölvupóst og eiginleikar hlutarins
     */
    public boolean equalsString(String[] gogn) {
        Nemandi n = new Nemandi(gogn[0], gogn[1]);
        return this.equals(n);
    }


    /**
     * Ber saman eiginleika o við eiginleika hlutarins
     *
     * @param o hlutur sem á að bera saman við
     * @return true ef hluturinn o er eins og hluturinn
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nemandi nemandi = (Nemandi) o;
        return Objects.equals(nafn, nemandi.nafn) && Objects
                .equals(tPostur, nemandi.tPostur);
    }

    public int hashCode() {
        return Objects.hash(nafn, tPostur);
    }
    
    public static void main(String[] args) {
        Nemandi n1 = new Nemandi("Bjarney", "b2@hi.is");
        Einkunn e1 = new Einkunn(0.4, 8);
        n1.setEinkunn(e1);

        // System.out.println(e1.getLokaprof());
        // System.out.println(n1.getEinkunn().getLokaprof());

        Einkunn e2 = new Einkunn(0.5, 6);
        Nemandi n2 = new Nemandi(e2, "Jón", "j@hi.is");

        System.out.println(" nemandi með hærri einkunn er " + n1.haerriEinkunn(n2));
    }


}
