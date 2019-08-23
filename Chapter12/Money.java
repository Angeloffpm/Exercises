import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println( "Input the cents: ");
        Scanner scan = new Scanner(System.in);
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int extra_cents = cents % 100;
        System.out.println( "That is " + dollars + " dollars and " + extra_cents + " cents.");
    }
}