import java.io.*;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node (int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree {

	public static int[] arr = new int[100];;
	public static void printPath(int[] a, int len){
	   
	  // int size=a.length();
	   for(int i=0;i<len;i++){
	       System.out.print(""+a[i]);
	      
	   }
	    System.out.println("");
	   }
	
	public static void direction(Node root, int len){
	    
	   if(root==null){
	       return;
	   }
	   arr[len]=(root.data);
	   len++;
	   if(root.left==null && root.right==null){
	     printPath(arr,len);
	   }else{
	       
	       direction(root.left, len);
	       direction(root.right, len);
	   }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.left.left = new Node (7);
		root.right.left = new Node (6);
		root.right.left.left = new Node (8);
		root.right.left.right = new Node (9);
		
	//	arr = new ArrayList();
 		bt.direction(root,0);

	}
}
