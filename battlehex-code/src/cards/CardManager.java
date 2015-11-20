package cards;

public class CardManager {
	
	public String getCardID (GameCard card) {
		return card.getCardID();
	}
	
	public static String getCardPlayerID (GameCard card) {
		return card.getPlayerID();
	}
	
	public static GameCard cloneCard (GameCard card, String cardID) {
		String newCardPlayerID = card.getPlayerID();
		String newCardName = card.getCardName();
		int newCardCost = card.getcardCost();
		GameCard newCard = new GameCard(cardID, newCardPlayerID, newCardName, newCardCost);
		return newCard;
	}
}
