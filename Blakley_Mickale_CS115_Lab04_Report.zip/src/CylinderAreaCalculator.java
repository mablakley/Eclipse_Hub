
public class CylinderAreaCalculator {
	public static void main (String [] args){
		// Declare surfaceArea variable
		double surfaceArea;  // complete [0.5 pt]
		
		// Point P1 coordinates as variables | declaration and initialization
		double D = 2;  // complete [0.5 pt]
		double h = 1;  // complete [0.5 pt]
		
		// Calculate surface area USING calculateCylinderArea method:
		// ADD YOUR CODE here [1 pts]
		surfaceArea = calculateCylinderArea(D, h);
		
		// Display obtained cylinder surface area on screen:
		System.out.println("The surface area of a cylinder with height h = " + h + " and diameter D = " + D + " is " + surfaceArea + " units squared.");
	}
	
	// calculateCylinderArea method:
	public static double calculateCylinderArea(double diameter, double height){// complete [1 pt]
		// YOU HAVE TO USE calculateRectangleArea and calculateCircleArea methods here
		// ADD YOUR CODE here [4.5 pts]
		double area = 2 * calculateCircleArea(diameter / 2)
				+ calculateRectangleArea(Math.PI * diameter, height);
		return area;
		
	}
		
	// calculateCircleArea method:
	public static double calculateCircleArea(double radius){
		// Declare LOCAL (to the method) area variable
		double circleArea;
		
		// calculate circle area
		circleArea = Math.PI * Math.pow(radius, 2.0);
		
		// return the calculated area
		return circleArea;
	}
	
	// calculateRectangleArea method:
	public static double calculateRectangleArea(double sideA, double sideB){
		// Declare LOCAL (to the method) area variable
		double rectangleArea;
		
		// calculate rectangle area
		rectangleArea = sideA * sideB;
		return 0;
		// return the calculated area
	}
}