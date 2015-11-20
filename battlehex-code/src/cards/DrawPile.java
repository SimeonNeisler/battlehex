package cards;

import java.util.Stack;

public class DrawPile {


	String drawPileID;
	String playerID;
	Stack<GameCard> drawPileCards = new Stack<GameCard>();
	public DrawPile (String drawPileID, String playerID) {
		this.drawPileID = drawPileID;
		this.playerID = playerID;
	}
	
	public boolean emptyCheck() {
		return drawPileCards.empty();
	}
	
	public String getPlayerID () {
		return playerID;
	}
	
	public void PushCard (GameCard newCard) {
		drawPileCards.push(newCard);
	}

	public GameCard PopCard () {
		return drawPileCards.pop();
	}
	
	public GameCard TopCard () {
		return drawPileCards.peek();
	}
	
	public GameCard PopTopCard () {
		drawPileCards.peek();
		return drawPileCards.pop();
	}
	

}
