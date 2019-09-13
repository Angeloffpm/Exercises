import java.util.Scanner;

public class CheckCharge {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Checking Account Balance: ");
        int checkingBalance = scan.nextInt();

        System.out.println("Savings Account Balance: ");
        int savingBalance = scan.nextInt();

        boolean charge;

        if (checkingBalance > 1000 || savingBalance > 1500) {
            charge = false;
        } else {
            charge = true;
        }

        if (charge) {
            System.out.println("Checking and savings accounts below balance, service charge of $0.15 applied.");
        } else {
            System.out.println("Checking and savings accounts above balance, no service charge.");
        }


    }
}