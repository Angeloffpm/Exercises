import java.util.Scanner;

public class SumOfDivisors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();
        int divisorSum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                divisorSum += i;
            }

        }

        System.out.println("Sum of divisors: " + divisorSum);
        
        if (divisorSum == n) {
            System.out.println(n + " is a perfect number.");
        }

    }
}