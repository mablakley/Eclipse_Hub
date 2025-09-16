
// your code goes here [0.5 pts]
import java.util.Random;

public class RandomNumbersApp {
	public static void main(String[] args) {
		int singleSixSidedDieRoll; // you CANNOT change this line
		int singleTwelveSidedDieRoll; // you CANNOT change this line
		int randomInt; // you CANNOT change this line
		int lowerBound = -5; // you CAN change values later for testing
		int upperBound = 3; // you CAN change values later for testing
		double randomDouble; // you CANNOT change this line

		// your code goes (method calls and assignments) here [2 pts]

		singleSixSidedDieRoll = singleSixSidedDollRoll();
		singleTwelveSidedDieRoll = singleTwelveSidedDieRoll();
		randomInt = ranodmInt(lowerBound, upperBound);
		randomDouble = randomDouble(lowerBound, upperBound);

		System.out.println("Six-sided die roll: " + singleSixSidedDieRoll);
		System.out.println("Twelve-sided die roll: " + singleTwelveSidedDieRoll);
		System.out
				.println("Random integer value from the range [" + lowerBound + ", " + upperBound + "]: " + randomInt);
		System.out.println(
				"Random double value from the range [" + lowerBound + ", " + upperBound + "): " + randomDouble);
	}

	

	// your methods go here
	// sixSidedDieRoll method [0.5 pt]
	private static int singleSixSidedDollRoll() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}

	// twelveSidedDieRoll [0.5 pt]
	private static int singleTwelveSidedDieRoll() {
		Random rand = new Random();
		return rand.nextInt(12) + 1;
	}

	// generateRandomInt method [1 pt]
	private static int ranodmInt(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
	}
	// generateRandomDouble method [0.5 pt]
	private static double randomDouble(int lowerBound, int upperBound) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return lowerBound + rand.nextDouble() * (upperBound - lowerBound);
	}
}
