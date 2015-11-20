package cards;
import java.util.ArrayList;

public class DrawPileManager {
	static ArrayList<DrawPile> playerDrawPiles = new ArrayList<DrawPile>();
	
	public void populate(DrawPile newPlayerDrawPile) {
		playerDrawPiles.add(newPlayerDrawPile);
	}
	
	public static boolean emptinessCheck (DrawPile drawPile) {
		return drawPile.emptyCheck();
	}
	public static void AddCardToDrawPile (GameCard newCard, DrawPile drawPile) {
		drawPile.PushCard(newCard);
	}
	
	public static GameCard removeCardFromDrawPile (DrawPile drawPile) {
		return drawPile.PopTopCard();
	}
	
	public static DrawPile getDrawPilebyPlayerID (String targetPlayerID) {
		DrawPile defaultDrawPileReturn = null;
		for (int x = 0; x < playerDrawPiles.size(); x++) {
			DrawPile currentDrawPile = playerDrawPiles.get(x);
			String currentDrawPilePlayerID = currentDrawPile.getPlayerID();
			if (currentDrawPilePlayerID == targetPlayerID) {
				return currentDrawPile;
			}	
		}
		//This is simply to satisfy the return requirement. Technically it should be impossible for it to not
		//return the currentDrawPile that it does above.
		return defaultDrawPileReturn;
	}
}
