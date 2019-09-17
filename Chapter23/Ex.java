import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = scan.nextDouble();

        double currentTerm = 1.0;
        int n = 1;
        double answer = 1.0;

        while (currentTerm > 1.0E-12) {

            currentTerm = currentTerm * (x / n);
            n++;
            answer = answer + currentTerm;

        }

        double realAnswer = Math.exp(x);

        System.out.println("Your e^" + x + " : " + answer);
        System.out.println("Calculated e^" + x + " : " + realAnswer);

    }
}