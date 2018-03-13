/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int [] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int s=sc.nextInt();
	    boolean [][]m=new boolean[n][s+1];
	    for(int i=0;i<n;i++){
	        m[i][0]= true;
	    }
	  
	   // for(int j=1;j<s+1;j++){
	   //      m[0][j]= false;        //remember
	   // }
	    
	    for(int i=1;i<n;i++){
	        for(int j=1;j<s+1;j++){
	          
	            if(a[i]<=j){
	                 m[i][j]= m[i-1][j] || m[i-1][j-a[i]];
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
5
2 3 7 8 10
11
output-
true (3,8)
TC- O(s*n)
*/