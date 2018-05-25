//https://www.hackerearth.com/problem/algorithm/easy-med-2/
import java.util.*;
import java.io.*;
class TestClass {
    static int count=0;
    static int a[];
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner (System.in);
       int n =sc.nextInt();
       a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
        sort(a, 0, n-1);
        System.out.print(count);
    }
    static void sort(int[] a, int l,  int r){
        if(l<r){
            int mid= (l+r)/2;
            sort(a, l, mid);
            sort(a, mid+1, r);
            if(!isSorted(a, l, r)){
                count++;
               // System.out.println(count);
            }
        }
    }
    static boolean isSorted(int[] a, int l, int r){
        boolean ind=true;
        for(int i=l+1;i<=r;i++){
            if(a[i]<a[i-1]){
                //System.out.println(i);
                ind=false;
                break;
            }
        }
        //System.out.println(ind);
        return ind;
    }
}
/*
input-
4
1 2 4 3
output-
2 
*/