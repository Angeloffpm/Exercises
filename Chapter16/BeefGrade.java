import java.util.Scanner;

public class BeefGrade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("The price per pound of package \"A\":");
        double pppA = scan.nextDouble();

        System.out.println("The percent lean in package \"A\":");
        int plA = scan.nextInt();

        System.out.println("The price per pound of package \"B\":");
        double pppB = scan.nextDouble();

        System.out.println("The percent lean in package \"B\":");
        int plB = scan.nextInt();

        double leanValueA = pppA * (100.0 / plA);
        double leanValueB = pppB * (100.0 / plB);

        System.out.println("Package A cost per pound of lean: " + leanValueA);
        System.out.println("Package B cost per pound of lean: " + leanValueB);

        if (leanValueA < leanValueB) {
            System.out.println("Package A is the best value.");
        }else{
            System.out.println("Package B is the best value.");
        }

    }
}