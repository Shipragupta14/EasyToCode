/* Fibonacci series */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		//scan the size of array
		int n = sc.nextInt();
		int arr[] = new int[n];
		//scan the first two elements of array
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		for(int i=2;i<n;i++){
		    arr[i]=arr[i-2] + arr[i-1];
		}
		System.out.println("Fibonacci series :"+Arrays.toString(arr));
		
	}
}
