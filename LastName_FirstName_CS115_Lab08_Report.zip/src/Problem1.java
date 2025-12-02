import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s;
		int x;
		int n;
		double sum;
		sum = 0;
		s = new Scanner(System.in);
		System.out.println("enter x: ");
		x = s.nextInt();
		System.out.println("enter n: ");
		n = s.nextInt();
		if (n < 1) {
			System.out.println("error n is less than 1");
			System.exit(1);
		}
		for (double i = 1; i <= n; i++) {
			sum += Math.pow(x, i) / i;
		}
		System.out.println("your sum is " + sum);
	}

}
