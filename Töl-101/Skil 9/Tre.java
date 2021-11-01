/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-24-10 15:16
 * @ Lýsing: 	klasinn inniheldur tvö föll, tre sem fyllir tvöfalt heiltölufylki með upplýsingum um hvernig
 *              skipting væri á ljósum, og main fall sem prófar tre fallið
 */

import java.util.Arrays;

public class Tre {
    public static void main(String[] args) {
        // StdRandom.setSeed(15);
        System.out.println("Tre nr. 1: ");
        int[][] treArray1 = tre(5,0.1);
        for (int i = 0;i < treArray1.length; i++) {
            System.out.println(Arrays.toString(treArray1[i]));
        }
        System.out.println();
        System.out.println("Tre nr. 2: ");
        int[][] treArray2 = tre(10,0.8);
        for (int i = 0;i < treArray2.length; i++) {
            System.out.println(Arrays.toString(treArray2[i]));
        }
        System.out.println();
        System.out.println("Tre nr. 3: ");
        int[][] treArray3 = tre(2,0.3);
        for (int i = 0;i < treArray3.length; i++) {
            System.out.println(Arrays.toString(treArray3[i]));
        }
        System.out.println();
        System.out.println("Tre nr. 4: ");
        int[][] treArray4 = tre(6,0.0);
        for (int i = 0;i < treArray4.length; i++) {
            System.out.println(Arrays.toString(treArray4[i]));
        }
        System.out.println();
        System.out.println("Tre nr. 5: ");
        int[][] treArray5 = tre(3,0.5);
        for (int i = 0;i < treArray5.length; i++) {
            System.out.println(Arrays.toString(treArray5[i]));
        }

        // System.out.println();
        // System.out.println("Ubertré: ");
        // int[][] treArray6 = tre(27,0.5);
        // for (int i = 0;i < treArray6.length; i++) {
        //     System.out.println(Arrays.toString(treArray6[i]));
        // }
    }
    
    /**
     * fallið tre tekur inn tvö gili, n sem segir til um stærð trésins og p sem segir til um líkur
     * þess að ljós sé gult, fallið skilar svo út tvívíðu heiltölufylki þar sem stök geta verið,
     * 0 sem þýðir að ekkert sé þar, 1 sem þýðir að ljósið sé gult og 5 sem þýðir að ljósið sé grænt
     * @param n ,heiltala, segir til um stærð fylkisins, stærð er reiknuð með int[n][n*2-1]
     * @param p ,kommutala á milli 0.0 og 1.0, segir til um lýkur þess að ljós sé gullt
     * @return tvívítt heiltölufylki
     */
    public static int[][] tre(int n, double p) {
        int [][] treid = new int[n][n*2-1];
        final int GRAENN = 5;
        final int GULT = 1;

        for (int i = 0; i < treid.length; i++) {
            for (int j = n-1-i; j <= n-1+i; j++) {
                if (StdRandom.bernoulli(p)) treid[i][j] = GULT;
                else treid[i][j] = GRAENN;
            }
        }

        return treid;
    }
}
