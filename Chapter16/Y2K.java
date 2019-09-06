import java.util.Scanner;

public class Y2K {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Year of Birth: ");
        int birthYear = scan.nextInt();

        System.out.println("Current year: ");
        int currentYear = scan.nextInt();

        int age;

        if (birthYear > currentYear) {
            age = (currentYear + 100) - birthYear;
        }else{
            age = currentYear - birthYear;
        }

        if (age > 100) {
            age = age - 100;
        }

        System.out.println("Your age: " + age);


    }
}