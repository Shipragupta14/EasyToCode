/*package whatever //do not write package name here */
//http://codeforces.com/problemset/problem/957/A
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//String [] s=new String[n];
		String s=sc.next();
		int ind=0;
		String x="";
		String z="B";
		
		int count=0;
        if(s.charAt(0)=='?' || s.charAt(n-1)=='?'){
            count=1;
        }
		
		//System.out.println(Arrays.toString(s));
		for(int i=1;i<n-1;i++){
		    
		    if(s.charAt(i)=='C'){
		        if(s.charAt(i-1)=='C' || s.charAt(i+1)=='C'){
		            ind=1;
		            break;
		        }
		    }
		    else if(s.charAt(i)=='Y'){
		        if(s.charAt(i-1)=='Y' || s.charAt(i+1)=='Y'){
		            ind=1;
		            break;
		        }
		    }
		    if(s.charAt(i)=='M'){
		        if(s.charAt(i-1)=='M' || s.charAt(i+1)=='M'){
		            ind=1;
		            break;
		        }
		    }
		    if(s.charAt(i)=='?'){
		        if(s.charAt(i-1)==s.charAt(i+1) && s.charAt(i-1)!='?' && s.charAt(i+1)!='?'){
		            count++;
		            
		        }else if(s.charAt(i-1)=='?' || s.charAt(i+1)=='?'){
		            count++;
		            
		        }
		    }
		   
		}
		if(count==0 ){
		       ind=1;
		   } 
		   if(ind==0){
		       System.out.println("yes");
		   }else{
		       System.out.println("no");
		   }
	}
}