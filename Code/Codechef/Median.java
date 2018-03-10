//https://www.codechef.com/COOK87/problems/CK87MEDI


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        while(T--!=0) {
			int n= sc.nextInt();
			int k=sc.nextInt();
			int[] numArray= new int[n];
			 for (int i = 0; i < n; i++) {
	                numArray[i]=sc.nextInt();
	            }
			Arrays.sort(numArray);
	        int median;
	        int[] xnumArray = new int[n+k];
	        if (xnumArray.length % 2 == 0)
	            median = ((int)numArray[xnumArray.length/2] + (int)numArray[xnumArray.length/2 - 1])/2;
	        else
	            median = (int) numArray[xnumArray.length/2];
	        
	        
	        System.out.println(median);
        }
	}
}

/*
Input:
3
2 1
4 7
4 3
9 2 8 6
5 2
6 1 1 1 1

Output:
7
9
1
*/