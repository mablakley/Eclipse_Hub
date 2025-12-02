import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		int total = 0;
		int count = 0;

		while (count < 10) {
			num = s.nextInt();
			if (num % 2 == 0) {
				total = num + total;
				count++;
			} else {
				System.out.print("Enter another");
			}

		}
		System.out.print(total);

	}

}
