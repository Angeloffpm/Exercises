import java.util.Scanner;

public class OrderCheck{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of bolts: ");
        final int boltPrice = 5;
        int bolts = scan.nextInt();

        System.out.println("Number of nuts: ");
        final int nutPrice = 3;
        int nuts = scan.nextInt();

        System.out.println("Number of washers: ");
        final int washerPrice = 1;
        int washers = scan.nextInt();

        boolean correctOrder;
        String error = new String();

        if (nuts >= bolts && washers >= 2 * bolts){
            correctOrder = true;
            System.out.println("Order is OK.");
        }else{
            correctOrder = false;
            if (nuts < bolts){
                error = "Too few nuts.";
            }else{
                error = "Too few washers.";
            }
            System.out.println(error);
        }

        int cost = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice);
        System.out.println("Total cost: " + cost);

    }
}