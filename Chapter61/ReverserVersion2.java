import java.io.*;
import java.util.*;

class ReverserVersion2 {

    public static void main(String[] args) {
        
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] result = new int[14];

        for (int i = 0; i < data.length; i++) {

            result[i] = data[data.length - 1 - i];

        }

        System.out.println("Reversed Array: " + Arrays.toString(result));

    }

}