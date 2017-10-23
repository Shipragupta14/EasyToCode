/*Find the maximum no. of ones in a row in a matrix. If a matrix has more than one row having same maximum no. 
of ones then it return the row with smallest index. */

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
        int maxones =Integer.MIN_VALUE; 
        //maxindex tells the index having max ones
        int maxindex=0;
        //counts the no. of ones in  a row
        
        int mat[][]= new int[a][b];

        for (int i=0; i<a ; i++){
            int count=0;
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

/* Input :
   3 3 
   0 0 1 0 1 1 1 0 0

   Output:
   1
*/