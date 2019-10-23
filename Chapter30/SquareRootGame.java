import java.util.*;

public class SquareRootGame {
    public static void main(String[] args) {

    
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Player 1 name: ");
        String player1 = scan.nextLine();
        int player1Score = 0;

        System.out.println("Player 2 name: ");
        String player2 = scan.nextLine();
        int player2Score = 0;

        System.out.println("How many rounds: ");
        int rounds = scan.nextInt();
        

        for (int i = 0; i < rounds; i++) {
            
            double square = rand.nextDouble() * 100.0;
            double squareRoot = Math.sqrt(square);

            System.out.println("Where is the square root of " + square + "?" );

            System.out.println(player1 + "'s guess:");
            double player1Guess = scan.nextDouble();

            System.out.println(player2 + "'s guess:");
            double player2Guess = scan.nextDouble();

            System.out.println("The square root was: " + squareRoot);
            if (Math.abs(squareRoot - player1Guess) < Math.abs(squareRoot - player2Guess)) {
                System.out.println(player1 + " wins!");
                player1Score++;
            } else {
                System.out.println(player2 + " wins!");
                player2Score++;
            }

        }

        if (player1Score > player2Score) {
            System.out.println(player1 + " wins with a score of " + player1Score);
            System.out.println(player2 + " had a score of " + player2Score);
        } else {
            System.out.println(player2 + " wins with a score of " + player2Score);
            System.out.println(player1 + " had a score of " + player1Score);
        }

    }

}