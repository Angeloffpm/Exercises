import java.io.*;

class ThreeSums {
    public static void main(String[] args) {
        
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

        int sum = 0; int oddSum = 0; int evenSum = 0;

        for (int i = 0; i < data.length; i++) {

            sum += data[i];

            if (data[i] % 2 == 0) evenSum += data[i];
            if (data[i] % 2 == 1) oddSum += data[i];

        }

        System.out.println("Sum: " + sum);
        System.out.println("Odd Sum: " + oddSum);
        System.out.println("Even Sum: " + evenSum);

    }
}