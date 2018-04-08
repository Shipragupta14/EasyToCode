import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ind=0;
		int n=s.length();
		int count1=0;
		int count2=0;
		int count3=1;
		for(int i=0;i<n-1;i++){
		    
		    if(s.charAt(i)=='a'){
		        if(s.charAt(i+1)!='c'){
		            count1++;
		        }else{
		            ind=1;
		            break;
		        }
		    }
		    if(s.charAt(i)=='b'){
		        if(s.charAt(i+1)!='a'){
		            count2++;
		        }else{
		            ind=1;
		            break;
		        }
		    }
		     if(s.charAt(i)=='c'){
		         if(s.charAt(i+1)=='c'){
		            count3++;
		        }else{
		            ind=1;
		            break;
		        }
		    }
		    int sum=count3+count1+count2+1;
		}
		if(s.charAt(0)!=('a') || s.charAt(n-1)!='c'  || count1==0 || count2==0 || (count3!=count2 && count3!=count1)){
		        ind=1;
		    }
		if(ind==1){
		    System.out.println("NO");
		}else{
		    System.out.println("YES");
		}
	}
	
	//TC-O(n)
}