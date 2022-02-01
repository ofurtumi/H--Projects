public class Card implements Comparable<Card>{
    private int suit;
    private int rank;

    public Card(int s, int r) {
        suit = s;
        rank = r;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        int oSuit = o.getSuit();
        int oRank = o.getRank();
        if ((oSuit < suit) || (oSuit == suit && oRank > rank)) return 1;
        if ((oSuit > suit) || (oSuit == suit && oRank < rank)) return -1;
        return 0;
    }

    
}
