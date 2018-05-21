/*package whatever //do not write package name here */

//https://www.codechef.com/COOK94B/problems/CHEFRUN
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int x1=sc.nextInt();
		     int x2=sc.nextInt();
		      int x3=sc.nextInt();
		       int v1=sc.nextInt();
		        int v2=sc.nextInt();
		    int d1= Math.abs(x1-x3);
		    int d2=Math.abs(x2-x3);
		    float t1=(float)d1/v1;
		    float t2=(float)d2/v2;
		    if(t1>t2){
		        System.out.println("Kefa");
		    }else if(t1<t2){
		        System.out.println("Chef");
		    }else{
		        System.out.println("Draw");
		    }
		}
	}
}