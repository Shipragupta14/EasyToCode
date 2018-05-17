//http://codeforces.com/contest/980/problem/A
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int m=0;
        int n=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='o'){
                m++;
              //  System.out.println(m);
            }else{
                n++;
               // System.out.println(n + "n");
            }
        }
        
        if(m==0 || n==0){
            System.out.println("YES");
        }else if(n%m ==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}