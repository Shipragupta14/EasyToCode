/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    int r=s1.length()+1;
	    int c=s2.length()+1;
	    int [][] m=new int [r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            if(i==0||j==0){
	                m[i][j]=0;
	            }else if(s1.charAt(i-1)==s2.charAt(j-1)){
	                m[i][j]=m[i-1][j-1]+1;
	            }else{
	                m[i][j]=Math.max(m[i-1][j],m[i][j-1]);
	            }
	        }
	    }
	   // System.out.println(m[r-1][c-1]);
	    int index=m[r-1][c-1];
	    int t=index;
	    char[] w=new char[index];
	    int i=r-1;
	    int j=c-1;
	    while(i>0 && j>0){
	        if(s1.charAt(i-1)==s2.charAt(j-1)){
	            w[index-1]=s1.charAt(i-1);
	            i--;j--;index--;
	            
	        }else if(m[i-1][j] > m[i][j-1]){
	            i--;
	        }else{
	            j--;
	        }
	    }
	    for(int k=0;k<=t;k++)
            System.out.print(w[k]);
	}
}

/*
input- 
aggtwabt
gxtxaybrty

output-
gtabt
TC-O(rc)
*/