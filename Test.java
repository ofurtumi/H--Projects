public class Test {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println(1.5+2+(3+4)/2+5*2+3/2*4);
=======
        String upphafs = args[0];
        int n = upphafs.length();
        String loka = "";

        for (int i = 0; i < n; i++) {
            loka = loka + upphafs.charAt(n-1-i);
        }
        int lokaOut = Integer.parseInt(loka);
        System.out.println(lokaOut);
>>>>>>> b0e269afa36630707862e96207e1361a2e4088da
    }
}
