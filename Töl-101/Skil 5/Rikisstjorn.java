/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-25-09 17:15:17
 * @ Lýsing: 	Tekur inn af skipanalínu, fylki með flokkum, magn þingmanna sem þarf til að mynda meirihluta
 *              og hámark af mismunandi flokkum sem geta myndað ríkisstjórn.
 *              Skilar út stokkuðum lista af flokkum og segir til um hvort þeir geti myndað ríkisstjórn undir
 *              skilyrðunum sem gefin eru í fylkinu
 */

public class Rikisstjorn {
    public static void main(String[] args) {
        int N = args.length;
        int[] flokkur = new int[N - 2];
        final int meirihluti = Integer.parseInt(args[N - 2]);
        final int MAX = Integer.parseInt(args[N - 1]);
        char[] bokstafur = {'B', 'C', 'D', 'F', 'J', 'M', 'P', 'S', 'V'};

        for (int i = 0; i < N - 2; i++) flokkur[i] = Integer.parseInt(args[i]);
        
        for (int j = 0; j < N - 2; j++) {
            int r = StdRandom.uniform(j, N-2);
            int t = flokkur[r];
            char tf = bokstafur[r];
            flokkur[r] = flokkur[j];
            bokstafur[r] = bokstafur[j];
            flokkur[j] = t;
            bokstafur[j] = tf;
        }

        int rikisstjorn = 0;
        int u = 0;
        String rikisstrengur = "";
        while (rikisstjorn < meirihluti && rikisstrengur.length() < MAX) {
            rikisstjorn = rikisstjorn + flokkur[u];
            rikisstrengur = rikisstrengur + bokstafur[u];
            u++;
        }

        if (rikisstjorn > meirihluti) System.out.println(rikisstrengur + " " + rikisstjorn + " " + MAX);
        else System.out.println("Ekki tókst að mynda ríkisstjórn með " + MAX + " flokkum " + rikisstrengur);
        
    }
}
