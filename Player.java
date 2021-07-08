

public class Player {
    String playerName;
    int playerAge;
    String playerType;
    int  playerStatistics;


    public Player(String playerName, int playerAge, String playerType, int playerStatistics) {
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.playerStatistics = playerStatistics;
    }

    public Player() {
        playerName = "N/A";
        playerAge = 0;
        playerType = "N/A";
        playerStatistics = 0;

    }

	 double getAverage() {
			double avg = playerStatistics / 15;
			return avg;

		}

	String getPlayerType(){
		return playerType;	
	}

	
 

    void displayPlayerDetails() {
        System.out.println("");
        System.out.println("");
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Age: " + playerAge);
		System.out.println("Player Type: "+playerType);
        System.out.println("Player Statistics: " + playerStatistics);
        System.out.println("");
    }



}