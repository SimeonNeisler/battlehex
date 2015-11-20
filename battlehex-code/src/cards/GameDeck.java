package cards;
import java.util.ArrayList;
public class GameDeck {
	String deckName;
	String deckID;
	String playerID;
	ArrayList<GameCard> deckCards = new ArrayList<GameCard>();
	public GameDeck (String deckName, String deckID, String playerID) {
		this.deckName = deckName;
		this.deckID = deckID;
		this.playerID = playerID;
	}
	
	public String getDeckID () {
		return deckID;
	}
	
	public String getPlayerID () {
		return playerID;
	}

}
