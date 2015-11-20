package cards;

import java.util.ArrayList;

public class Hand {
	String handID;
	String playerID;
	ArrayList<GameCard> handCards = new ArrayList<GameCard>();
	public Hand (String handID, String playerID) {
		this.handID = handID;
		this.playerID = playerID;
	}
	
	public boolean doesHandContainCard (GameCard card) {
		return handCards.contains(card);
	}
	
	public String getPlayerID() {
		return playerID;
	}
	
	public String getHandID() {
		return handID;
	}
	
	public void removeCard(GameCard card) {
		handCards.remove(card);
	}
	
	public void addCard(GameCard newCard) {
		handCards.add(newCard);
	}
}
