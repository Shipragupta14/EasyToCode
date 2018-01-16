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

    public int size(Node n){
        if(n==null)
            return 0;
        return (1+size(n.left)+size(n.right));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (4);
		root.left.right = new Node (5);
		root.left.right.right = new Node (7);
		root.left.right.left = new Node (6);
        System.out.println(bt.size(root));

	}
}

