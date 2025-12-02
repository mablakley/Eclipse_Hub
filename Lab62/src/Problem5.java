import java.util.Random;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int cnt = 0;
		Random r = new Random();

		while (sum < 40) {
			if (cnt < 10) {
				int randomInt = r.nextInt(10) + 1;
				sum = sum + randomInt;
				cnt++;
				System.out.println(randomInt);
			} 
		}

		System.out.println(sum);

	}

}








































//		while (cnt < 10 && sum < 40) {
//			int randomInt = r.nextInt(10) + 1;
//			sum = sum + randomInt;
//			cnt++;
//		}
//		System.out.println(sum);