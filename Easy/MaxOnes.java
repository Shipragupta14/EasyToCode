import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
        //Scan the rows and columns of the matrix
		int a = sc.nextInt();
		int b = sc.nextInt();
        //maxones tells the max no. of ones in a row
		int maxones =0; 
        //maxindex tells the index having max ones
        int maxindex=0;
        //counts the no. of ones in  a row
        int count=0;
		int mat[][]= new int[a][b];

		for (int i=0; i<a ; i++){
            for (int j=0; j<b ;j++){
                //scan the 0's and 1's 
                int x=sc.nextInt();
                mat[i][j] = x;
                if(mat[i][j]==1 ){
                    count ++;
                }
            }
                if(count >maxones){
                    maxones = count;
                    maxindex= i;
                }
            
        }
        System.out.println( maxindex);
		
	}
}