package cards;

public class UnitCard extends GameCard{
	
	private String cardID;
	private String cardName;
	private int cardCost;
	private String playerID;
	private int HP;
	private int damage;
	private int range;
	private int moves;
	

	public UnitCard(String cardID, String playerID,
			String cardName, int cardCost, int HP, int damage, int range, int moves) {
		super(cardID, cardName, playerID, cardCost);
		
		this.cardCost = cardCost;
		this.cardName = cardName;
		this.cardCost = cardCost;
		this.cardID = cardID;
		this.playerID = playerID;
		this.HP = HP;
		this.damage = damage;
		this.range = range;
		this.moves = moves;
	}	
	
	public int getDamage () {
		return damage;
	}
	
	public int getHP () {
		return HP;
	}
	
	public int getRange() {
		return range;
	}
	
	public int getMoves() {
		return moves;
	}
	
	public String getplayerID() {
		return playerID;
	}
	
	public int getCost() {
		return cardCost;
	}
	
	public String getcardID() {
		return cardID;
	}
	
	public String getcardName() {
		return cardName;
	}
	
	}
