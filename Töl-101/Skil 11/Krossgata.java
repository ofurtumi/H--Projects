public class Krossgata {
    /**
     * Finnur hvort til er sameiginlegur bókstafur í orðunum s1 og s2
     * og skilar hlut af klasanum TvoOrd sem
     * hefur orðin tvö og sæti sameiginlega bókstafsins.
     * Ef engin sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param s1 orð
     * @param s2 orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins
     */
    public static TvoOrd samiStafur(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int pos1;
        int pos2;

        for (int i = 0; i < n1; i++) {
            if (s1 != s2 && s2.contains(s1.substring(i,i+1))) {
                pos1 = i;
                for (int j = 0; j < n2; j++) {
                    if (s1.contains(s2.substring(j,j+1))) {
                        pos2 = j;
                        return new TvoOrd(s1,pos1,s2,pos2);
                    }
                }
            }
        }

        
        return null;
    }

    /**
     * Finnur tvö mismunnandi í fylki af orðum  sem hafa sameiginlegan staf og
     * skilar hlut af klasanum TvoOrd sem inniheldur orðin tvö og
     * sætin með sameiginlega stafnum
     *
     * @param ordK fylki af orðum
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. Ef engin sameiginlegur stafur finnst
     * þá skilar aðferðin null hlut
     */
    public static TvoOrd finnaOrd(String[] ordK) {
        // for (String ord : ordK) {
        //     for (int i = 0; i < ordK.length; i++) {
        //         if (ord != ordK[i]) {
        //             TvoOrd t = samiStafur(ord, ordK[i]);
        //             if (t != null) return t;
        //         }
        //     }
        // }
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = finnaOrd(ordK, ordK[i]);
            if (t != null) return t;
        }
        return null;
    }

    /**
     * Finnur fyrsta orð í  fylkinu ordK sem hafa sameiginlegan bókstaf með s
     * Skilar orðunum tveimur með sætum sameiginlega bókstafsins.
     * Ef engin sameiginlegur stafur finnst þá skilar aðferðin null hlut
     *
     * @param ordK fylki af orðum
     * @param s    orð
     * @return hlutur af klasanum TvoOrd sem hefur orðin tvö og sæti
     * sameiginlega bókstafsins. skilar null ef enginn sameiginlegur
     */
    public static TvoOrd finnaOrd(String[] ordK, String s) {
        for (int i = 0; i < ordK.length; i++) {
            TvoOrd t = samiStafur(ordK[i], s);
            if (t != null)
                return t;
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strengir = { "afmæli", "bál", "bók", "aldur" };
        System.out.println(finnaOrd(strengir));
    }
}
