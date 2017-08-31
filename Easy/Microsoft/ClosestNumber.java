/*Given two integers n and m. The problem is to find the number closest to n and divisible by m.
 If there are more than one such number, then output the one having maximum absolute value. 
 If n is completely divisible by m(not equal to 0), then output n only. Time complexity of O(1) is required.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int p=0;p<t;p++){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		        int x = n%m;
		        int y = m/2 ;
		        if(x<0 && m>0){
		            x = x+m;
		        }
		       
		        
		        if(Math.abs(x)> Math.abs(y)){
		            n = n+(m-x);
		        }
		        else if(Math.abs(x)< Math.abs(y)){
		            n=n-x;
		        }
		        else{
		          if(n>=0){
		              if(m%2==0){
		                  n=n+x;
		              }
		              else{
		                  n=n-x;
		              }
		          }
		          else{
		              if(m>0){
		              if(m%2==0){
		                 n=n-x; 
		              }
		              else{
		                  n=n-x;
		              }
		              }else{
		                  if(m%2==0){
		                      n=n-x;
		                  }else{
		                      n=n-m+x-1;
		                  }
		              }
		          }
		        }
		        		System.out.println(n);

		}
	}
}

/*
	Input-
	3 
	12 5
	-12 5
	-12 -5

	Output-
	10
	-10
	-10
*/