/*package whatever //do not write package name here */
//http://codeforces.com/problemset/problem/922/A
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int or=1;
		int cp=0;
		if(or<y){
		    int diff=y-or;
		    cp=diff;
		    or=y;
		}
		if(cp<x && cp!=0 && y!=0){
		    
		    if((x-cp)%2==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}else if(cp==x && y!=0){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}