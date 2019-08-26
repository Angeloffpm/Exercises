import java.util.Scanner;

public class Gas{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Tank capacity: ");
        int capacity = scan.nextInt();

        System.out.println("Gage reading: ");
        int gage = scan.nextInt();

        System.out.println("Miles per gallon: ");
        int mpg = scan.nextInt();

        double milesLeft = (capacity * (gage / 100.0)) * mpg;

        if (milesLeft > 200){
            System.out.println("Safe to Proceed!");
        }else{
            System.out.println("Get Gas!");
        }


    }
}