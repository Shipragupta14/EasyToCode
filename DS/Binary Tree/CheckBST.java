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
  
    public boolean checkBST(Node root, int max, int min){
        if(root==null){
            return true;
        }
        if(root.data>max || root.data<min){
            return false;
        }
        return (checkBST(root.left, root.data, min) && checkBST(root.right, max, root.data));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);
		root.right.left = new Node(25);
		root.right.right = new Node(35);
		int min =Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println(bt.checkBST(root, max, min));

	}
}

