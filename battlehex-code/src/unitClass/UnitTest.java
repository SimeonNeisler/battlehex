package unitClass;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class UnitTest {
	public static void main (String[] args){
		
		String UnitID;
		String UnitName;
		String blank;
		int HP;
		int strength;
		int moves;
		int cost;
		int range;
		int x = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		ArrayList<UnitCard> deck1 = new ArrayList<UnitCard>();
		
		while (x== 0){
			System.out.println("Enter the Unit's ID (Press Enter to finish): ");
			UnitID = keyboard.nextLine();
			if (UnitID.equals("")){
				break;
			}
			System.out.println("Enter the Unit's Name: ");
			UnitName = keyboard.nextLine();
			System.out.println("Enter the Unit's HP: ");
			HP = keyboard.nextInt();
			System.out.println("Enter the Unit's Strength: ");
			strength = keyboard.nextInt();
			System.out.println("Enter the Unit's Moves: ");
			moves = keyboard.nextInt();
			System.out.println("Enter the Unit's Cost: ");
			cost = keyboard.nextInt();
			System.out.println("Enter the Unit's Range: ");
			range = keyboard.nextInt();
			UnitCard newCard = new UnitCard(UnitID, UnitName, cost, strength, HP, range, moves);
			deck1.add(newCard);
			blank = keyboard.nextLine();
		}
		ArrayList<UnitCard> deck2 = new ArrayList<UnitCard>();
		deck2 = deck1;
		Collections.shuffle(deck1);
		deck1.toString();
		System.out.println("");
		deck2.toString();
		
		
	}

}
