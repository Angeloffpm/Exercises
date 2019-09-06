import java.util.Scanner;

public class Pie {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Weight: ");
        int weight = scan.nextInt();

        boolean elgible;

        if (weight >= 220 && weight <= 280) {
            elgible = true;
        }else{
            elgible = false;
        }

        if (elgible) {
            System.out.println("You are allowed in the contest.");
        }else{
            System.out.println("You are not allowed in the contest.");
        }

    }
}