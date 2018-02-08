/*package whatever //do not write package name here */
//http://codeforces.com/problemset/problem/922/B
import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
               int x= (i^j);
               if(x<=n && x<(i+j) && x> Math.abs(i-j) && x>=i && x>=j){
                    count++;
               }
            }
        }
        System.out.println(count);
	}
}