/*package whatever //do not write package name here */

//what is the max profit a person can earn in a week according to the given stock prices
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x =sc.nextInt();
        int [] b=new int[x+1];
        b[0]=0;
       
        for(int i=1;i<x+1;i++){
             int maxv=0;
            for(int j=0;j<i;j++){
                maxv=Math.max(maxv, a[j]+b[i-j-1]);
                
            }
            b[i]=maxv;
        }
        System.out.println(b[x]);
	}
}

