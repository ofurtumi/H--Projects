public class TvoArray {
    public static void skilarRod(int[] a, int[] b) {
        int n = (a.length + b.length) ;
        int indexA = 0;
        int indexB = 0;

        boolean aBuid = false;
        boolean bBuid = false;

        String out = "";

        for (int i = 0; i < n; i++) {
            
            if ((!aBuid && a[indexA] < b[indexB]) || bBuid) {
                if (indexA == a.length-1) aBuid = true;
                out += Integer.toString(a[indexA])+", ";
                if (indexA < a.length-1) indexA++;
            }

            else {
                if (indexB == b.length-1) bBuid = true;
                out += Integer.toString(b[indexB])+", ";
                if (indexB < b.length-1) indexB++;
            }
        }

        System.out.println(out);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,9,10};
        int[] b = {6,7,8,11,12};

        skilarRod(a, b);
        skilarRod(b, a);
    }
}
