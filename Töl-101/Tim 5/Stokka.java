/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-27-09 17:53:23
 * @ Lýsing: 	Tekur inn fylki af tölum af skipanalínu, stokkar þær og skrifar þær út á skipanalínu
 */

public class Stokka {
    public static void main(String[] args) {
        int N = args.length;
        int[] tolur = new int[N];

        for (int i = 0; i < N; i++) {
            tolur[i] = Integer.parseInt(args[i]);
        }


        for (int i = 0; i < N; i++) {
            int r = StdRandom.uniform(i, N);
            int t = tolur[r];

            tolur[r] = tolur[i];
            tolur[i] = t;
        }

        for (int i = 0; i < N; i++) System.out.print(tolur[i] + " ");
        System.out.println();
    }
}
