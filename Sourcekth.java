

import java.util.*;
public class Source {
  public static String reverse(String str) {
		//write your code here
		 StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        return sbr.toString();
	}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(reverse(str));
  }
}
/* import java.util.*;
public class Source {
		public static int MAX_CHAR = 256;
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       int k = s.nextInt();
       kthNonRepeatingCharacter(str, k);
	   char []array = {'a', 'b'};
		String a = new String(array);
		String b = new String({'a', 'b'});
		System.out.println(a.equals(b));
   }
   // Method to find the kth non-repeating character in the string
	static void kthNonRepeatingCharacter(String str, int k) {
       // Write your code here
	   int n = str.length();
        int[] count = new int[MAX_CHAR];

        int[] index = new int[MAX_CHAR];
  
        for (int i = 0; i < MAX_CHAR; i++)
        {
            count[i] = 0;
            index[i] = n;  
                           
        }
  
        for (int i = 0; i < n; i++)
        {
            char x = str.charAt(i);
            ++count[x];
            if (count[x] == 1)
                index[x] = i;
  
            if (count[x] == 2)
                index[x] = n;
        }
        Arrays.sort(index);
		int res = index[k-1];
        System.out.println((index[k-1] != n)? str.charAt(res) : "NA");

   }
} */