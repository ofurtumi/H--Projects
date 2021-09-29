/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-27-09 18:11:48
 * @ Lýsing: 	Tekur inn tvær tölur af skipanalínu og notar þær til þess að búa til tvívítt fylki,
 *              skilar svo slembi rökgildum fyrir hvert stak í fylkinu
 */

public class BFylki {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        boolean[][] fylki = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                fylki[i][j] = StdRandom.bernoulli();
                if (fylki[i][j]) System.out.print("* ");
                else System.out.print("% ");
            }
            System.out.println();
        }
    }
}
