public class PLD {

    public static boolean erLoglegDagsetning(int d, int m, int ar) {
        if (ar < 0 || ar > 2400) return false;
        if (d < 1) return false;
        if (m < 1 || m > 12) return false;
        
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 31) return false;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (d > 30) return false;
                break;

            case 2:
                if (erHlaupar(ar)) {
                    if (d > 29) return false;
                }
                else {
                    if (d > 28) return false;
                }
                break;
        }

        return true;
    }

    public static boolean erHlaupar(int ar) {
        if (ar % 400 == 0) return true;
        else if (ar % 100 == 0) return false;
        else if (ar % 4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int dagur = (int)(Math.random()*42-2);
            int manudur = (int)(Math.random()*16-2);
            int ar = (int)(Math.random()*2600-100);

            System.out.printf(
                "Case #%d: Dagsetningin %d/%d/%d er logleg? %b \n",
                i+1,
                dagur,
                manudur,
                ar,
                erLoglegDagsetning(dagur, manudur, ar)
            );
        }
    }
}
