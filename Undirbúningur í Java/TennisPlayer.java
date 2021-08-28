public class TennisPlayer {
    public String name;   // Name of the player
	public int points;  // points in the global leaderboard
    public TennisPlayer pursuer;
    public int startingNumber;
    public boolean isLast;
    public static int nextNumber = 1;

	public int pointDifference (int points) {
		// Absolute point difference using Math library 
		return Math.abs(points - this.points);
	}
    
    TennisPlayer(String name, int points, TennisPlayer pursuer) {
        this.name = name;
        this.points = points;
        this.pursuer = pursuer;
        this.startingNumber = nextNumber;
        nextNumber = nextNumber + 1;
    }

    TennisPlayer(String name, int points) {
        this.name = name;
        this.points = points;
        this.startingNumber = nextNumber;
        nextNumber = nextNumber + 1;    
        this.isLast = true;
    }

    public String toString() {
        String printText = name + " (" + startingNumber + ")";
        if (pursuer != null) 
            printText = printText + " is ahead of " + pursuer.toString();
        return printText;
    }

    public static void main(String args[]){
        TennisPlayer federer, schuettler, agassi;
        
        federer = new TennisPlayer("R. Federer", 167);
        schuettler = new TennisPlayer("R. Schuettler", 226, federer);
        agassi = new TennisPlayer("A. Agassi", 236, schuettler);

        System.out.println(federer);
        System.out.println(schuettler);
        System.out.println(agassi);

    }

}