/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-08-11 22:19
 * @ Lýsing: 	Notar Stopwatch klasann og getur sýnt hversu langann tíma það tekur að ítra yfir 
 *              ákveðinn fjölda skrefa
 */

public class Maeling {
    /**
     * Notar Stopwatch klasann og getur sýnt hversu langann tíma það tekur að ítra yfir 
    *  ákveðinn fjölda skrefa
     * @param fjoldiSkrefa int
     * @return double tími í sekúndum
     */
    public static double maelaDouble(int fjoldiSkrefa) {
        Stopwatch timer = new Stopwatch();
        double total = 0;
        for (int i=0; i<fjoldiSkrefa; i++) {
            total += i;
        }
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        System.out.println(maelaDouble(1000000000));
        System.out.println(maelaDouble(100000000));
    }
}
