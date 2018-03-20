/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int [] st=new int[n];
		    int [] p=new int [n];
		    int [] ss=new int[n];
		    for(int i=0;i<n;i++){
		        st[i] = sc.nextInt();
		        p[i] = sc.nextInt();
		        ss[i] = sc.nextInt();
		    }
		 
		    for(int i=1;i<n;i++){
		        st[i]=st[i]+Math.min(ss[i-1],p[i-1]);
		        p[i]=p[i]+Math.min(ss[i-1],st[i-1]);
		        ss[i]=ss[i]+Math.min(st[i-1],p[i-1]);
		    }
		    System.out.println(Math.min(st[n-1],Math.min(p[n-1],ss[n-1])));
		}
	}
}