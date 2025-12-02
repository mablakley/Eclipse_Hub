package pack;

public class Problem2 {

	public static void main(String[] args) {
		int total = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000000; i++) {
			total += montyHallTrial(true);
		}
		
		System.out.print(total);

	}

	public static int montyHallTrial(boolean playerSwitch) {
		int doorChoice;
		int winningDoor;
		int goatDoor;
		
		doorChoice = ((int) Math.floor(Math.random() * 3)) + 1;
		winningDoor = ((int) Math.floor(Math.random() * 3)) + 1;
		if (playerSwitch) {
			if(winningDoor == doorChoice){
				return 0;
			} else {
				return 1;
			}
		} else {
			if(winningDoor == doorChoice) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}

}
