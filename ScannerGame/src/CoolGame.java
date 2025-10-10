import java.util.Scanner;

public class CoolGame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c, s, width, height;

		a = 20;
		b = 10;
		c = 5;
		s = sum(a, b, c); // encapsulate the process of summing number
		System.out.println(s);

		width = 13; // feet
		height = 125.5f; // inches
		System.out.println(width + " feet is equal to " + toInches(width) + " inches");
		System.out.println(height + " feet is equal to " + toFeet(height) + " feet");
		System.out.println(checkNumber(10,50,75));
		System.out.println(toFeetAndInches(height));
		System.out.println(isOrder(3,6,9));
		System.out.println(hundred(909000));
		

	}

	static String toFeetAndInches(float d) {
		String s;
		int feet;
		float inches;
		
		feet = (int) d / 12; // cast for int division to get whole feet
		inches =  d % 12;
		
		return feet + " feet " + inches + " inches";
	}

	
	
	
	static float toFeet(float inches) {
		return inches / 12;
	}

	static float toInches(float feet) {

		return feet * 12;
	}

	static float sum(float x, float y, float z) {
		return x + y + z;
	}
	
	static boolean checkNumber(int low, int high, int n) {
		if(n >= low && n <= high) {
			return true;
		}
		else return false;
	}
	
	static boolean isOrder(float x, float y, float z) {
		if(x < y && y < z) {
			return true;
		}
		else return false;
	}
	
	static int hundred(float x) {
		return Math.round(x / 100) * 100;
	}
}
