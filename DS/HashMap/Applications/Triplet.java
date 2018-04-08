/* In an given array, find the triplets which satisfies the condition a^2+b^2=c */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    a[i]=x;
		    map.put(i,x);
		}
		for(int i=0;i<n-1;i++){
		    for(int j=i+1;j<n;j++){
		        int y=(a[i]*a[i])+(a[j]*a[j]);
		        if(map.containsValue(y)){
		            System.out.println(a[i]+" "+a[j]+" "+y);
		        }
		    }
		}
	}
}
/*
input-
5
2 3 4 13 25
output-
2 3 13
3 4 25
Timecomplexity- O(n^2)
*/