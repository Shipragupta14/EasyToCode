//https://www.codechef.com/problems/CO92JUDG
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n =sc.nextInt();
		    int []a=new int[n];
		    int [] b=new int[n];
		    int max1=0;
		    int s1=0;
		    int s2=0;
		    int max2=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        s1=s1+a[i];
		        if(a[i]>max1){
		            max1=a[i];
		        }
		    }
		    s1=s1-max1;
		    for(int i=0;i<n;i++){
		        b[i]=sc.nextInt();
		        s2=s2+b[i];
		        if(b[i]>max2){
		            max2=b[i];
		        }
		    }
		    s2=s2-max2;
		    if(s1>s2){
		        System.out.println("Bob");
		    }else if(s2>s1){
		        System.out.println("Alice");
		    }else{
		        System.out.println("Draw");
		    }
		}
		
	}
}

