import java.util.Scanner;

public class LogTwo {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scan = new Scanner(System.in);
        double input = scan.nextDouble();
        double baseTwo = Math.log(input) / Math.log(2);
        System.out.println("Base 2 log of " + input + " is " + baseTwo);
    }
}