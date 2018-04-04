/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] a=new int [n];
		int []b=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    b[i]=sc.nextInt();
		}
		
		
		int sum=0;
		int max=0;
		for(int i=0;i<k;i++){
		    if(b[i]==0){
		        max=max+a[i];
		    }else{
		        sum=sum+a[i];
		    }
		}
		int x=max;
	//	System.out.println(x);
	    for(int i=1;i<n-k+1;i++){
	        
	            
	            if(b[i-1]==0 && b[k+i-1]==0){
	                max=max-a[i-1]+a[k+i-1];
	            }else if(b[i-1]==0 && b[i+k-1]!=0){
	                max=max -a[i-1];
	            }else if(b[i-1]!=0 && b[i+k-1]==0){
	                max=max+a[i+k-1];
	            }
	           // System.out.println(max);
	       
	        x=Math.max(x,max);
	    }
	    for(int i=k;i<n;i++){
	        if(b[i]==1){
	            sum=sum+a[i];
	        }
	    }
	
		System.out.println(sum+x);
	}
}