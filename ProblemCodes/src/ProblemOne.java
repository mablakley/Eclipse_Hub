
public class ProblemOne {
	private static float distanceFromBuilding = 32;
	private static float angleMeasurment = 65;
	private static double heightofBuilding;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		heightofBuilding = Math.tan(angleMeasurment) * distanceFromBuilding;
		System.out.print(heightofBuilding);

	}

}
