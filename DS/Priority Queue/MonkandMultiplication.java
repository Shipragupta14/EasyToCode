/*package whatever //do not write package name here */
//https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/practice-problems/algorithm/monk-and-multiplication/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long [] a=new long [n];
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		PriorityQueue<Long> heap=new PriorityQueue<Long>(Comparator.reverseOrder());
		for(int i=0;i<n;i++){
		    heap.add(a[i]);
		    if(i<=1){
		       System.out.println("-1");
		       
		    }else{
		        long x=heap.remove();
		        long y=heap.remove();
		        long z=heap.remove();
		       // System.out.println(x +" "+y+ " "+z);
		        System.out.println(x*y*z);
		        heap.add(x);heap.add(y);heap.add(z);
		    }
		}
	}
}

//Time complexity: O(logn)