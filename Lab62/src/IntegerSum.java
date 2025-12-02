import java.util.Scanner;

public class IntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		
		num = s.nextInt();
		while(num != -1) {
			sum += num;
			num = s.nextInt();
		}
		System.out.println(sum);

	}

}
