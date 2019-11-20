import java.util.*;

class ArraySum {
    public static void main(String[] args) {
        
        int[] val = {0, 1, 2, 3};

        int sum = Arrays.stream(val).sum();

        System.out.println("Sum of array: " + sum);

    }
}