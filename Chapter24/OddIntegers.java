import java.util.Scanner;

public class OddIntegers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();
        int oddSum = 0;
        int nSquared = n * n;

        for (int i = 1; i <= n; i+= 2) {
            oddSum += i;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + ": " + oddSum);
        System.out.println(n + " squared: " + nSquared);

    }
}