/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		 int [] a= new int[n];
		 for(int i=0;i<n;i++){
		     a[i]=sc.nextInt();
		 }
		 int maxsum=a[0];
		 int max=a[0];
		 for(int i=1;i<n;i++){
		     max=Math.max(a[i],max+a[i]);
		     maxsum=Math.max(maxsum, max);
		 }
		 System.out.println(maxsum);
	}
}

/*
input-
8
-2 -3 4 -1 -2 1 5 -3
output-
7
TC-O(n)
*/