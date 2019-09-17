import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        double x = scan.nextDouble();
        
        System.out.println("Enter N: ");
        int n = scan.nextInt();

        if (n >= 0) {
            int count = 0;
            double answer = 1.0;
            
            while (count < n) {
                answer = answer * x;
                count++;
            }

            System.out.println(x + " raised to the power " + n + " is: " + answer);
        } else {
            System.out.println("N must be a positive integer.");
        }


    }
}