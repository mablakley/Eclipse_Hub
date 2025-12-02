import java.util.Scanner;
import java.util.Random;

public class PiApproximation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter t:");
		double t = s.nextDouble();
		// System.out.println("pi approximation " + approximate(t));
		double piEstimate = approximate(t);
		System.out.println("pi approximate = " + piEstimate);

	}

	public static double approximate(double t) {
		double piApp = 0;
		int iterations = 0;
		int pointsInCircle = 0;
		double totalpts = 0;
		Random rand = new Random();
		
		while (Math.abs(piApp - Math.PI) > t) {
			
			for(int i = 0; i < 10000; i++) {
			double x = rand.nextDouble() * 2 - 1; 
			double y = rand.nextDouble() * 2 - 1; 
			
			
			if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) < 1) {
				pointsInCircle++;
				totalpts++;		
//				System.out.println(piApp);
			} else {
				totalpts++;
			}	
			
			
			piApp = 4 * pointsInCircle / totalpts;
		}
		
		
			
			
//		if(Math.abs(Math.PI - piApp) < t) {
//			return piApp;
//		} else {
//			iterations++;
//		}
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
//		double piApp = 0;
//		double insidePts = 0;
//		double totalPts = 0;
//		Random rand = new Random();
//
//		do {
//			double x = rand.nextDouble() * 2 - 1; 
//			double y = rand.nextDouble() * 2 - 1; 
//			System.out.println("pi approximation= " + piApp);
//
//			totalPts++;
//			if (x * x + y * y <= 1) {
//				insidePts++;
//			}
//
//			piApp = 4.0 * insidePts / totalPts;
//		} while (Math.abs(piApp - Math.PI) > t);

		return piApp;
	}

}
