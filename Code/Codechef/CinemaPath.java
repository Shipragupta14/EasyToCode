/*package whatever //do not write package name here */
//https://www.codechef.com/problems/CO92SUBW
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int ti=sc.nextInt();
		while(ti--!=0){
		    int x=sc.nextInt();
		    int i=1;
		    int d=2;
		    int t=1;
		    while(i<x){
		        i=i+d;
		        d++;
		        t++;
		    }
		    if(i==x){
		        System.out.println(t);
		    }else if(i>x){
		        int z=x-(i-d+1);
		        int t1=t+z-1;
		        
		        int y=i-x;
		        int t2=t+y;
		        
		        int f=Math.min(t1,t2);
		        System.out.println(f);
		    }
		    
		}
	}
}