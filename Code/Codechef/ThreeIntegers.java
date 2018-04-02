//https://www.codechef.com/problems/AFK
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		   long a=sc.nextLong();
		   long b=sc.nextLong();
		   long c=sc.nextLong();
		   long x=Math.abs(a+c-2*b);
		   long s=0;
		   if(x%2==0){
		       s=x/2;
		   }else{
		       s=x/2+1;
		   }
		   System.out.println(s);
		}
	
	}
}