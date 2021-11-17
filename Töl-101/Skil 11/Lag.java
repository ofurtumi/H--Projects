/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-08-11 22:19
 * @ Lýsing: 	Gagnataksklasi Lag, inniheldur gettera, settera og toString aðferð
 *              eina sem þarf sérstaka útskýringu er setSaetiTop40RUV sem hefur sína eigin javadoc lýsingu
 */

public class Lag {
    private String titill;
    private String flytjandi;
    private int saeti;
    private int gamlaSaeti = 41;

    public Lag(String t, String f) {
        titill = t;
        flytjandi = f;
    }

    public int getSaetiTop40RUV() {
        return saeti;
    }

    /**
     * setur sæti lags á topp 40 listanum og skilar mimuni gamla sætisins og nýja sætisins
     * @param s int nýtt sæti
     * @return sætamismunur
     */
    public int setSaetiTop40RUV(int s) {
        if (saeti >= 1) {
            gamlaSaeti = saeti;
        }

        saeti = s;

        if (s < 1 || s > 40) {
            saeti = 0;
            return 0 - (40 - gamlaSaeti);
        }

        return gamlaSaeti - saeti;
    }

    public String getTitill() {
        return titill;
    }

    public String getFlytjandi() {
        return flytjandi;
    }

    public String toString() {
        return "Lag{titill='"+titill+"', "+"flytjandi='"+flytjandi+"'}";
    }

    public static void main(String[] args) {
        Lag lag1 = new Lag("Næsta líf", "GDRN");
        System.out.println(lag1);
        System.out.println(lag1.getFlytjandi());
        System.out.println(lag1.getTitill());
        System.out.println(lag1.setSaetiTop40RUV(1));
        System.out.println(lag1.getSaetiTop40RUV());
        System.out.println(lag1.setSaetiTop40RUV(39));
        System.out.println(lag1.getSaetiTop40RUV());
        System.out.println(lag1.setSaetiTop40RUV(51));
        System.out.println(lag1.getSaetiTop40RUV());
    }
}