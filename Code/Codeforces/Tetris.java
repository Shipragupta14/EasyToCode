http://codeforces.com/contest/961/problem/A
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m =sc.nextInt();
		int [] a=new int[m];
		int []b=new int [n];
		for(int i=0;i<m;i++){
		    a[i]=sc.nextInt();
		   b[a[i]-1]++;
		}
		int count=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    if(b[i]<min){
		        min=b[i];
		    }
		}
		System.out.println(min);
	}
}