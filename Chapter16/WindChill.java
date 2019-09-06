import java.util.Scanner;
import java.lang.Math;

public class WindChill {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Wind Speed:");
        int windSpeed = scan.nextInt();

        System.out.println("Enter Temperature:");
        int temp = scan.nextInt();

        double windChill;

        if (windSpeed < 3 || temp > 50) {
            windChill = temp;
        }else{
            windChill = 35.74 + (0.6215 * temp) - (35.75*(Math.pow(windSpeed, 0.16))) + (0.4275*temp*(Math.pow(windSpeed, 0.16)));
        }

        System.out.println("Wind Chill: " + windChill);

    }
}