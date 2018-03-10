//https://practice.geeksforgeeks.org/problems/shuffle-integers/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int n =  sc.nextInt();
		    int[] a = new int[n];
		    int[] b = new int[n];
		    for(int i=0; i<n; i++){
    	        int x =sc.nextInt();
    	        a[i]=x;
    	    }
    	    for(int j=0; j<n/2; j++){
    	        System.out.print(a[j] +" "+ a[n/2+j]+" ");
    	       
    	    } 
    	   if(n%2!=0){
    	           System.out.print(a[n-1]);
    	       }
    	     System.out.println(" ");
    		}
	}

}