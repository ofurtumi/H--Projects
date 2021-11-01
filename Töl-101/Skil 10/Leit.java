/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-01-11 11:22
 * @ Lýsing: 	Inniheldur tvö föll, main til þess að testa, og leit sem hefur sína eigin javadoc lýsingu
 */

public class Leit {
    public static void main(String[] args) {
        System.out.println(leit("nemendur.txt", "@"));
        System.out.println(leit("nemendur.txt", "dóttir")); // virðist vera ehv vesen með kommustafi
        System.out.println(leit("nemendur.txt", "Reykjavík"));
        System.out.println(leit("nemendur.txt", "son"));
    }

    /**
     * Tekur inn tvo strengi og leitað að seinni strengnum í hverri línu af skrá með nafn fyrri strengsins
     * @param nafnASkra nafn á skrá sem á að leita í
     * @param ord strengur sem leita á að í nafnASkra skránni
     * @return heiltölu sem táknar fjölda lína í skrá sem innihalda orðið sem leitað var að
     */
    public static int leit(String nafnASkra, String ord) {
        In s = new In(nafnASkra);
        int fjoldiOrda = 0;
        
        while(s.hasNextLine()) {
            String lina = s.readLine();
            if (lina.contains(ord)) {
                fjoldiOrda++;
            }
        }

        s.close();

        return fjoldiOrda;
    }
}
