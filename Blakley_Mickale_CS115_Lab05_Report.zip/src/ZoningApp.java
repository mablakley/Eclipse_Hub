
import java.util.*;
import java.text.*;

public class ZoningApp {
	// class attributes [static]
	// you HAVE to reference these in your code!!!!
	private static final int ZONE_1_LOWER_BOUND = 0;
	private static final int ZONE_2_LOWER_BOUND = 2000;
	private static final int ZONE_3_LOWER_BOUND = 5000;
	private static final double ZONE_1_BASE_HEIGHT = 25.0d;
	private static final double ZONE_2_BASE_HEIGHT = 25.0d;
	private static final double ZONE_3_BASE_HEIGHT = 52.5d;
	private static final double ZONE_2_MULTIPLIER = 0.01d;
	private static final double ZONE_3_MULTIPLIER = 0.25d;

	public static void main(String[] args) {
		// ask user for width, height, validate inputs, call methods, display results
		Scanner scan = new Scanner(System.in);


		System.out.print("Enter lot width in feet: ");
		double width = scan.nextDouble();

		System.out.print("Enter lot length in feet: ");
		double length = scan.nextDouble();

		double lotArea = width * length;
		double heightLimit = getHeightLimit(lotArea);
		int unitCount = getUnitCount(lotArea);

		if (width <= 0 || length <= 0) {
			System.out.println("Error: Both width and length must be positive numbers.");
		} else {
			System.out.println("Lot Area: " + lotArea + " square feet");
			System.out.println("Height Limit: " + heightLimit + " feet");
			System.out.println("Unit Count Limit: " + unitCount);

		}

		// Display results

	}

	// add methods here
	public static double getHeightLimit(double lotArea) {
		if (lotArea <= ZONE_2_LOWER_BOUND) {
			return ZONE_1_BASE_HEIGHT;
		} else if (lotArea > ZONE_2_LOWER_BOUND && lotArea <= ZONE_3_LOWER_BOUND) {
			double extraArea = lotArea - ZONE_2_LOWER_BOUND;
			return ZONE_2_BASE_HEIGHT + (ZONE_2_MULTIPLIER * extraArea);
		} else {
			double extraArea = lotArea - ZONE_3_LOWER_BOUND;
			return ZONE_3_BASE_HEIGHT + (ZONE_3_MULTIPLIER * extraArea);
		}
	}

	public static int getUnitCount(double lotArea) {
		if (lotArea <= ZONE_2_LOWER_BOUND) {
			return 1;
		} else if (lotArea > ZONE_2_LOWER_BOUND && lotArea <= ZONE_3_LOWER_BOUND) {
			return 2;
		} else {
			return 4;
		}
	}
}
