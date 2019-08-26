import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        System.out.println("Enter a price in cents: ");
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();

        int final_price;

        if (price > 1000) {
            final_price = price * 9 / 10;
        }else{
            final_price = price;
        }

        System.out.println("Discounted Price: " + final_price);

    }
}