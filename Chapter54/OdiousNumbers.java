import java.util.*;

public class OdiousNumbers {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a number you fool: ");
        int userNumber = scan.nextInt();

        while (userNumber >= 0) {

            String binaryString = "";
            
            for (int i = userNumber; i > 0; i /= 2) {
                // System.out.println(i / 2);
                if (i % 2 == 1) binaryString += "1";
                if (i % 2 == 0) binaryString += "0";
            }
            System.out.println(binaryString);

            if (odious(binaryString)) {
                System.out.println(userNumber + " is an odious number.");
            } else {
                System.out.println(userNumber + " is an evil number.");
            }

            System.out.println("\nEnter a new number fool:");
            userNumber = scan.nextInt();

        }

    }

    private static boolean odious(String statement) {

        int oneCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            if (statement.substring(i, i + 1).equals("1")) oneCount++;
        }

        if (oneCount % 2 == 1) {
            return true;
        } else {
            return false;
        }

    }

}