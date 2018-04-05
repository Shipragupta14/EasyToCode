/*package whatever //do not write package name here */
//https://www.hackerearth.com/problem/algorithm/army-of-dead/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t--!=0){
		    int n=sc.nextInt();
		    long [] a=new long[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    PriorityQueue<Long> heap=new PriorityQueue<Long>();
		    heap.add(a[0]);
		    for(int i=1;i<n;i++){
		        while(!heap.isEmpty() && heap.peek()<=a[i]){
		            heap.remove();
		        }
		        heap.add(a[i]);
		    }
		    System.out.println(heap.size());
		}
	}
}