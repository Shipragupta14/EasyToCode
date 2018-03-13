/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int [] a= new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int s=sc.nextInt();
		int [][]m= new int[n][s+1];
		for(int i=0;i<n;i++){
		    for(int j=0;j<s+1;j++){
		        if(j==0||i==0){
		            m[i][j]=1;
		        }else if(j>=a[i]){
		            m[i][j]=m[i-1][j]+m[i][j-a[i]];
		        }else{
		            m[i][j]=m[i-1][j];
		        }
		    }
		}
		System.out.println(m[n-1][s]);
	}
}
/*
input-
3
1 2 3
4
output-
4
TC-O(ns)
*/