package cards;

import java.util.ArrayList;

public class DeckManager {
	static ArrayList<GameDeck> playerDecks = new ArrayList<GameDeck>();
	
	public String getDeckID (GameDeck deck) {
		return deck.getDeckID();
	}
	
	public static String getDeckPlayerID (GameDeck deck) {
		return deck.getPlayerID();
	}
	
	public static GameDeck getDeckbyPlayerID (String targetPlayerID) {
		GameDeck defaultGameDeckReturn = null;
		for (int x = 0; x < playerDecks.size(); x++) {
			GameDeck currentGameDeck = playerDecks.get(x);
			String currentGameDeckPlayerID = currentGameDeck.getPlayerID();
			if (currentGameDeckPlayerID == targetPlayerID) {
				return currentGameDeck;
			}	
		}
		return defaultGameDeckReturn;
		
	}
}
