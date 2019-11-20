import java.util.*;

class PanagramDetector {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        
        int[] letterCount = new int[26];
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
                            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                            'x', 'y', 'z' };

        for (int i = 0; i < sentence.length(); i++) {

            char currentChar = sentence.toLowerCase().charAt(i);

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == currentChar) letterCount[j] += 1;
            }

        }

        boolean panagram = true;

        for (int i = 0; i < letterCount.length; i++) {

            if (letterCount[i] <= 0) panagram = false;

        }

        if (panagram) {
            System.out.println("Your sentence is a panagram.");
        } else {
            System.out.println("Your sentence is not a panagram.");
        }

        // System.out.println(Arrays.toString(letterCount));
        // System.out.println(Arrays.toString(alphabet));

    }
        
}