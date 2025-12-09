
public class Problem2 {
	
	static public DailySales DailySales;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailySales = new DailySales(5);
		
		DailySales.addSales(1, 2);
		DailySales.addSales(2, 30);
		DailySales.addSales(3, 500);
		DailySales.addSales(4, 2);
		DailySales.addSales(5, 2);
		System.out.println(DailySales.maxDay());
		
		

	}

}
