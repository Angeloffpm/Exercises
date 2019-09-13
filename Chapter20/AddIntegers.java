import java.util.Scanner;

public class AddIntegers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added: ");
        int amount = scan.nextInt();

        int currentInt;
        int sum = 0;
        int count = 1;

        while (count <= amount) {
            System.out.println("Enter an integer: ");
            currentInt = scan.nextInt();
            sum += currentInt;
            count++;
        }

        System.out.println("Sum: " + sum);

    }
}