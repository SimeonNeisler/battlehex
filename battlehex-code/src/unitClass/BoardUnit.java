package unitClass;

public class BoardUnit {
	String id;
	String name;
	String type;
	int strength;
	int HP;
	int moves;
	int range;
	boolean [] directions = new boolean[6];
	
	public BoardUnit (String id, String name, String type, int strength, int HP, int moves, int range, boolean directions[]) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.strength = strength;
		this.HP = HP;
		this.moves = moves;
		this.range = range;
		this.directions = directions;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String newID) {
		id = newID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getType() {
		return type;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int newStrength) {
		strength = newStrength;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setHP(int newHP) {
		HP = newHP;
	}
	
	public int getMoves() {
		return moves;
	}
	
	public void setMoves(int newMoves) {
		moves = newMoves;
	}
	
	public int getRange() {
		return range;
	}
	
	public boolean[] getDirections() {
		for (int i = 0; i < 6; i++) {
			System.out.println(directions[i]);
		}
		return directions;
	}
	
	public void setDirections(int shift) {
		boolean[] directionsCopy = directions.clone();
		for (int i = 0; i <6; i++) {
			directions[(i + shift) % 6] = directionsCopy [i];
		}
	}

}
