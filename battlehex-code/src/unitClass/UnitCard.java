//Create an ArrayList for 2 decks. Create an RNG to randomly select a card from deck 2, then ask the user to select a card from deck 1 to fight it.
//If the card is an instant damage card discard it, or if a unit dies discard it. 

package unitClass;

public class UnitCard {
	String ID;
	String name;
	int Cost;
	int health;
	int strength;
	int move;
	int range;
	public UnitCard(String id, String Name, int cost, int Strength, int HP, int Move, int Range){
		ID = id;
		name = Name;
		Cost = cost;
		strength = Strength;
		health = HP;
		move = Move;
		range = Range;
	}
	
	public void Attack(UnitCard card2){
		if (range >= card2.getRange()){
			int card2HP = card2.getHP();
			card2HP -=strength;
			card2.setHP(card2HP);
		}
		if (range == card2.getRange()){
			health -= card2.getStrength();
		}
		else{
			System.out.println("\n " + "Target not within range." + "\n");
		}
	}
	public void setHP(int newHP){
		health = newHP;
	}
	public void Move(){
		
	}
	public String getname(){
		return name;
	}
	public int getHP(){
		return health;
	}
	public int getStrength(){
		return strength;
	}
	public int getMove(){
		return move;
	}
	public int getRange(){
		return range;
	}
	public boolean dead(){
		if (this.health <= 0){
			setHP(0);
			name += (" - KIA");
			return true;
		}
		else{
			return false;
		}
	}
	public String toString(){
		String Unit = (this.name + "\n" + "Strength: " + this.strength + "\n" + "HP: " + this.health + "\n" + 
				"Range: " + this.range + "\n" + "Move: " + this.move);
		System.out.println(Unit);
		return Unit;
	}
	}
