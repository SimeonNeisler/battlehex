package cards;

import java.util.ArrayList;

public class DiscardPile {

	String discardPileID;
	String playerID;
	ArrayList<GameCard> discardPileCards = new ArrayList<GameCard>();
	public DiscardPile (String discardPileID, String playerID) {
		this.discardPileID = discardPileID;
		this.playerID = playerID;

	}
	
	public int emptyCheck() {
		return discardPileCards.size();
	}
	
	public void addCard (GameCard card) {
		discardPileCards.add(card);
	}
	
	public GameCard removeCard () {
		GameCard removedCard = discardPileCards.get(0);
		discardPileCards.remove(removedCard);
		return removedCard;
	}



	public String getPlayerID() {
		return playerID;
	}
	
	
}