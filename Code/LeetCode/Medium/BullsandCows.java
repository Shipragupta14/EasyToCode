/*package whatever //do not write package name here */
//https://leetcode.com/problems/bulls-and-cows/description/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String g=sc.next();
		System.out.println(getHint(s,g));
	}
	public static String getHint(String secret, String guess){
	    HashMap<String, Integer> map=new HashMap<String, Integer>();
	    int x=0;
	    int y=0;
	    int l1=secret.length();
	    int l2=guess.length();
	    String [] s=secret.split("");
	    String [] g=guess.split("");
	    for(int i=0;i<l1;i++){
	        map.put(s[i],i);
	    }
	    for(int i=0;i<l2;i++){
	        if(map.containsKey(g[i])){
	            if(map.get(g[i])==i){
	                x++;
	            }else{
	                System.out.println(i);
	                y++;
	            }
	        }
	    }
	    return (x+"A"+y+"B");
	}
}