package map;

public class HexCordinates {
	int x;
	int y;
	
	public HexCordinates(int x, int y) throws Exception {
		if (x % 2 != y % 2 | x % 2 != ((y%2)* -1)) {
			throw new Exception ("Impossible node location, cordinates not created.");
		}
		else {
			this.x = x;
			this.y = y;
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int setX(int newX) {
		x = newX;
		return x;
	}
	
	public int setY(int newY) {
		y = newY;
		return y;
	}
	
	public String toString() {
		String returnString = new String("X:" + x + " Y:" + y);
		return returnString;
	}
}
