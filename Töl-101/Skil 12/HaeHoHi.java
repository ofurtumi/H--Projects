/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-13-11 16:10
 * @ Lýsing: 	foobar verkefni, skilar Hæ ef tala er deilanleg með 3, Hó ef deilanleg með 5 
 *              og Hí ef deilanleg með 7, ef deilanleg með fleiri en einni tölu skeitir strengjunum
 *              saman, ef ekki deilanleg með neinni af tölunum skilar tölunni
 *              Main fallið ýtrar frá 1 til og með 200 og prentar út 12 stök í línu
 */

public class HaeHoHi {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            if (i % 12 == 0) {
                System.out.println(hvadaOut(i));
            }
            else System.out.print(hvadaOut(i)+", ");
        }
    }

    /**
     * Tekur inn heiltölu og skilar streng sem stjórnast eftir því hvort tala sé deilanleg með
     * 3,5,7 eða engum af þeim
     * @param i int
     * @return String HæHóHí eða ehv brot af því eða tala
     */
    private static String hvadaOut(int i) {
        String tempOut = "";
        if (i%3==0) tempOut += "Hæ";
        if (i%5==0) tempOut += "Hó";
        if (i%7==0) tempOut += "Hí";

        if (tempOut.equals("")) {
            tempOut += i;
        }
        return tempOut;
    }
}
