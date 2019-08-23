import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        double x = scan.nextDouble();

        System.out.println("Enter Y: ");
        double y = scan.nextDouble();

        double a_mean = (x + y) / 2;
        double h_mean = 2 / ( (1/x) + (1/y) );

        System.out.println("Arithmetic mean: " + a_mean);
        System.out.println("Harmonic mean: " + h_mean);

    }
}