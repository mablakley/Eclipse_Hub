
public class DailySales {

	public int[] sales;
	private int daysInMonth;

	public DailySales() {
		this.daysInMonth = 31;
		this.sales = new int[this.daysInMonth];
	}

	public DailySales(int daysInMonth) {
		this.sales = new int[daysInMonth];
		if (daysInMonth < 1 || daysInMonth > 31) {
			this.daysInMonth = 31;
		} else
			this.daysInMonth = daysInMonth;
		this.sales = new int[daysInMonth];

	}

	public boolean addSales(int dayNumber, int sales) {
		if (dayNumber < 0 || dayNumber > this.daysInMonth) {
			return false;
		}
		if (sales < 0) {
			return false;
		}
		this.sales[dayNumber - 1] += sales;
		return true;

	}

	public int maxDay() {
		int max = sales[0];
		for (int i = 1; i < daysInMonth; i++) {
			if (sales[i] > max) {
				max = sales[i];
			}
		}
		return max;

	}
	

	public int[] daysBelowGoal() {
        int count = 0;

        
        for (int i = 0; i < daysInMonth; i++) {
            if (sales[i] < 100) {
                count++;
            }
        }

       
        int[] result = new int[count];
        int idx = 0;

        for (int i = 0; i < daysInMonth; i++) {
            if (sales[i] < 100) {
                result[idx++] = i + 1;
            }
        }

        return result;
    }
}


