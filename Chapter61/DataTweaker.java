import java.io.*;
import java.util.*;

class DataTweaker {

    public static void main(String[] args) {
        
        File file = new File("data.txt");

        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        double[] data = new double[14];

        int i = 0;
        while (scan.hasNextDouble()) {
            try {
                data[i++] = scan.nextDouble();
            } catch (NumberFormatException e) {
                continue;
            }
        }

        System.out.println(Arrays.toString(data));

    }

}