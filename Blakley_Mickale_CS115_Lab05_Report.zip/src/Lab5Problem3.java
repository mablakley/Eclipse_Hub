import java.util.Scanner;

public class Lab5Problem3 {

	public static void main(String args[]){
		// Your code goes here…
		double length, width, height, volume;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height: ");
		length = input.nextDouble();
		System.out.println("What is the width: ");
		width = input.nextDouble();
		System.out.println("What is the hieght: ");
		height = input.nextDouble();
		if (length > 0 && width > 0 && height > 0) {
			volume = height * width * length;
			System.out.println("volume is: " + volume);
		} else {
			volume = 0;
			System.out.println("ERROR: Cannot calculate volume ");
		}



	}
}
