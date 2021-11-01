import Nemandi;

public class Nemendaskra {
    public static void main(String[] args) {
        // Nemandi n1 = new Nemandi("Þorvaldur Tumi", "thorvaldur.tumi@mail.com");
        // System.out.println(n1);
        int N = Integer.parseInt(args[0]);
        int i = 0;
        Nemandi[] nemendaSkra = new Nemandi[N];
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        while (s.hasNextLine()) {
            String inntak = s.nextLine();
            String[] gogn = inntak.split(",");
            Nemandi nemandi = finna(nemendaSkra, gogn);
            try {
                if (nemandi == null) {
                    nemandi = new Nemandi(gogn[0],gogn[1]);
                    nemendaSkra[i] = nemandi;
                }
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
            i++;
        }
        // prenta út nemendaSkra  
    }   
    
    /**
     * kallar á erFull til að athuga hvort pláss er fyrir nemanda í nemendaskránni
     * @param nemendaSkra
     * @param nemandi
     * @throws RuntimeException
     */
    public static void baetaVid(Nemandi[] nemendaSkra, Nemandi nemandi) throws RuntimeException {

    }

    /**
     * Leitar að nemandi í nemendaSkra og skilar nemanda ef hann finnst en annars skilar aðferðin null
     * @param fylki af nemendum
     * @param gogn gogn inniheldur nafn og tölvupóstfang sem á að leita að
     * @return Nemandi hlutur ef nemandi fannst með nafni og tölvupóstfangi í gogn en annars null
     */
    public static Nemandi finna(Nemandi[] nemendaSkra, String[] gogn) {
        for (int i = 0; i < nemendaSkra.length; i++) {
            if (nemendaSkra[i].nafn == gogn[0] && nemendaSkra[i].tPostur == gogn[1]) return nemendaSkra[i];
        }
        return null;
    }

    /**
     * Athugar hvort pláss er fyrir nemanda í nemendaskránni
     * @param nemendaSkra fylki af nemendum
     * @return satt ef það er ekki pláss annars false
     */
    private static boolean erFull(Nemandi[] nemendaSkra) {

    }
}
