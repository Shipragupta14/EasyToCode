/*package whatever //do not write package name here */
//https://leetcode.com/problems/happy-number/description/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		if(isHappy(n)){
		    System.out.println(n+" is happy number");
		}else{
		    System.out.println(n+" is not happy number");
		}
		
	}
	 public static boolean isPower( int y)
    {
        int pow = 1;
        while (pow < y)
            pow = pow * 10;
 
        return (pow == y);
    }
     static int count=0;
     static int id=0;
    public static boolean isHappy(int n){
        count++;
        
        int sum=0;
        while (n > 0 && count<=10) {
            sum=sum+( n % 10)*( n % 10);
            n = n / 10;
        }
        //System.out.println(count);
       // System.out.println(sum);
        if(isPower(sum) && count<=10){
            id=1;
            
        }else if(!isPower(sum) && count<=10){
            isHappy(sum);
        }else if(count>10){
            id=0;
        }
        if(id==1){
            return true;
        }else{
            
            return false;
        }
    }
}