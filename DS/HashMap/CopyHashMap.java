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
	    HashMap<Integer, String> hm=new HashMap<Integer, String>();
	    
	    hm.put(4, "fourth");
	    map.putAll(hm);
	    System.out.println(map);
	}
}

/*
output-
{1=first, 2=second, 3=third}
{1=first, 2=second, 3=third, 4=fourth}

*/