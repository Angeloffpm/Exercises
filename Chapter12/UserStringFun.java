import java.util.Scanner;

public class UserStringFun {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String string = new String(scan.nextLine());
        
        System.out.println("Enter beginning index: ");
        int beg = scan.nextInt();

        System.out.println("Enter ending index: ");
        int end = scan.nextInt();

        String substring = string.substring(beg, end);
        System.out.println("Original string: " + string);
        System.out.println("Substring: " + substring);
    }
}