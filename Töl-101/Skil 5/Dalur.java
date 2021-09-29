/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-25-09 12:52:10
 * @ Lýsing: 	Tekur inn fylki af skipanalínu og finnur í því dal, röð af tveimur eða fleiri eins tölum
 *              sem eru umkringdar af stærri tölum
 */

public class Dalur {
    public static void main(String[] args) {
        int N = args.length;
        int[] dalur = new int[N];
        int lengd = 0;

        for (int j = 0; j < N; j++) dalur[j] = Integer.parseInt(args[j]);
        
        int minnsta = dalur[0];
        int minnstaIndex = 0;

        for (int u = 0; u < N-1; u++) {
            if (dalur[u] > dalur[u+1]) {
                minnsta = dalur[u+1];
                minnstaIndex = u+1;
            }
        }
        
        // tékkar hvort minnsta stak sé ekki fremst í fylkinu og hvort stakið á undan því sé stærra

        if (minnstaIndex != 0 && dalur[minnstaIndex - 1] > dalur[minnstaIndex]) {
            while (minnsta == dalur[minnstaIndex]) {
                lengd++;
                minnstaIndex++;
                if (minnstaIndex == N) break;
            }
        }

        // hvað er í gangi hér ?? 
        if (minnstaIndex != N && minnsta < dalur[minnstaIndex]) {
            System.out.println("Lengd dals er " + lengd);
        }
        else System.out.println("Lengd dals er " + 0);

    }
}
