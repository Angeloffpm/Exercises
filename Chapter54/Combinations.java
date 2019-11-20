import java.util.*;

public class Combinations {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();

        System.out.println("Enter R: ");
        int r = scan.nextInt();

        long ncr = (FactorialTester.factorial(n) / (FactorialTester.factorial(r) * FactorialTester.factorial(n-r)));
        System.out.println("ncr: " + ncr);

    }

}