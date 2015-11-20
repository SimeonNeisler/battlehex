package cards;

import players.Player;
import players.PlayerManager;

public class CardService extends Exception {
	
	public Player getPlayerbyDeck (GameDeck deck) {
		String PlayerID = DeckManager.getDeckPlayerID(deck);
		return PlayerManager.getPlayerbyPlayerID(PlayerID);
	}
	
	public void drawCardFromDrawPile(String PlayerID) throws Exception {
		DrawPile playerDrawPile = DrawPileManager.getDrawPilebyPlayerID(PlayerID);
		if(DrawPileManager.emptinessCheck(playerDrawPile) == true) {
			throw new Exception("DrawPile is empty, invalid action.");
		}
		else {
			GameCard drawnCard = DrawPileManager.removeCardFromDrawPile(playerDrawPile);
			Hand playerHand = HandManager.getHandbyPlayerID(PlayerID);
			HandManager.AddCardToHand(drawnCard, playerHand);
		}
	}
	
	public void drawCardFromDiscardPile(String PlayerID) throws Exception {
		DiscardPile playerDiscardPile = DiscardPileManager.getDiscardPilebyPlayerID(PlayerID);
		if (DiscardPileManager.emptyCheck(playerDiscardPile) == true) {
			throw new Exception("Discard Pile is empty, invalid action.");
		}
		else {
			GameCard drawnCard = DiscardPileManager.removeGameCardfromDiscardPile(playerDiscardPile);
			Hand playerHand = HandManager.getHandbyPlayerID(PlayerID);
			HandManager.AddCardToHand(drawnCard, playerHand);
		}
	}
	
	public void discardCardfromHandtoDiscardPile (GameCard card) throws Exception {
		String playerID = CardManager.getCardPlayerID(card);
		Hand playerHand = HandManager.getHandbyPlayerID(playerID);
		HandManager.removeCardFromHand(card, playerHand);
		if (HandManager.doesHandContainCardHandManager(card, playerHand) == false) {
			throw new Exception ("Hand does not contain card, invalid action.");
		}
		DiscardPile playerDiscardPile = DiscardPileManager.getDiscardPilebyPlayerID(playerID);
		DiscardPileManager.addCardtoDiscardPile (card, playerDiscardPile);
	}
	
	public void cloneCardToDrawPile(GameCard card) {
		String playerID = CardManager.getCardPlayerID(card);
		GameCard newCard = CardManager.cloneCard(card, cardID);
		DrawPile playerDrawPile = DrawPileManager.getDrawPilebyPlayerID(playerID);
		DrawPileManager.AddCardToDrawPile(newCard, playerDrawPile);
		
	}
	
}
