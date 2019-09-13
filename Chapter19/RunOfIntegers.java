import java.util.Scanner;

public class RunOfIntegers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Starting integer: ");
        int start = scan.nextInt();
        
        System.out.println("Ending integer: ");
        int end = scan.nextInt();

        int counter = start;

        while (counter <= end) {
            System.out.println(counter);
            counter++;
        }


    }
}