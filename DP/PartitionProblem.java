/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int [] arr= new int [n];
	    int sum=0;
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        sum=sum+arr[i];
	    }
	    if(sum%2!=0){
	        System.out.println("False");
	    }else{
	         boolean [][] m=new boolean[sum/2+1][n+1];
	         for (int i = 0; i <= n; i++)
               m[0][i] = true;
            for (int i = 1; i <= sum/2; i++)
                m[i][0] = false;
            for (int i = 1; i <= sum/2; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    m[i][j] = m[i][j-1];
                    if (i >= arr[j-1])
                        m[i][j] = m[i][j] || m[i - arr[j-1]][j-1];
                }
            }
            System.out.println(m[sum/2][n]);
	    }
	    
	}
}

/*
input-
7
3 1 1 2 2 1 2
output-
true
TC- O(sum*n)
*/