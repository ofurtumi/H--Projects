public class Leit {
    public static void main(String[] args) {
        System.out.println(leit("nemendur.txt", "@"));
        System.out.println(leit("nemendur.txt", "dóttir"));
        System.out.println(leit("nemendur.txt", "Reykjavík"));
        System.out.println(leit("nemendur.txt", "son"));
        In s = new In("nemendur.txt");
        System.out.println(s.readLine());
    }

    public static int leit(String nafnASkra, String ord) {
        In s = new In(nafnASkra);
        int fjoldiOrda = 0;
        
        while(s.hasNextLine()) {
            String lina = s.readLine();
            if (lina.contains(lina)) {
                fjoldiOrda++;
            }
        }

        return fjoldiOrda;
    }
}
