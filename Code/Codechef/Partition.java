//https://www.codechef.com/problems/PRTITION
import java.io.*;
import java.util.*;
 
class GFG {
	public static void main (String[] args) {
	    Scanner sc= new Scanner (System.in);
	    int t =sc.nextInt();
	    while(t--!=0){
	        int x=sc.nextInt();
	        int n=sc.nextInt();
	        int[] a =new int[n];
	        long sum=0;
	        for (int i=0;i<n ;i++ ){
	            a[i]=i+1;
	            sum=sum+a[i];
	        }
	     
	        sum=sum-x;
	        long need=0;
	        if(sum%2==0){
	            if(n<4){
	                System.out.println("impossible"); 
	            }else{
    	            need=sum/2;
                    for(int i=n-1;i>=0;i--){
                        if(a[i]!=x){
                            if(need-a[i]>=0 && need-a[i]!=x){
                                need=need-a[i];
                                a[i]=0;
                                
                            }else {
                                a[i]=1;
                            }
                            
                        }else{
                            a[i]=2;
                        }
                    }
                    if(need!=0){
                        System.out.println("impossible");
                    }else{
    	            //System.out.print(Arrays.toString(a).replace(",", "")  .replace("[", "").replace("]", "") .trim());
    	        System.out.print(Arrays.toString(a).replace(",", "").replace("[", "").replace("]", "").replace(" ", "").trim());
    	            System.out.println(" ");
                    }
	            }
	        }else{
	            System.out.println("impossible");
	        }
	    }
	}
} 