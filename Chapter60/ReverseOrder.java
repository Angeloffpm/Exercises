import java.util.*;

class ReverseOrder {
    public static void main(String[] args) {
        
        int[] val = {0, 1, 2, 3, 4};
        int temp;

        System.out.println("Original Array: " + Arrays.toString(val));

        for (int i = 0; i < val.length / 2; i++) {

            temp = val[i];
            val[i] =  val[val.length - i - 1];
            val[val.length - i - 1] = temp;

        }

        System.out.println("Reversed Array: " + Arrays.toString(val));

    }
}