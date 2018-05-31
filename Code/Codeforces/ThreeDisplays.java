//http://codeforces.com/contest/987/problem/C
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] s=new long[n];
		long []c=new long[n];
		for(int i=0;i<n;i++)s[i]=sc.nextLong();
		for(int i=0;i<n;i++)c[i]=sc.nextLong();
		long sum=Integer.MAX_VALUE;
	
		for(int i=1;i<n-1;i++){
		   long min1=Integer.MAX_VALUE;
		long min2=Integer.MAX_VALUE;
		   for(int j=0;j<i;j++){
		       if(s[j]<s[i])
		      {  min1=Math.min(min1, c[j]);
		      
		      }
		   }
		   for(int k=i+1;k<n;k++){
		       if(s[i]<s[k]){
		           min2=Math.min(min2, c[k]);
		      
		       }
		   }
		   sum=Math.min(min1+min2+c[i], sum);
		}
		if(sum==Integer.MAX_VALUE){
		    System.out.println("-1");
		}else{
		System.out.println(sum);
		}
	}
}

/*
TC- O(n^2)
*/