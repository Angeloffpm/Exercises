import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        System.out.println("What is the resistance: ");
        Scanner res_scan = new Scanner(System.in);
        int res = res_scan.nextInt();
        System.out.println("What is the voltage: ");
        Scanner vol_scan = new Scanner(System.in);
        int vol = vol_scan.nextInt();
        double current = (vol + 0.0) / (res + 0.0);
        System.out.println("The current: " + current);
    }
}
