import java.util.Scanner;

public class Gscanner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dark Tunnel Adventure!");
        System.out.println("You were kidnapped and wake up in a dark tunnel with different routes.");
        System.out.println("Do you go left (1), or right (2)");
        System.out.print("Enter 1 or 2: ");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            System.out.println("\nYou walk to the left passage.");
            System.out.println("You see an alligator and look around to find a weapon. Do you take the stick (1) or the crowbar (2)?");
            System.out.print("Enter 1 or 2: ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.println("\nThe alligator ate the stick as well as you.");
            } else if (choice2 == 2) {
                System.out.println("\nYou were able to beat the alligator and escaped");
            } else {
                System.out.println("\nConfused, you stand there and the alligator eats you.");
            }

        } 
        
        
        
        
        
        else if (choice1 == 2) {
            System.out.println("\nYou walk to the right passage.");
            System.out.println("You see a faint light in the distance but a ladder next to you. Do you head toward the light (1) climb up the ladder (2)?");
            System.out.print("Enter 1 or 2: ");
            int choice2 = scanner.nextInt();

            if (choice2 == 1) {
                System.out.println("\n You head to the light and find a police station at the end of the tunnel. You're safe.");
            } else if (choice2 == 2) {
                System.out.println("\nYou climb up the ladder to eat the bear and it mauls you");
            } else {
                System.out.println("\nConfused, you stand there and the tunnel caves in on itself.");
            }

        } else {
            System.out.println("\nYou stand still for too long. Something sneaks up behind you...");
        }

        System.out.println("\nTHE END.");
        scanner.close();
    }

}
