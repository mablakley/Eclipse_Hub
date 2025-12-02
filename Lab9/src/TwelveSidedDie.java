import java.util.Random;

public class TwelveSidedDie {
	private int value;
	private Random r = new Random();
	
	public int roll() {
		value = r.nextInt(1, 13);
		return value;
	}
	
	public String toString() {
		String str = "rolled: " + value;
		return str;
		
	}
}
