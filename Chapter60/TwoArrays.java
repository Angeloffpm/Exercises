import java.util.*;

class TwoArrays {

    public static void main(String[] args) {
        
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[val.length];

        System.out.println("Original Array: " + Arrays.toString(val));

        for (int i = 0; i < val.length; i++) {
            twice[i] = val[i] * 2;
        }

        System.out.println("New Array: " + Arrays.toString(twice));

    }

}