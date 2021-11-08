public class Lag {
    private static String titill;
    private static String flytjandi;
    private static int saeti;
    private static int gamlaSaeti = 41;


    public Lag(String t, String f) {
        titill = t;
        flytjandi = f;
    }

    public int getSaetiTop40RUV() {
        return saeti;
    }

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