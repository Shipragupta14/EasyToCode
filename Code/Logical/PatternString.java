import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String p=sc.next();

	int m=p.length();
	String s[]=new String[m];
		
		int n=s.length;
		for(int i=0;i<n;i++){
		    s[i]=sc.next();
		}
		//System.out.println(Arrays.toString(s));
		int ind=0;
		if(m!=n){
		    ind=1;
		}else{
		    for(int i=1;i<n;i++){
		        if(p.charAt(i)==p.charAt(i-1) && !(s[i].equals(s[i-1]))){
		            ind=1;
		            break;
		        }else if(p.charAt(i)!=p.charAt(i-1) && s[i].equals(s[i-1])){
		            
		            ind=1;
		            break;
		        }
		    }
		}
	    if(ind==1){
	        System.out.println("false");
	    }else{
	        System.out.println("true");
	    }
	}
}