//https://www.codechef.com/problems/FBMT/

import java.util.*;
 
class GFG {
    public static void main (String[] args) throws NoSuchElementException{
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while( t--!=0){
            int n =sc.nextInt();
            String [] a = new String[n];
            int c1=0;
            int c2=0;
            String s1=null;
            String s2 = null;
 
            for(int i =0;i<n;i++){
                a[i] = sc.next();
                s1=a[0];
            
 
                if(a[0].equals(a[i])){
                    c1++;
 
                }else {
                    s2 =a[i];
                    c2++;
                }
              //  System.out.println(a[i]);
            }
            
            if(c1>c2){
                System.out.println(s1);
            }
            else if(c2>c1){
                System.out.println(s2);
            }else{
                System.out.println("Draw");
            }
 
        }
    }
} 