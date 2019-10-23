import java.util.*;

public class PigDiceGame {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int playerScore = 0;
        int computerScore = 0;

        while (playerScore < 100 && computerScore < 100) {

            int compTurn = 0;
            for (int i = 0; i < 3; i++) {

                int compDiceRoll = rand.nextInt(5) + 1;
                
                if (compDiceRoll == 1) {
                    i = 3;
                    compTurn = 0;
                } else {
                    compTurn += compDiceRoll;
                }

            }
            computerScore += compTurn;
            System.out.println("The computer scored " + compTurn + " points this turn.\n");


            int playerTurn = 0;
            int rollAgain = 1;
            while (rollAgain == 1) {

                int playerDiceRoll = rand.nextInt(5) + 1;

                if (playerDiceRoll == 1) {
                    rollAgain = 0;
                    playerTurn = 0;
                    System.out.println("You rolled a 1. No points this turn.");
                } else {
                    playerTurn += playerDiceRoll;
                    System.out.println("You rolled a " + playerDiceRoll + ". You have " + playerTurn + " points this turn.");
                    System.out.println("Roll again? (0 for no, 1 for yes) ");
                    rollAgain = scan.nextInt();
                }
                

            }
            playerScore += playerTurn;

            System.out.println("\nScore:");
            System.out.println("Computer: " + computerScore);
            System.out.println("You: " + playerScore + "\n");

        }



    }
}