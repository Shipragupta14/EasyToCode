//http://codeforces.com/contest/987/problem/A
import java.io.*;
import java.util.*;
public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("Power", "purple");
		map.put("Time", "green");
		map.put("Space", "blue");
		map.put("Soul", "orange");
		map.put("Reality", "red");
		map.put("Mind", "yellow");
		int n=sc.nextInt();
		String s[]=new String[n];
		int x=6-n;
		for(int i=0;i<n;i++){
		    s[i]=sc.next();
		}
		for(int i=0;i<n;i++){
		    if(s[i].equals("red")){
		        map.remove("Reality");
		    }
		     if(s[i].equals("purple")){
		        map.remove("Power");
		    }
		     if(s[i].equals("green")){
		        map.remove("Time");
		    }
		     if(s[i].equals("blue")){
		        map.remove("Space");
		    }
		     if(s[i].equals("orange")){
		        map.remove("Soul");
		    }
		     if(s[i].equals("yellow")){
		        map.remove("Mind");
		    }
		}
		System.out.println(x);
		for(Map.Entry<String, String> m: map.entrySet()){
		   System.out.println(m.getKey());
		}
	}
}

//TC-O(n)