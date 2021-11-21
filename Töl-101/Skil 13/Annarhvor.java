public class Annarhvor {
    public static String annarHvor(String s) {
        int n = s.length();
        String out = "";
        for (int i = 0; i < n; i+=2) {
            out += s.substring(i, i+1);
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println(annarHvor("abcd"));
        System.out.println(annarHvor(""));
        System.out.println(annarHvor("abc"));
    }
}
