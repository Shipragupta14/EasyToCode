//http://algorithms.tutorialhorizon.com/print-a-path-from-root-to-node-in-binary-tree/
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

	public static ArrayList arr;
	public static void printPath(Node root, int n){
	    arr = new ArrayList();
	    if(direction(root, n)){
	      //  arr.add(root.data);
	      	Collections.reverse(arr);
	      System.out.println(arr);
	    }else{
	        System.out.println("-1");
	    }
	}
	
	public static boolean direction(Node root, int n){
	    if(root==null){
	        return false;
	    }
	    if(root.data==n || direction(root.left, n) || direction(root.right,n)){
	        arr.add(root.data);
	        return true;
	    }
	    return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.right = new Node (5);
		root.left.right.right = new Node (8);
		root.left.right.left = new Node (7);
	//	arr = new ArrayList();
 		printPath(root,7);

	}
}

