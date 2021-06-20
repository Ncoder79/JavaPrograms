import java.util.*;
  
class Source {
 
  private static int findFirstRepeatedChar(String str){
	    char count[] = new char[256];
        int index = -1, i;
 
        for (i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
            if (count[str.charAt(i)] == 2) {
                index = i;
                break;
            }
        }
        return index;
 
  }
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int index = findFirstRepeatedChar(str);
    if(index != -1){
      System.out.println(str.charAt(index));
    }
    else{
      System.out.println("NA");
    }
  }
}