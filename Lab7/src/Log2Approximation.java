import java.util.Scanner;

public class Log2Approximation {
	private static int numberOfTerms = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter t: ");
		double t = s.nextDouble();
		double log = approximate(t);
		// int numberOfTerms = 500;
		System.out.println("Actual log(2) value: " + Math.log(2.0));
		System.out.println("Number of terms used for approximation: " + numberOfTerms);
		System.out.println("Final log(2) approximation with t = " + t + " : " + log);
	}

	// to write a function
	// 1. the name
	// 2. the return type
	// 3. parameters (type and name of each)
	static double approximate(double t) {
		numberOfTerms = 0;
		double sum = 0;

		while (Math.abs(Math.log(2.0)) - sum > t) {
			
			if (numberOfTerms % 2 == 0) {
				sum -= 1 / ((double) numberOfTerms);
				numberOfTerms++;
			} else {
				numberOfTerms++;
				sum += 1 / ((double) numberOfTerms);
			}

		}

		return sum;
	}

}
