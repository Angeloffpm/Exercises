import java.util.*;

class ArrayEquality {

    public static void main(String[] args) {
        
        int[] arrayA = {1, 2, 3, 4};
        int[] arrayB = {1, 2, 3, 4};

        System.out.println("Arrays says: ");
        if (Arrays.equals(arrayA, arrayB)) {
            System.out.println("Equal Arrays.");
        } else {
            System.out.println("Not Equal.");
        }
        
        System.out.println("\nMy Equals Says:");
        if (myEquals(arrayA, arrayB)) {
            System.out.println("Equal Arrays.");
        } else {
            System.out.println("Not Equal.");
        }
 
    }

    public static boolean myEquals(int[] a, int[] b) {

        if (a.length != b.length) {

            return false;

        } else {

            boolean equal = true;

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) equal = false;
            }

            return equal;

        }

    }

}