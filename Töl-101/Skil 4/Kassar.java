/**
 * @ Höfundur: 	Þorvaldur Tumi Baldursson
 * @ Netfang: 	ttb3@hi.is
 * @ Búið til: 	2021-19-09 14:20:00
 * @ Klárað:    Með tár í augunum
 * @ Lýsing: 	Hermir eftir verslun með því að athuga hvort opna eða loka þurfi kössum
 */

public class Kassar {
    public static void main(String[] args) {        
        int upphafKassar = Integer.parseInt(args[0]);   //upphafsfjöldi kassa
        int maxKassar = Integer.parseInt(args[1]);      //hámarksfjöldi kassa
        int fjHermana = Integer.parseInt(args[2]);      //fjöldi hermana sem á að taka
        int opnirKassar = upphafKassar;

        int fjLokana = 0;
        int t = 0;

        long hLokun = 0;
        long mAthugun = 0;

        for (int i = 0; i < fjHermana; i++) {
            
            if (fjHermana <= 0) break;
            
            opnirKassar = upphafKassar;
            while (opnirKassar > 0 && opnirKassar < maxKassar) {
                t=t+1;
                // System.out.println(t);
                if (StdRandom.uniform(0.0,1.0) < 0.5) opnirKassar = opnirKassar+1;
                else {
                    opnirKassar = opnirKassar-1;
                }
            }
            if (opnirKassar == maxKassar) fjLokana = fjLokana+1;
        }
        if (fjHermana > 0) {
            hLokun = Math.round(100.0*fjLokana/fjHermana);
            mAthugun = Math.round(1.0*t/fjHermana);
        }

        System.out.println("Fjöldi lokana " + fjLokana + " eftir " + fjHermana + " hermanir");
        System.out.println("Hlutfall lokana er " + hLokun + "%");
        System.out.println("Meðalfjöldi athugana í hermun er " + mAthugun);
    }
}
