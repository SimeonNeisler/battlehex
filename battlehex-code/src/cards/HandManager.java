package cards;

import java.util.ArrayList;

public class HandManager {
	static ArrayList<Hand> playerHands = new ArrayList<Hand>();
	
	public static boolean doesHandContainCardHandManager (GameCard card, Hand hand) {
		return hand.doesHandContainCard(card);
		
	}
	
	public static void removeCardFromHand (GameCard Card, Hand hand) {
		hand.removeCard(Card);
	}
	
	public static void AddCardToHand (GameCard newCard, Hand Hand) {
		Hand.addCard(newCard);
	}
	
	public void AddCardToHandbyHandID(GameCard newCard, String targetHandID) {
		for (int x = 0; x < playerHands.size(); x++) {
			Hand hand = playerHands.get(x);
			String currentHandID = hand.getHandID();
			if (currentHandID == targetHandID) {
				hand.addCard(newCard);
			}
		}
	}
	
	public static Hand getHandbyPlayerID (String targetPlayerID) {
		Hand defaultHandReturn = null;
		for (int x = 0; x < playerHands.size(); x++) {
			Hand currentHand = playerHands.get(x);
			String currentHandPlayerID = currentHand.getPlayerID();
			if (currentHandPlayerID == targetPlayerID) {
				return currentHand;
			}	
		}
		return defaultHandReturn;
	}
}
