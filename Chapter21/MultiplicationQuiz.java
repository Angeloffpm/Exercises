import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int counter = 0;
        int answer = 0;
        int userAnswer;
        int randomNumber1;
        int randomNumber2;
        int amountCorrect = 0;

        while ( counter < 10 ) {

            randomNumber1 = random.nextInt(10);
            randomNumber2 = random.nextInt(10);
            answer = randomNumber1 * randomNumber2;

            System.out.println("What is " + randomNumber1 + " x " + randomNumber2 + ":");
            
            userAnswer = scan.nextInt();

            if ( userAnswer == answer ) {
                System.out.println("Correct!");
                amountCorrect++;
            } else {
                System.out.println("Wrong!");
                System.out.println(randomNumber1 + " x " + randomNumber2 + " is actually " + answer);
            }
            
            counter++;
        }

        System.out.println("You got " + amountCorrect + "/10");


    }
}