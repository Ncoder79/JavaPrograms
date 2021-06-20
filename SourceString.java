import java.util.*;
public class SourceString {
  static String removeCommonChar(String str1, String str2) 
  { 
		 String commonChars = "";
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    commonChars += str1.charAt(i);
					System.out.println(" commonChars " +commonChars);
                }
				 if (commonChars.length()==str1.length()){
						str1 = "same";
					} 
            }
        }

        for(int i = 0; i < commonChars.length(); i ++) {
            String charToRemove = commonChars.charAt(i)+"";
            str1 = str1.replace(charToRemove, "");
        }
	return str1;	
  } 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    System.out.println(removeCommonChar(str1, str2));
  }
}