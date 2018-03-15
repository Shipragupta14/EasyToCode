/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l=s.length();
		int [][]m=new int[l][l];
		for(int ss=1;ss<=l;ss++){
		    for(int i=0;i<l-ss+1;i++){
		        int j=i+ss-1;
		        if(i==j){
		            m[i][j]=1;
		        }else if(s.charAt(i)==s.charAt(j) && ss==2){
		            m[i][j]=2;
		        }else if(s.charAt(i)==s.charAt(j)){
		            m[i][j]=m[i+1][j-1]+2;
		        }else{
		            m[i][j]=Math.max(m[i+1][j], m[i][j-1]);
		        }
		    }
		}
		System.out.println(m[0][l-1]);
	}
}

/*
input- adbgba
output-5
TC-O(n^2)
*/