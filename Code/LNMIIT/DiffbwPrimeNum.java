/*package whatever //do not write package name here */
//https://www.hackerearth.com/problem/algorithm/easiest-problem/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	 Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] a=new int[n];
        	for(int i=0;i<n;i++) {
		    a[i]=sc.nextInt();
        	}
        int max=0;
        int x=0;
        int diff=0;
        
        for(int j=0;j<n;j++){
            boolean flag = false;
            for(int i = 2; i <= a[j]/2; ++i)
            {
                // condition for nonprime number
                if(a[j] % i == 0)
                {
                    flag = true;
                    break;
                }
                
            }
            if(!flag){
                
                diff=j-x;
                x=j;
                if(max<diff){
                    max=diff;
                }
            }else{
              // System.out.println(j);
            }
        }
        System.out.println(max);
	}
}