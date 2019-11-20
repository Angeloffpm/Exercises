import java.io.*;

class NearlyZero {

    public static void main(String[] args) {
        
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -12};

        int closestToZero = data[0];

        for (int i = 0; i < data.length; i++) {

            int temp;

            if (data[i] < 0) {
                temp = data[i] * -1;
            } else {
                temp = data[i];
            }

            if (temp < closestToZero) closestToZero = data[i];

        }

        System.out.println("Closest to zero: " + closestToZero);

    }

}