import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people: ");
        int n = scan.nextInt();

        double probability = 1.0;

        for (int i = 0; i <= n; i++) {

            probability *= ((365 - i) / 365.0);
            System.out.println(probability);

        }

        System.out.println("There is a " + (probability * 100) + "% chance there are no shared birthdays.");

    }
}