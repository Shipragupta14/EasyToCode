/*package whatever //do not write package name here */
//https://practice.geeksforgeeks.org/problems/check-if-array-contains-contiguous-integers-with-duplicates-allowed/0
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		Arrays.sort(a);
		int flag=0;
		for(int i=1;i<n;i++){
		    if(a[i]-a[i-1]>1){
		        flag=1;
		        break;
		    }
		}
		if(flag==1){
		    System.out.println("No");
		}else{
		    System.out.println("Yes");
		}
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
TC- O(nlogn)
*/