
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1; double y = 1; int i = 0; 
		do { 
		  y = y / 2; 
		  x = x + y; 
		  i++; 
		  System.out.print(i + " ");
		} while (x < 1.8); 
		System.out.print(i + " ");

	}

}
