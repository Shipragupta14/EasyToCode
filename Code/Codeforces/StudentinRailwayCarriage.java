import java.io.*;
import java.util.*;

public class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    String s=sc.next();
	  //  System.out.println(s);
	  int count=0;
	  
	  for(int i=0;i<n;i++){
	     // System.out.println(i);
	      if(s.charAt(i)=='.'){
	          int j=i;
	          int c=0;
	          while(s.charAt(j)!='*'){
	              c++;
	               if(j<n-1)
	                j++;
	               else
	                break;
	          }
	          if(a>=b){
	              int y=c/2;
	            //  System.out.println(y);
	              if(b>=y){
	                  b=b-y;
	                  count=count+y;
	              }else{
	                  count=count+b;
	                  b=0;
	              }
	               if(a>=c-y){
	                   a=a-(c-y);
	                   count=count+c-y;
	               } else{
	                   count=count+a;
	                   a=0;
	                   
	               }
	              
	          }else{
	              int y=c/2;
	              //System.out.println(y);
	              if(a>=y){
	                   a=a-y;
	                   count=count+y;
	              }else{
	                  count=count+a;
	                  a=0;
	              }
	             if(b>=c-y){
	              b=b-(c-y);
	              count=count+c-y;
	             }else{
	                 count=count+b;
	                 b=0;
	             }
	          }
	          i=i+c-1;
	      }
	      
	  }
	  System.out.println(count);
	    
	}
}