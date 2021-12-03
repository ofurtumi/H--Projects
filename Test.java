public class Test {
    public static void main(String[] args) {
        String upphafs = args[0];
        int n = upphafs.length();
        String loka = "";

        for (int i = 0; i < n; i++) {
            loka = loka + upphafs.charAt(n-1-i);
        }
        int lokaOut = Integer.parseInt(loka);
        System.out.println(lokaOut);
    }
}
