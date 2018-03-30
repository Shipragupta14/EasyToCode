/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		//add key-value pair to HashMap
		map.put(1, "first");
		map.put(2, "second");
		map.put(3, "third");
		System.out.println(map);
	    //search key 
	    if(map.containsKey(1)){
	        System.out.println("yes, key exists");
	    }else{
	        System.out.println("no, key doesn't exists");
	    }
	    
	    //search value 
	    if(map.containsValue("third")){
	        System.out.println("yes, value exists");
	    }else{
	        System.out.println("no, value doesn't exists");
	    }
	}
}

/*
output-
{1=first, 2=second, 3=third}
yes, key exists
yes, value exists


*/