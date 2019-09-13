import java.util.Scanner;

public class DotSeperation {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = scan.nextLine();
        
        System.out.println("Enter second word: ");
        String secondWord = scan.nextLine();
        
        int length = firstWord.length() + secondWord.length();

        String dots = new String();

        while (length < 30) {
            dots += '.';
            length++;
        }

        System.out.println(firstWord + dots + secondWord);

    }
}