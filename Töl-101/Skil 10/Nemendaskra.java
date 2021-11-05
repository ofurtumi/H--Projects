/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-01-11 11:33
 * @ Lýsing: 	inniheldur þrjú föll sem vinna saman með gefna klasanum Nemendur
 *              hvert fall hefur sína eigin javadoc lýsingu nema main 
 *              sem er notað til þess að testa hin föllin
 */

import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Nemendaskra {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Nemandi[] nemendaSkra = new Nemandi[N];
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
        while (s.hasNextLine()) {
            String inntak = s.nextLine();
            String[] gogn = inntak.split(",");
            Nemandi nemandi = finna(nemendaSkra, gogn);
            try {
                if (nemandi == null) {
                    nemandi = new Nemandi(gogn[0],gogn[1]);
                    baetaVid(nemendaSkra, nemandi);
                }
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        System.out.println(Arrays.toString(nemendaSkra));
    }   
    
    /**
     * kallar á erFull til að athuga hvort pláss er fyrir nemanda í nemendaskránni
     * @param nemendaSkra
     * @param nemandi
     * @throws RuntimeException
     */
    public static void baetaVid(Nemandi[] nemendaSkra, Nemandi nemandi) throws RuntimeException {
        int i = 0;
        if (!erFull(nemendaSkra)) {
            while (nemendaSkra[i] != null) {
                i++;
            }
            nemendaSkra[i] = nemandi;
        }
    }

    /**
     * Leitar að nemandi í nemendaSkra og skilar nemanda ef hann finnst en annars skilar aðferðin null
     * @param fylki af nemendum
     * @param gogn gogn inniheldur nafn og tölvupóstfang sem á að leita að
     * @return Nemandi hlutur ef nemandi fannst með nafni og tölvupóstfangi í gogn en annars null
     */
    public static Nemandi finna(Nemandi[] nemendaSkra, String[] gogn) {
        Nemandi tempNemandi = new Nemandi(gogn[0],gogn[1]);
        // System.out.println(tempNemandi);
        for (Nemandi nemendur : nemendaSkra) {
            if (tempNemandi.equals(nemendur)) {
                System.out.println("Nemandi i skra: "+nemendur);
                System.out.println("Nemandi ur gognum: " +tempNemandi);
                return nemendur;
            }
        }
        return null;
    }

    /**
     * Athugar hvort pláss er fyrir nemanda í nemendaskránni
     * @param nemendaSkra fylki af nemendum
     * @return true ef það er ekki pláss annars false
     */
    private static boolean erFull(Nemandi[] nemendaSkra) {
        if (nemendaSkra[nemendaSkra.length-1] == null) return false;
        return true;
    }
}