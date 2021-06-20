import java.util.*;
public class Main {
  
    //method to print an array, taking array as an argument   
   /*  public static int[] getArray(int a,int b){
       for(int val: getArray)
          System.out.print(val + " ");
    }
   public static void main(String[] args) {
		int[] arr = ArrayBuilder.getArray(10, 20, 30);
		for (int ele: arr) {
			System.out.println(ele);
		}
	}	 */
/*1. thief:[x,y]
     police:[m,n]
	 can P catch T in exactly K steps
	 
	 T***
	 ****
	 **P*
	 ****
	 
	P 3,4
	T 8,2

*/	
	public static boolean funProblem(int px,int py, int tx, int ty,int k)	{
		int min = Math.abs(px-tx) + Math.abs(tx-ty);
		if(min>k){
			return false
		}else{
			int stepToWaste = k - min;
			return stepToWaste%2==0;
		}
}

	   public static void main(String[] args) {
		
	   }
}	
	
	/* public static String decimalToBinary(int decimal){
		String binary = "";
		while(decimal!=0){
			int q = decimal/2;
			int r = decimal%2;
			binary = r + binary;
			decimal = q;
		}
		return binary;
	}

	public static int binarytoDecimal(String binary){
		int decimal = 0;
		int product = 1; // 2^0
		for(int i = binary.length()-1;i>=0;i--){
			char digit = binary.charAt(i);
			int temp = Integer.parseInt(digit + "");
			decimal +=temp * product;
			product *=2;
		}
		return decimal;
	}
	 */
	/* public static int lonely(int[] arr){
			int ans = 0;
			for(int j =0;j<=arr.length()-1;i++){
				ans = ans ^ arr[i];
			}
			return ans;
		}
	}	 */
	
/* 	public static boolean isPowerOf2(int n){
		
	} */
	
/* 	public static void pattern(int a,int b){
		
	} */
	
	
/* public static void main(String[] args) {

	
} */
	
	
	/* public static int subtract(int a,int b) {
        while(b!=0){
			int diff  = a^b;
		    int borrow = (~a)&b;
              b= borrow= (~a)&b;
              a= a^b;
              b= borrow<<1;
          }
        return  a; */