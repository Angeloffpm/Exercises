import java.util.Scanner;

public class ApplianceCost {
    public static void main(String[] args) {
        System.out.println("Enter cost per kilowatt-hour in cents: ");
        Scanner scan = new Scanner(System.in);
        double cost = scan.nextDouble();

        System.out.println("Enter kilowatt-hours used per year: ");
        double energy = scan.nextDouble();

        double annual_cost = (cost * energy) / 100.0;
        System.out.println("Annual cost: " + annual_cost);
    }
}