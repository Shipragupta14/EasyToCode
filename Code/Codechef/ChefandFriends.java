//https://www.codechef.com/problems/FRK
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		int count=0;
		while(t--!=0){
		    String s1=sc.next();
		    String s2="chef";
		    int m=s1.length();
		    int n=s2.length();
		    outerloop:
		    for(int i=0;i<m-1;i++){
		        for(int j=0;j<n-1;j++){
		            if(s1.charAt(i)==s2.charAt(j)){
		                if(s1.charAt(i+1)==s2.charAt(j+1)){
		                    count++;
		                    break outerloop;
		                }
		            }
		        }
		    }
		    
		}
		System.out.println(count);
	}
} 