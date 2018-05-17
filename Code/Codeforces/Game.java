//http://codeforces.com/contest/984/problem/A
import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int x=0;
        if(n%2!=0){
            x=n/2;
        }else{
            x=n/2-1;
        }
        System.out.println(a[x]);
	}
}