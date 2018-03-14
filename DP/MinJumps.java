/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int n = sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int [] b=new int[n];
		
		Arrays.fill(b, Integer.MAX_VALUE);
		for(int i=1;i<n;i++){
		    for(int j=0;j<i;j++){
		        b[0]=0;
		        
		        if(a[j]>=i){
		            b[i]=Math.min(b[i],b[j]+1);
		        }
		    }
		}
		System.out.println(b[n-1]);
		
	}
}
/*
input- 
6
1 3 6 1 0 9
output- 
3
TC - O(n^2)
*/