package cards;

public class GameCard {
	String cardID = new String();
	String playerID = new String();
	String cardName = new String();
	int cardCost;
	public GameCard (String cardID, String playerID, String cardName, int cardCost) {
		this.cardCost = cardCost;
		this.cardID = cardID;
		this.playerID = playerID;
		this.cardName = cardName;
	}
	
	public String getCardID () {
		return cardID;
	}
	
	public String getPlayerID () {
		return playerID;
	}
	
	public int getcardCost () {
		return cardCost;
	}
	
	public String getCardName () {
		return cardName;
	}
}
