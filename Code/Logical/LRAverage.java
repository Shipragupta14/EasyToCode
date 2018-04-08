/* In an given array, find the element having the equal average in left and right subarray */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    sum=sum+a[i];
		}
		int s=0;
		for(int i=1;i<n-1;i++){
		    s=s+a[i-1];
		    int x=sum-s-a[i];
		    int y=s/i;
		    int z=x/(n-i-1);
		    if(y==z){
		        System.out.println(a[i]);
		    }
		}
	}
}
/*
input-
5
1 5 3 4 2
output-
3

Timecomplexity- O(n)
*/