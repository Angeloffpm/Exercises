import java.text.DecimalFormat;
import java.util.Scanner;

public class SecondsAge {
    public static void main(String[] args) {
        
        long[] monthDays = {31, 58, 90, 120, 151, 181, 212, 243, 273, 304, 334};

        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Years:");
        long years = scan.nextInt();

        System.out.println("Months:");
        int months = scan.nextInt();

        System.out.println("Days:");
        long days = scan.nextInt();

        long secondsAge = (years * 31536000) + (monthDays[months] * 86400) + (days * 86400);

        double percentLife = secondsAge / 2500000000.0;

        System.out.println("You have lived " + secondsAge + " seconds. That is " + (df.format(percentLife * 100)) + "% of your life." );



    }
}