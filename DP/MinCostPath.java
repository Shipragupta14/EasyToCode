/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int [][] m =new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        m[i][j]=sc.nextInt();
		    }
		}
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(mincost(m,x,y));
	}
	public static int mincost(int [][]m, int x, int y){
	    int [][]t=new int [x+1][y+1];
	    t[0][0]=m[0][0];
	    for(int i=1;i<x+1;i++){
	        t[i][0]=t[i-1][0]+m[i][0];
	    }
	    for(int j=1;j<y+1;j++){
	        t[0][j]=t[0][j-1]+m[0][j];
	    }
	    for(int i=1;i<x+1;i++){
	        for(int j=1;j<y+1;j++){
	            t[i][j]= m[i][j]+Math.min(t[i-1][j], Math.min(t[i][j-1],t[i-1][j-1]));
	        }
	    }
	    return t[x][y];
	}
}

/*
input- 
1 2 3
4 8 2
1 5 3 
2 2
output-
8
*/