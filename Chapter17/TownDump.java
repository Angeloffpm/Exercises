import java.util.Scanner;

public class TownDump {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Load of trash: ");
        int trashWeight = scan.nextInt();

        int cost;

        if (trashWeight < 200) {
            cost = 20;
        } else {
            cost = 20 + 8 * ((trashWeight - 200) / 100); 
        }

        System.out.println("Cost of trash: $" + cost);


    }
}