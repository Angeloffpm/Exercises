import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter upper limit: ");
        int limit = scan.nextInt();

        
        for (int i = 1; i <= limit; i++) {

            boolean square = false;
            boolean triangle = false;

            for (int squareI = i; squareI > 0; squareI--) {
                if (squareI * squareI == i) {
                    square = true;
                }
            }

            int nCount = 1;
            for (int n = 1; nCount <= i; n++) {
                if (nCount == i) {
                    triangle = true;
                    n = limit + 1; //Exit n loop if i is a triangle.
                }
                nCount += (n + 1);
            }

            if (square && triangle) {
                System.out.println(i + " is both a square and triangle number.");
            }

            System.out.println(i);

        }



    }
}