/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		long l=sc.nextInt();
		long r=sc.nextInt();
		long count=0;
		int x=(int)(Math.log(r)/Math.log(2));
		//int y=(int)(Math.log(r)/(Math.log(3)));
		//System.out.println(y);
		for(int i=0;i<=x;i++){
		    double a=Math.pow (2,i);
		    for(int j=0;j<=20;j++){
		        double b=Math.pow(3,j);
		        //System.out.println(b);
		        if(a*b>=l && a*b <=r){
		           // System.out.println(a*b);
		            count++;
		        }
		    }
		}
		System.out.println(count);
	}
}