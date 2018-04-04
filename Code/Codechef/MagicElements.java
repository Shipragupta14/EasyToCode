//https://www.codechef.com/problems/ZOZ
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		    int sum=0;
		    int count=0;
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		       a[i]=sc.nextInt();
		       sum=sum+a[i];
		    }
		    for(int i=0;i<n;i++){
		        if(a[i]+k>(sum-a[i])){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	
	}
} 