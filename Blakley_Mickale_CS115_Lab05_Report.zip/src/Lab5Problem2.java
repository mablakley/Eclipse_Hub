import java.util.Scanner;

public class Lab5Problem2 {

	public static void main(String args[]) {
		// Your code goes here…
		
		float x,y;
		Scanner input = new Scanner(System.in);
		System.out.println("Your input: ");
		x = input.nextFloat();

		double z = Math.pow(x, 3); // 8
		double w = (z - 4) * (x - 3) / 7;
		if(z >= w && x < z) {
			 y = 4 * x;
		} else {
			 y = 2 * x;
		}
		System.out.println(y);
		
	}
}
