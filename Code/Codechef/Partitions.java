//https://www.codechef.com/problems/ARRP
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		
		while(t--!=0){
		   int n=sc.nextInt();
		   long []a=new long[n];
		   long []b=new long [n];
		   long sum=0;
		   for(int i=0;i<n;i++){
		       a[i]=sc.nextInt();
		       sum=sum+a[i];
		   }
		   b[0]=1;
		   long y=0;
		   int count=0;
		   for(int k=1;k<n;k++){
		       if(sum%(k+1)!=0){
		           b[k]=0;
		       }else{
		          long x=sum/(k+1);
		           for(int i=0;i<n;i++){
		               y=y+a[i];
		             //  System.out.println(y);
		               if(y==x){
		                  count++;
		                  y=0;
		               }else if(y>x){
		                   y=0;
		                   break;
		               }
		           }
		          // System.out.println(count);
		           if(count==k+1){
		               b[k]=1;
		           }else{
		               b[k]=0;
		           }
		           count=0;
		       }
		   }
		   System.out.println(Arrays.toString(b).replace(",", "").replace(" ", "")  .replace("]", "") .replace("[", "").trim() );
		}
	
	}
} 