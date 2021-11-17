import java.util.Arrays;

public class SpilAHendi {
    private int mestiFjoldi;
    private Spil[] spilArray;

    public SpilAHendi(int n) {
        mestiFjoldi = n;
        spilArray = new Spil[n];
    }

    /**
     * Tekur inn Spil hlut og bætir við spilArray fylkið ef það er ekki fullt og það er ekki til eins Spil hlutur í fylkinu
     * @param s Spil hlutur
     */
    public void baetaVidSpili(Spil s) {
        for (int i = 0; i < spilArray.length; i++) {
            if (spilArray[i] == s) break;
            if (spilArray[i] == null) {
                spilArray[i] = s;
                break;
            }
        }
    }

    public Spil takaSpilAfHendi() {
        Spil tempSpil;
        if (spilArray[spilArray.length-1] != null) {
            tempSpil = spilArray[spilArray.length-1];
            spilArray[spilArray.length-1] = null;
            return tempSpil;
        }
        else {
            for (int i = 1; i < spilArray.length; i++) {
                if (spilArray[i] == null) {
                    tempSpil = spilArray[i-1];
                    spilArray[i-1] = null;
                    return tempSpil;
                }
            }
        }
        return null;
    }

    public String toString() {
        return Arrays.toString(spilArray);
    }

    public static void main(String[] args) {
        SpilAHendi test = new SpilAHendi(3);
        System.out.println(test.takaSpilAfHendi());

        Spil s1 = new Spil("Ás","Spaði");
        Spil s2 = new Spil("Tvistur","Tígull");
        Spil s3 = new Spil("Þristur","Hjarta");
        Spil s4 = new Spil("Fjarki","Lauf");

        test.baetaVidSpili(s1);
        System.out.println(test.toString());

        test.baetaVidSpili(s1);
        System.out.println(test.toString());

        test.baetaVidSpili(s2);
        test.baetaVidSpili(s3);
        test.baetaVidSpili(s4);
        System.out.println(test.toString());

        System.out.println(test.takaSpilAfHendi());
        System.out.println(test.toString());
    }
}
