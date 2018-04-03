/*package whatever //do not write package name here */
//https://www.hackerearth.com/problem/algorithm/ap-array/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int count=2;
		int max=0;
		for(int j=1;j<n-1;j++){
		    if((a[j-1]+a[j+1])==2*a[j]){
		     
		        count++;
		       // System.out.println(count);
		        if(max<count){
		            max=count;
		        }
		    }else{
		        count=2;
		    }
		}
		System.out.println(max);
	}
}