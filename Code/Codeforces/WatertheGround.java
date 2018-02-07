/*package whatever //do not write package name here */
//http://codeforces.com/problemset/problem/920/A
import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		   int n=sc.nextInt();
		   int k=sc.nextInt();
		   double a[]=new double[k];
		   for (int i=0;i<k;i++){
		       a[i]=sc.nextInt();
		   }
		   Arrays.sort(a);
		  
		   double d1=a[0]; 
		   double d2=n+1-a[k-1];
		   double max=Math.max(d1, d2);
		   for(int i=1;i<k;i++){
		       double diff=Math.floor((a[i]-a[i-1])/2)+1;
		       max=Math.max(diff,max);
		   }
		   System.out.println((int)max);
        }
    }
		   
}
		
		
	