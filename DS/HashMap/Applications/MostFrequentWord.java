//https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings/0

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    int max=0;
		     HashMap< String, Integer> map=new HashMap<String,Integer>();
		    String [] s=new String[n];
		    for(int i=0;i<n;i++){
		        s[i]=sc.next();
		        if(map.containsKey(s[i])){
		            map.put(s[i], map.get(s[i])+1);
		        }else{
		            map.put(s[i], 1);
		        }
		    }
		    //Efficiently iterate over each entry in a map.
		    for(Map.Entry<String, Integer> m: map.entrySet()){
		        int temp=(Integer)m.getValue();
		        if(temp>max){
		            max=temp;
		        }
		    }
		    ArrayList<String> arr=new ArrayList<String>();
		    for(Map.Entry m: map.entrySet()){
		        int temp=(Integer)m.getValue();
		        if(temp==max){
		            String str=(String)m.getKey();
		            arr.add(str);
		        }
		    }
		    //in case of multiple answers print the first acc to lexicographical order.
		    Collections.sort(arr);
		    System.out.println(arr.get(0));
		}
	}
			
}

/*
Input -
3
3
geeks for geeks
2
hello world
3
world wide fund
output-
geeks
hello
fund

Time complexity- O(nlogn) //due to Collections.sort() in ArrayList
*/