
public class DailySales {
	public int[] sales;
	private int daysInMonth;

	public DailySales(int daysInMonth) {
		this.sales = new int[daysInMonth];
		if (daysInMonth < 1 || daysInMonth > 31) {
			this.daysInMonth = 31;
		} else
			this.daysInMonth = daysInMonth;

	}

	public boolean addSales(int dayNumber, int sales) {
		if (dayNumber < 0 || dayNumber > this.daysInMonth) {
			return false;
		} 
		if (sales < 0) {
			return false;
		}
		return true;

	}

	public int maxDay() {
		int max = sales[0];
		for (int i = 1; i < daysInMonth; i++) {
			if(sales[i] > max) {
				max = sales[i];
			}
		}
		return sales[3];
		
	}

	public int[] daysBelowGoal() {
		return null;

	}

}
