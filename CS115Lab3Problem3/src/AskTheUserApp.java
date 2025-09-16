// your code goes here [0.25 pts]
import java.util.Scanner;



public class AskTheUserApp {
	
	public static void main (String [] args){
		String name;   // you CANNOT change this line
		int age;   // you CANNOT change this line
		double heightInMeters;   // you CANNOT change this line
		String favoriteMovie;   // you CANNOT change this line
		
		// your code (setup) goes here [0.25 pts]
		
		Scanner sin = new Scanner(System.in);
		
		// your code (ask for keyboard input and store) goes here [1.75 pts]	
		System.out.println("Enter your name: ");
		name = sin.nextLine();
		System.out.println("What is your favorite movie: ");
		favoriteMovie = sin.nextLine();
		System.out.println("What is your age in years: ");
		age = sin.nextInt();
		System.out.println("What is your height in meters: ");
		heightInMeters = sin.nextDouble();
		sin.close();

		// your code (call the method) goes here [0.25 pts]
		displayUserInformation(name, age, heightInMeters, favoriteMovie); 
		
//		System.out.print("Your name is " + name);
//		System.out.print("Your favorite movie is " + favoriteMovie);
//		System.out.print("Your age is " + age);
//		System.out.print("Your height is " + heightInMeters);
		
		
	}

	
	
// your method code goes here [2.5 pts total ]
	private static void displayUserInformation(String name, int age, double heightInMeters, String favoriteMovie) {
		// TODO Auto-generated method stub
		System.out.println("Your name is " + name);
		System.out.println("Your favorite movie is " + favoriteMovie);
		System.out.println("Your age is " + age);
		System.out.println("Your height is " + heightInMeters);
	}
// 4 x 0.5 pts (per line) + 0.5 pts header]
}
