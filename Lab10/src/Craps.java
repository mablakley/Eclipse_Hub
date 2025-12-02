import java.util.Scanner;
public class Craps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int bank = 0;
		int bet;
		int totalBet = 0;
		int target = -1;
		Die d1 = new Die();
		Die d2 = new Die();
		
		System.out.println("place your bet:");
		while((bet = s.nextInt()) >= 0) {
			totalBet += bet;
			d1.roll();
			d2.roll();
			System.out.println("rolled " + d1 + " " + d2);
			if(target == -1 && d1.getSide() + d2.getSide() == 7) {
				System.out.println("You win, lucky");
			}
			else if (target == -1) {
				target = d1.getSide() + d2.getSide();
				System.out.println("target roll is set to " + target);
			}
			
			else if (d1.getSide() + d2.getSide() == target) {
				System.out.println("You win!");
				target = -1;
				bank += totalBet;
				totalBet = 0;
				
			} else if(d1.getSide() + d2.getSide() == 7) {
				System.out.println("you lose");
				target = -1;
				bank -= totalBet;
				totalBet = 0;
			}
			else {
				System.out.println("roll again");
			}
			System.out.println("Bank: " + bank);
			
		}
		System.out.println("Thanks for playing");
		

	}

}
