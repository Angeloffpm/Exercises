import java.util.*;

class SameSum {
    public static void main(String[] args) {
        
        int[] valA = {13, -22, 82, 17};
        int[] valB = new int[4];
        int[] sum = new int[4];

        for (int i = 0; i < valA.length; i++) {

            valB[i] = 25 - valA[i];
            sum[i] = valA[i] + valB[i];

        }

        System.out.println("Array A: " + Arrays.toString(valA));
        System.out.println("Array B: " + Arrays.toString(valB));
        System.out.println("Sum : " + Arrays.toString(sum));

    }
}