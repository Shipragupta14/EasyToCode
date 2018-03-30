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
		System.out.println("Value of second: "+map.get(2));
		System.out.println("is hasmap empty? "+map.isEmpty());
		map.remove(3);
		System.out.println(map);
		System.out.println("Size of map:"+map.size());
	}
}