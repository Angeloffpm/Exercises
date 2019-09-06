import java.util.Scanner;

public class DeliOrders {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the item: ");
        String item = scan.nextLine();
        
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        
        System.out.println("Overnight delivery (0 = no, 1 = yes): ");
        int overnightDelivery = scan.nextInt();

        double deliveryCost;
        double totalCost;

        if (price > 10.00) {
            deliveryCost = 0.00;
        } else {
            deliveryCost = 2.00;
        }

        if (overnightDelivery == 1 ) {
            deliveryCost = deliveryCost + 3.00;
        } 

        totalCost = deliveryCost + price;

        System.out.println("Invoice:");
        System.out.println("\t" + item + "\t" + price);
        System.out.println("\tDelivery\t" + deliveryCost);
        System.out.println("\tTotal\t" + totalCost);




    }
}