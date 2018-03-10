/*package whatever //do not write package name here */

//what is the max profit a person can earn in a week according to the given stock prices
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] week = new int[7];
       
        int min=Integer.MAX_VALUE;
        int profit=0;
        int max=0;
         for(int i=0; i<7;i++){
            week[i]=sc.nextInt();
            if(week[i]<min){
                min=week[i];
                
            }
            profit=week[i]-min;
            if(profit>max){
                max=profit;
            }
        }
        System.out.println(max);
	}
}

/*
input-75 25 36 12 50 70 40
output-58
*/