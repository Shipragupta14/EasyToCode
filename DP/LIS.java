/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int n =sc.nextInt();
		int []a =new int[n];
		int max=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int [] b=new int[n];
		for(int i=0;i<n;i++){
		    b[i]=1;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<i;j++){
		        if(a[i]>a[j]&& b[i]<b[j]+1){
		            b[i]=b[j]+1;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    if(b[i]>max){
		       max= b[i];
		    }
		}
		System.out.println(max);
	}
}

/*
input-
8
10 22 9 33 21 50 41 60
output-
5'
TC-O(n^2)
*/