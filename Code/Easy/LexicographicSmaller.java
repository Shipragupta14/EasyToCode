/*https://www.codechef.com/SEPT17/problems/MINPERM/*/

/*Trick--when array size is even then swap the 2 elements mutually and if the array size s odd the after the sama,
swap the last 2 elemets of the array again*/

import java.io.*;
import java.util.*;
 
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		for (int q=0;q<t;q++){
		    int n =sc.nextInt();
		    int[]a = new int[n];
		    for(int i =0;i<n;i++){
		       a[i]=i+1;
		       
		    }
		   // System.out.println(Arrays.toString(a));
		    
		        for(int j=1;j<n;j++){
    		        int temp=a[j];
    		        a[j] = a[j-1];
    		        a[j-1]= temp;
    		         j=j+1;
    		      
		        }
		          if(n%2!=0){
    		            int tem = a[n-1];
    		            a[n-1]=a[n-2];
    		            a[n-2]=tem;
    		        }
    		       
		        
		   
		    System.out.println( Arrays.toString(a).replace(",", "")  .replace("[", "")  .replace("]", "") .trim());
		}
	}
 
} 

/*
	Input-
		4
		2
		3
		5
		6
	Output-
	2 1
	2 3 1
	2 1 4 5 3
	2 1 4 3 6 5
*/