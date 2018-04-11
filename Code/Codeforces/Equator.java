import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int [] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        sum=sum+a[i];
	        
	    }
	    int x=(sum/2);
	    //System.out.println(x);
	    if(sum%2!=0){
	        x=x+1;
	    }
	    int s=0;
	    for(int i=0;i<n;i++){
	        s=s+a[i];
	        if(s>=x){
	            System.out.println(i+1);
	            break;
	        }
	    }
	}
}