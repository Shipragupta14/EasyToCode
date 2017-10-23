//https://www.codechef.com/COOK87/problems/CK87QUER

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     int T=scan.nextInt();
        while(T--!=0) {
        int a[] = new int[10000];
        int b[] = new int[700];
        for(int x =0;x<10000;x++){
    		       a[x]=x+1;
    		    }
    	for(int y =0;y<700;y++){
    		       b[y]=y+1;
    		    }
        

        int c = scan.nextInt();

        System.out.println( pairs(a, b, c));
    }
 }

    public static int pairs(int A[], int B[], int n) {
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int total = (A[i]*A[i]) + B[j];

                if(total <= n)
                    count++;
            }
        }

        return count;
    }
}

/*
Input:
4
2
3
4
10000000000

Output:
1
2
3
69999300
*/
