//https://www.hackerearth.com/problem/algorithm/8-7/

//HINT- Hashing problem

import java.io.*;
import java.util.*;

class Test {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int l1=s.length();
        int l2=t.length();
        int count=0;
        for(int i=0;i<l1;i++){
            if(s.charAt(i)==t.charAt(0)){
                int z=1;
                int x=1;
               if(i+l2-1<l1){
                    for(int j=i+1;j<i+l2;j++){
                        if(s.charAt(j)==t.charAt(z)){
                            x++;
                            z++;
                        //    System.out.println(x);
                        }else{
                            break;
                        }
                    }
                }else{
                    break;
                }
                if(x==l2){
                    count++;
                    i=i+l2-1;
                }
            }
        }
        System.out.println(count);
	}
}