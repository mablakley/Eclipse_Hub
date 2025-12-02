
public class RollDice {

	static public SixSidedDie ssd;
	static public TwelveSidedDie ttd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ssd = new SixSidedDie();
		ssd.roll();
		ttd = new TwelveSidedDie();
		ttd.roll();

//		System.out.println(ssd.toString());
//		System.out.println(ttd.toString());
		game1();
		game2();

	}

	

	private static void game1() {
		int sum = 0;
		int a,b;
		int result = 0;

		for (int i = 1; i < 11; i++) {
			a = ssd.roll();
			b = ttd.roll();
			System.out.println("Iteration " + i + ": A rolled " + a 
			+ " and B rolled " + b);
			sum = a + b;
			result = sum + result;
			
		}
		System.out.println("Final sum of rolls: " + result + "\n\n");

	}
	

	private static void game2() {
		int sum = 0;
		int a,b;
		int count = 0;
		
		while(sum != 8) {
			a = ssd.roll();
			b = ttd.roll();
			count++;
			System.out.println("Iteration " + count + ": A rolled " + a 
					+ " and B rolled " + b);
			sum = a + b;
		}
		System.out.println("It took " + count + " iterations to roll a sum of 8");
		
	}

	

}
