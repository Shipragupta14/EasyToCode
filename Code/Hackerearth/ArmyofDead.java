/*package whatever //do not write package name here */
//https://www.hackerearth.com/problem/algorithm/army-of-dead/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    long [] a=new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    long max=a[n-1];
		    int count=1;
		    for(int i=n-2;i>=0;i--){
		        if(a[i]>max){
		            max=a[i];
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}