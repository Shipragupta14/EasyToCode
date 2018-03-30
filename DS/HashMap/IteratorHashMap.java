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
	    Set<Integer> keys=map.keySet();
	    for(Integer key: keys){
	        System.out.println("Value of "+key+ " is "+ map.get(key));
	    }
	}
}

/*
output-
{1=first, 2=second, 3=third}
Value of 1 is first
Value of 2 is second
Value of 3 is third

*/