import java.util.*;
public class Source {
  public static  void stringPermutations(String str, int left, int right) { 
    // write your code here
	
    if (left == right)
            System.out.println(str);
        else
        {
            for (int i = left; i <= right; i++)
            {
				
                //str = swap(str,left,i);
				 char temp;
				 char[] charArray = str.toCharArray();
				 temp = charArray[left] ;
                 charArray[left] = charArray[i];
                 charArray[i] = temp;
                 str = String.valueOf(charArray);
                stringPermutations(str, left+1, right);
                //str = swap(str,left,i);
				 temp = charArray[left] ;
                 charArray[left] = charArray[i];
                 charArray[i] = temp;
				 str = String.valueOf(charArray);
            }
        }
	}
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length();
    if(len <= 3)
      stringPermutations(str,0,len-1);
    else
      System.out.print("NA");
  }
}