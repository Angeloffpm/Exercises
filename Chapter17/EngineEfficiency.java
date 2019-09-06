import java.util.Scanner;

public class EngineEfficiency {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Air temp: ");
        double airTemp = scan.nextInt();

        System.out.println("Steam temp: ");
        double steamTemp = scan.nextInt();

        double efficiency;

        if (steamTemp < 373) {
            efficiency = 0.0;
            System.out.println("No steam. Efficiency 0.");
        } else {
            efficiency = 1.0 - (airTemp / steamTemp);
            System.out.println("Efficiency: " + efficiency);
        }


    }
}