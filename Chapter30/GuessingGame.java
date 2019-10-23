import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = rand.nextInt(9) + 1;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Guess: ");
            int guess = scan.nextInt();

            if (guess == randomNumber) {
                System.out.println("Correct!");
                i = 3; // Exit loop.
            } else {
                System.out.println("Wrong. You have " + (3 - i) + " more guess(es).");
                if (i == 3) { // Out of guesses.
                    System.out.println("The number was " + randomNumber);
                }
            }

        }


    }
}