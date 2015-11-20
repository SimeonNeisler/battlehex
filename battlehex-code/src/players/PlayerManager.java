package players;

import java.util.ArrayList;


public class PlayerManager {
	
	static ArrayList<Player> gamePlayerList = new ArrayList<Player>();

	public static Player getPlayerbyPlayerID (String targetPlayerID) {
		Player defaultPlayerReturn = null;
		for (int x = 0; x < gamePlayerList.size(); x++) {
			Player currentPlayer = gamePlayerList.get(x);
			String currentPlayerPlayerID = currentPlayer.getPlayerID();
			if (currentPlayerPlayerID == targetPlayerID) {
				return currentPlayer;
			}	
		}
		return defaultPlayerReturn;
		
	}
}
