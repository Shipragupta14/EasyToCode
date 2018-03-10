/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
        String s1=sc.next();
        String s2=sc.next();
        
		int r=s1.length()+1;
		int c=s2.length()+1;
		int [][] m= new int[r][c];
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		    	if(i==0){
		    		m[0][j]=j;
		    	}else if(j==0){
		    		m[i][0]=i;
		    	}
		        else if(s1.charAt(i-1)==s2.charAt(j-1)){
		            m[i][j]=m[i-1][j-1];
		        }else{
		            m[i][j]= Math.min(m[i-1][j],Math.min(m[i][j-1],m[i-1][j-1]))+1;
		        }
		    }
		}
		System.out.println(m[r-1][c-1]);
	}
}

/*
input - 
abcdef
azced
output-
3
time complexity- O(rc)

*/