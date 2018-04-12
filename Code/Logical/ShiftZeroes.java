//http://blog.gainlo.co/index.php/2016/11/18/uber-interview-question-move-zeroes/
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(a[i]==0)
		        count++;
		    else
		        System.out.print(a[i]+" ");
		}
		if(count!=0){
		    for(int i=0;i<count;i++){
		        System.out.print("0"+ " ");
		    }
		}
		
	}
}
/*
input-
5 
2 0 3 0 4
output-
2 3 4 0 0 
TC- O(n)
*/