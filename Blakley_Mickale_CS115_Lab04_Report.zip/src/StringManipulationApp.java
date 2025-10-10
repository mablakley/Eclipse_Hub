import java.util.Scanner;
// your code goes here [0.25 pts]

public class StringManipulationApp {
	public static void main(String[] args) {
		String textInput = ""; // you CANNOT change this line
		Scanner myScanner = new Scanner(System.in);
		// your code goes here [0.25 pts]

		System.out.println("Enter your text, please [at least 10 characters long]: ");
		textInput = myScanner.nextLine();

		// your code (call the method) goes here [0.5 pts]
		manipulateString(textInput);
	}

	

// your method code goes here [4 pts | 7 x 0.5 pts (per line) + 0.5 pts header]
	private static void manipulateString(String input) {
		System.out.println("The original string is: " + input);
		System.out.println("The lenght was: " + input.length());
		System.out.println("Entire provided string in UPPER CASE: " + input.toUpperCase());
		System.out.println("Entire provided string in lower CASE: " + input.toLowerCase());
		System.out.println("First FOUR characters of the provided string are: " + input.substring(0, 4));
		System.out.println("Last FOUR characters of the provided string are: " + input.substring(input.length() - 4));
		System.out.println("Character at index = 5: " + input.charAt(5));
	}
}
