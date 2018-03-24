/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int hr=sc.nextInt();
		int min=sc.nextInt();
		int h=sc.nextInt();
		int d=sc.nextInt();
		int c=sc.nextInt();
		int n=sc.nextInt();
		int x=0;
		float cost=Float.MAX_VALUE;
		if(hr<20 && hr>=0 && min>=0 && min <60){
		    x=((20-(hr+1))*60)+(60-min);
		   // System.out.println(Math.ceil((float)h/n));
		    float y=(float)(Math.ceil((float)h/n)*c);
		    if(n!=0){
		        if(d!=0){
		        float z=(float)(Math.ceil((float)(h+(x*d))/n)*c*0.8);
		        cost=Math.min(y,z);
    		    }else{
    		        float z=(float)(Math.ceil((float)h/n)*c*0.8);
    		        cost=Math.min(y,z);
    		    } 
		    }
		     
		}else if(hr >=20 && hr<=23 && min>=0 && min <60){
		     cost=(float)(Math.ceil((float)h/n)*c*0.8);
		}
		 //System.out.println(cost); 
		 System.out.printf("%.4f \n",cost);
	}
}