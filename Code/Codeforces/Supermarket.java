//http://codeforces.com/contest/919/problem/A
import java.io.*;
import java.util.*;
import java.lang.*;

public class Supermarket {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
         float min=Float.MAX_VALUE;
         String str="";
        
		while(n--!=0){
		    int a =sc.nextInt();
		    int b=sc.nextInt();

		    if(min>((float)a/b*m)){
		       // System.out.println("hdbh");
		        min=(float)a/b*m;
		        
		        
		    }
		    
		}
		System.out.printf("%.6f \n",min);
		
	}
}