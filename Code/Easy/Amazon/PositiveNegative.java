/*Given an array containing equal number of positive and negative elements, arrange the array such that every positive element is followed by a negative element.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
    	    
    		int arr1[] = new int[n];
    		int arr2[] = new int[n];
    		int j= 0;
    		int k=1;
    		try{
    		for(int i =0;i<=n-1;i++){
    		    int x= sc.nextInt();
    		    arr1[i] = x;
    		    
    		    if(arr1[i]>=0){
    		        arr2[j] = arr1[i] ;
    		        j=j+2;
    		      
    		    }
    		    else{
    		        if(arr2[k]>=0){
        		        arr2[k] = arr1[i];
        		        k = k+2;
    		        }
    		        else{
        		        k=k-1;
        		        arr2[k] = arr1[i];
    		        }
    		    }
    		}	    
    		System.out.println(Arrays.toString(arr2));
    	    }
    	    catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Print equal no. of positive and negative no.");    
		    }
		
	
	}
}

/*
    Input- 
    6 
    2 3 -1 -4 -5 7
    Output-
    2 -1 3 -4 7 -5
*/