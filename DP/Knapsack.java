/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int [] w=new int[n];
		int[] v=new int[n];
		for(int i=0;i<n;i++){
		    w[i]=sc.nextInt();
		    v[i]=sc.nextInt();
		}
		int maxw=sc.nextInt();
		int [][] m = new int[n+1][maxw+1];
		
		for(int i=0;i<n+1;i++){
		    for(int j=0;j<maxw+1;j++){
		        if(i==0||j==0){
		            m[i][j]=0;
		        }else if(w[i-1]<=j){
		            m[i][j]=Math.max(m[i-1][j], v[i-1]+m[i-1][j-w[i-1]]);
		        }else{
		            m[i][j]=m[i-1][j];
		        }
		        
		    }
		}
		System.out.println(m[n][maxw]);
	}
}

/*
input-
3
10 60
20 100
30 120
50
output-
220
*/