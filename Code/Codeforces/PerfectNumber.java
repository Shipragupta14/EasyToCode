//http://codeforces.com/contest/919/problem/B
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int count=0;
		int sum=0;
		int n=0;
	
		int i=19;
		while (count!=k){
                sum=0;
		        int x=i;
		        while(x > 0)
                {
                    n = x % 10;
                    sum = sum + n;
                    x= x / 10;
                }
                if(sum==10){
                    count++;
                    if(count == k)
                        System.out.println(i);
                  //  x=i;
                    i=i+9;
                }else{
                    i=i+9;
                }
        	}
        
       // System.out.println(i);
	}
}