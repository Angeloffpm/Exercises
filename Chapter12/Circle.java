import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println( "Input the radius: ");
        Scanner scan = new Scanner(System.in);
        int rad = scan.nextInt();
        double area = Math.PI * rad * rad;
        System.out.println( "Radius: " + rad + " Area: " + area);
    }
}