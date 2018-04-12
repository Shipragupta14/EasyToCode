//http://blog.gainlo.co/index.php/2016/11/18/uber-interview-question-move-zeroes/

METHOD-1:

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(a[i]==0)
		        count++;
		    else
		        System.out.print(a[i]+" ");
		}
		if(count!=0){
		    for(int i=0;i<count;i++){
		        System.out.print("0"+ " ");
		    }
		}
		
	}
}
/*
input-
5 
2 0 3 0 4
output-
2 3 4 0 0 
TC- O(n)
*/


METHOD-2:

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
	//	int l=0;
		int r=n-1;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
	    for(int i=0;i<n;i++){
	        if(i<r){
	            if(a[i]==0 && a[r]==0){
	                r--;
	            }else if(a[i]==0 && a[r]!=0){
	                a[i]=a[r];
	                a[r]=0;
	                r--;
	            }
	        }
	    }
		System.out.println(Arrays.toString(a));
	}
}
/*
input-
5 
2 0 3 0 4
output-
2 3 4 0 0 
TC- O(n) but with more reduced operations
*/