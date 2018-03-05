/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int max =0;
		int [][] matrix=new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		int [][] s=new int[row][col];
		for(int i=0;i<row;i++){
		    s[i][0]=matrix[i][0];
		}
		for(int j=0;j<col;j++){
		    s[0][j]=matrix[0][j];
		}
		for(int i=1;i<row;i++){
		    for(int j=1;j<col;j++){
		        if(matrix[i][j]==1){
		            s[i][j]= Math.min(s[i-1][j],Math.min(s[i][j-1],s[i-1][j-1]))+1;
		          
		        }else{
		            s[i][j]=0;
		        }
		        
		        if(s[i][j]>max){
		            max=s[i][j];
		        }
		    }
		}
	//	System.out.println(max);
		for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print("1" + " ");
            }
            System.out.println();
}
	}
}

/*
input -
6
5
0  1  1  0  1
1  1  0  1  0
0  1  1  1  0
1  1  1  1  0
1  1  1  1  1
0  0  0  0  0

output-
1 1 1 
1 1 1 
1 1 1
*/