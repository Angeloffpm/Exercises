import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.println("Change due: ");
        Scanner scan = new Scanner(System.in);
        int totalCents = scan.nextInt();

        int dollars = totalCents / 100;
        totalCents = totalCents - (dollars * 100);
        int quarters = totalCents / 25;
        totalCents = totalCents - (quarters * 25);
        int dimes = totalCents / 10;
        totalCents = totalCents - (dimes * 10);
        int nickels = totalCents / 5;
        totalCents = totalCents - (nickels * 5);
        int pennies = totalCents;

        System.out.println("Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
    }
}