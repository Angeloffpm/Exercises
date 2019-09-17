import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int initialMiles = 0;

        while (initialMiles >= 0) {
            
            System.out.println("Initial miles: ");
            initialMiles = scan.nextInt();
            
            if (initialMiles > 0) {
                System.out.println("Final miles: ");
                double finalMiles = scan.nextDouble();
                
                System.out.println("Gallons: ");
                int gallons = scan.nextInt();
    
                double mpg = (finalMiles - initialMiles) / gallons * 1.0;
                System.out.println("Miles per Gallon: " + mpg);
            } else {
                System.out.println("Bye");
            }

        }




    }
}