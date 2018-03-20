/*package whatever //do not write package name here */

//https://www.codechef.com/problems/CO92MATR
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int ind=0;
		    int [][] x=new int[m][n];
		    for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		            x[i][j]=sc.nextInt();
		            if(x[i][j]==-1 && i==0 && j==0){
		                x[i][j]=1;
		            }else if(x[i][j]==-1 && i!=0 && j==0){
		                
		                x[i][0]=x[i-1][0];
		            }else if(x[i][j]==-1 && i==0 && j!=0){
		               x[0][j]=x[0][j-1];
		            }else if(x[i][j]==-1 ){
		                x[i][j]=Math.max(x[i-1][j],x[i][j-1]);
		            }
		           
		        }
		        
		    }
		 
		    for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if( i<m-1){
                        if(x[i][j]>x[i+1][j]){
                            ind=1;
                           // System.out.println("-1");
                            break ;
                        }
                        }
                        if(j<n-1 ){
                        if(x[i][j]>x[i][j+1]){
                            // System.out.println("-1");
                            ind=1;
                            break ;
                        }
                        }
                    }
		    }
                  if(ind==1) System.out.println("-1");
		   		if(ind==0){
		   		for(int i=0;i<m;i++){
		   	                 for(int j=0;j<n;j++){
		   	              	System.out.print(x[i][j]+" ");
		   	}
		   	System.out.println();
		   		}
		   		}
		}
	}
}