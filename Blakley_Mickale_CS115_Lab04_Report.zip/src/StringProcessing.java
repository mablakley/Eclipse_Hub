
import java.util.Scanner;

public class StringProcessing {
	public static void main (String [] args){
		// declare input String variable and set it to an empty string
		String input = "";
				
		// Set up the Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// Prompt the user for input:
		System.out.println("Enter a line of text: ");
		input = myScanner.nextLine();
		
		System.out.println("You entered: " + input);
		String inputAllLower = input.toLowerCase(); //[0.2 pt]
		String inputAllUpper = input.toUpperCase(); //[0.2 pt]
		System.out.println("Your input in lowercase: " + inputAllLower);
		System.out.println("Your input in UPPERCASE: " + inputAllUpper);
		System.out.println("Five leftmost characters in your input: " + input.substring(0, 4)); //[0.6 pt]
		System.out.println("Five rightmost characters in your input: " + input.substring(input.length() - 4)); //[1 pt]
		System.out.println("Substring 'cs115' is located at index : " + input.indexOf("cs115")); //[1 pt]
		System.out.println("Your input AFTER replacing substring 'cs115' with 'class' : " + input.replace("cs115", "class")); //[1  pt]
				
		// We don't need the Scanner object anymore - close
		myScanner.close();
	}
}
