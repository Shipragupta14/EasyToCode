//http://codeforces.com/contest/987/problem/B
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
	    double x=sc.nextInt();
	    double y=sc.nextInt();
	    double temp=(double)(Math.log(y)/Math.log(x));
	   // System.out.println(temp);
	    double ans=x*temp;
	    //System.out.println(ans);
	    if(y>ans){
	        System.out.println(">");
	    }else if(ans>y){
	        System.out.println("<");
	    }else{
	        System.out.println("=");
	    }
	}
	
}

//TC-O(1)