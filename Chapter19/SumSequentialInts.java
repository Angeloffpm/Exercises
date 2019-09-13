import java.util.Scanner;

public class SumSequentialInts {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = scan.nextInt();

        int formSum = (n * (n + 1)) / 2;

        int count = 1;
        int loopSum = 0;

        while (count <= n) {
            loopSum = loopSum + count;
            count++;
        }

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formular Sum = " + formSum);

    }
}