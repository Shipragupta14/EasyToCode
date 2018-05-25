/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/check-if-array-contains-contiguous-integers-with-duplicates-allowed/0
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int i=0;i<tc;i++)
		{
		    int n=sc.nextInt();
		    TreeSet<Integer> ts=new TreeSet<Integer>();
		    for(int j=0;j<n;j++)
		    ts.add(sc.nextInt());
		    
		    int x=ts.first();
		    int m=ts.last();
		    if((m-x)==ts.size()-1)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}

/*
input-
2
8
5  2  3  6  4  4  6  6
7
10  14  10  12  12  13  15
output-
YES
NO
TC- O(logn) //TreeSet is the Red Black Tree type of DS.
*/