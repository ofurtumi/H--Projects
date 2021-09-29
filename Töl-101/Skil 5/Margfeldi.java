/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-25-09 11:54:34
 * @ Lýsing: 	Tekur inn 3+ heiltölur af skipanalínu og setur inn í fylki,
 *              býr svo til annað fylki sem samanstendur af margfeldum úr fyrra fylkinu
 */

public class Margfeldi {
    public static void main(String[] args) {
        int N = args.length;
        int[] upphaf = new int[N];
        int[] margfeldi = new int[N];

        for (int i = 0; i < N; i++) {
            upphaf[i] = Integer.parseInt(args[i]);
        }

        margfeldi[0] = upphaf[N-1] * upphaf[N-2];
        margfeldi[1] = upphaf[0] * upphaf[N-1];
        System.out.print(margfeldi[0] + " " + margfeldi[1] + " ");

        for (int u = 2; u <= N-1; u++) {
            margfeldi[u] = upphaf[u-1]*upphaf[u-2];
            System.out.print(margfeldi[u] + " ");
        }
        System.out.println();
    }
}
