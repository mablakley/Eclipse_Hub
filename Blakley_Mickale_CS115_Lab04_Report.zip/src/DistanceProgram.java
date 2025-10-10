public class DistanceProgram {
	public static void main (String [] args){
		// Declare distance variable
		double distance; // complete [0.5 pt]
		
		// Point P1 coordinates as variables | declaration and initialization
		float x1Coordinate = 0; // complete [0.5 pt]
		float y1Coordinate = 1; // complete [0.5 pt]
		
		// Point P2 coordinates as variables | declaration and initialization
		float x2Coordinate = 0; // complete [0.5 pt]
		float y2Coordinate = -1; // complete [0.5 pt]	
		
		// Calculate distance:
          // ADD YOUR CODE here [0.5 pts]
		distance = calculateDistance(x1Coordinate, y1Coordinate, x2Coordinate, y2Coordinate);
		
		// Display obtained distance on screen:
		System.out.println("The distance between point P1 and P2 is " + distance + " units.");
	}
	
	// calculateDistance method header
	public static double calculateDistance(float x1, float y1, float x2, float y2){
		double first = Math.pow((x2 - x1), 2);
		double second = Math.pow((y2 - y1), 2);
		return Math.sqrt(first + second); // complete [1 pt]
		// ADD YOUR CODE here [4 pts]
	}
}
