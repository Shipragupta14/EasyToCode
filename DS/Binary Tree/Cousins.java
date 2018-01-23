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
    Node root;
	public boolean Sibling(Node node, Node a, Node b){
	    if(node==null){
	        return false;
	    }
	     return ((node.left == a && node.right == b) ||
                (node.left == b && node.right == a) ||
                Sibling(node.left, a, b) ||
                Sibling(node.right, a, b));
	}
	public int level(Node node, Node ptr, int lev){
	    if(node==null){
	        return 0;
	    }
	    if(node==ptr){
	        return lev;
	    }
	    int l = level(node.left, ptr, lev + 1);
        if (l != 0)
            return l;
        return level(node.right, ptr, lev + 1);
	}
	boolean isCousin(Node node, Node a, Node b){
	     return ((level(node, a, 1) == level(node, b, 1)) &&
                (!Sibling(node, a, b)));
	}
	
	public static void main (String args[]){
	    BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(15);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
 
        Node Node1, Node2;
        Node1 = tree.root.left.left;
        Node2 = tree.root.right.right;
        if (tree.isCousin(tree.root, Node1, Node2))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}
