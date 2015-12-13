package unitClass;
import java.util.Arrays;
public class TestClass {
	static boolean directions[] = {true, false, false, true, false, false};
	
	static BoardUnit testunit = new BoardUnit("0000", "Tank", "Armor", 5, 5, 2, 1, directions);

public static void main(String[] args) {
		testunit.getDirections();
		testunit.setDirections(1);
		System.out.println("");
		testunit.getDirections();
}
}