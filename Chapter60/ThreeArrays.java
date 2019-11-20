import java.util.*;

class ThreeArrays {
    public static void main(String[] args) {
        
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum  = new int[4];

        for (int i = 0; i < valA.length; i++) {
            sum[i] = valA[i] + valB[i];
        }

        System.out.println("Sum of Arrays: " + Arrays.toString(sum));

    }
}