public class PantryTester {

    Static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Welcome to Mother Hubbard's Pantry!");

        Jam goose = new Jam("Gooseberry", "7/4/86", 12);
        Jam apple = new Jam("Crab Apple", "9/30/99", 8);
        Jam rhub = new Jam("Rhubarb", "10/31/99", 3);

        Pantry hubbard = new Pantry(goose, apple, rhub);

        int selection = 0;

        while (selection != -1) {

            int spreadAmount;

            System.out.println("The jams are: ");
            System.out.println(hubbard);

            System.out.println("Enter your selection (1, 2, or 3):");
            selection = scan.nextInt();

            System.out.println("Enter amount to spread:");
            spreadAmount = scan.nextInt;

            hubbard.select(selection);
            hubbard.spread(spreadAmount);

        }


    }
    
}