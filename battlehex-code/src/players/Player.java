package players;

public class Player {
	String playerName;
	String playerID;
	
	public Player(String playerName, String playerID) {
		this.playerName = playerName;
		this.playerID = playerID;
	}
	
	public String getPlayerID() {
		return playerID;
	}

}
