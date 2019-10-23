import java.util.Random;
import java.util.Scanner;

public class PasswordCracker {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter a password:");
        String password = scan.nextLine();

        String choices = new String("abcdefghijklmnopqrstuvwxyz");
        String guess = new String("");


        int count = 0;
        while (!guess.equals(password)) {

            guess = "";

            for (int i = 0; i < password.length(); i++) {

                guess += choices.charAt(rand.nextInt(choices.length()));

            }

            count++;

        }

        System.out.println("Your password is: " + guess);
        System.out.println("It took " + count + " tries.");


    }
}