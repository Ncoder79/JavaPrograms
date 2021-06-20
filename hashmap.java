import java.util.*;

public class Source {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       int k = s.nextInt();
       kthNonRepeatingCharacter(str, k);
   }
	public static int MAX_CHAR = 256;
   // Method to find the kth non-repeating character in the string
   static void kthNonRepeatingCharacter(String str, int k) {
       // Write your code here
       final int inputLength = str.length();
 
        /*
         * indexArr will store index of non-repeating characters,
         * inputLength for characters not in input and
         * inputLength+1 for repeated characters.
         */
        final int[] indexArr = new int[MAX_CHAR];
         
        // initialize all values in indexArr as inputLength.
        Arrays.fill(indexArr, inputLength);
         
        for (int i = 0; i < inputLength ; i++) {
            final char c = str.charAt(i);
            if (indexArr == inputLength) {
                indexArr = i;
            } else {
                indexArr = inputLength + 2;
            }
        }
         
        Arrays.sort(indexArr);
         
        return (indexArr[k-1] != inputLength) ? indexArr[k-1] : -1;
    }
   }
}