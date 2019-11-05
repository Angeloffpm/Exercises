import java.util.*;

public class PantryTester {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Mother Hubbard's Pantry!");

        Jam goose = new Jam("Gooseberry", "7/4/86", 12);
        Jam apple = new Jam("Crab Apple", "9/30/99", 8);
        Jam rhub = new Jam("Rhubarb", "10/31/99", 3);
        Jam uglyJam = new Jam("UglyJam", "2/29/2100", 1000);

        Pantry hubbard = new Pantry(goose, apple, rhub);

        int selection = 0;

        while (selection != -1) {

            int spreadAmount;

            System.out.println("The jams are: ");
            System.out.println(hubbard);

            System.out.println("Enter your selection (1, 2, or 3):");
            selection = scan.nextInt();

            System.out.println("Enter amount to spread:");
            spreadAmount = scan.nextInt();

            if (hubbard.select(selection)) {
                hubbard.spread(spreadAmount);
            } else {
                System.out.println("Selection not available.");
            }

            String mixOption;
            System.out.println("Check to mix fruits? (y or n)");
            mixOption = scan.nextLine();
            if (mixOption.equals("y")) {
                hubbard.mixedFruit();
            }

        }


    }
    
}