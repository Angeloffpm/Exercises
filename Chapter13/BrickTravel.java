import java.util.Scanner;

public class BrickTravel {
    public static void main(String[] args) {
        System.out.println("Enter how long in seconds: ");
        Scanner scan = new Scanner(System.in);
        double seconds = scan.nextDouble();

        double distance = (0.5) * 32.174 * seconds * seconds;
        System.out.println("Distance: " + distance);
    }
}