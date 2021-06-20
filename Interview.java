/*1. thief:[x,y]
     police:[m,n]
	 can P catch T in exactly K steps
	 
	 T***
	 ****
	 **P*
	 ****
	 
	P 3,4
	T 8,2
	
public static boolean funProblem(int px,int py, int tx, int ty,int k)	{
		int min = Math.abs(px-tx) + Math.abs(tx-ty);
		if(min>k){
			return false
		}else{
			int stepToWaste = k - min;
			return stepToWaste%2==0;
		}
}
*/

/*2   [3,1,6,3,5,10,12,24,13,7,8]

[a,b,c,d,e,f,g,h,i,j]
a > b < c > d < e > f < g > h < i > j