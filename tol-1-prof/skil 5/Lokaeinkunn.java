public class Lokaeinkunn {
    public static void main(String[] args) {
        try {
            int n = args.length;
            int[] einkunn = new int[n];
            double outEinkunn = 0;

            int[] vaegi = {10,20,20,50};

            for (int i = 0; i < n; i++) {
                einkunn[i] = Integer.parseInt(args[i]);
            }

            for (int i = 0; i < vaegi.length; i++) {
                if (einkunn[i] < einkunn[3]) {
                    vaegi[3] += vaegi[i];
                    vaegi[i] = 0;
                }
                outEinkunn += einkunn[i]*vaegi[i];
            }

            System.out.println(outEinkunn/100);

        } catch (Exception e) {
            System.out.println("Rangur fjöldi");
        }
        
    }
}
