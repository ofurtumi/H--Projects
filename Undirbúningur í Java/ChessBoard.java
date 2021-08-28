public class ChessBoard {
    public static void main(String[] args) {
        int x[] = new int[5];
        System.out.println(x.length);

        for (int i = 0; i < 8; i++) {
            String str = "";
            for (int u = 1; u <= 8; u++) {
                if ((u + i) < 10) str += " ";
                str = str + (u + i) + "  ";
            }
            System.out.println(str);
        }
    }
}
