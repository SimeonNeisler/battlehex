package cards;

import java.util.ArrayList;

public class DiscardPileManager {
	static ArrayList<DiscardPile> playerDiscardPiles = new ArrayList<DiscardPile>();
	
	public void addDiscardPileinGameCreation (DiscardPile newDiscardPile) {
		playerDiscardPiles.add(newDiscardPile);
	}
	
	public static void addCardtoDiscardPile(GameCard card, DiscardPile discardPile) {
		discardPile.addCard(card);
	}
	
	public static GameCard removeGameCardfromDiscardPile(DiscardPile discardPile) {
		return discardPile.removeCard();
	}
	public static boolean emptyCheck(DiscardPile discardPile) {
		if (discardPile.emptyCheck() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static DiscardPile getDiscardPilebyPlayerID(String targetPlayerID) {
		DiscardPile defaultDiscardPileReturn = null;
		for (int x = 0; x < playerDiscardPiles.size(); x++) {
			DiscardPile currentDiscardPile = playerDiscardPiles.get(x);
			String currentDiscardPilePlayerID = currentDiscardPile.getPlayerID();
			if (currentDiscardPilePlayerID == targetPlayerID) {
				return currentDiscardPile;
			}	
		}
		return defaultDiscardPileReturn;
	}
}
