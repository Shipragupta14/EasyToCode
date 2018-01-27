/*package whatever //do not write package name here */

import java.io.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right =null;
	}
}

class BinaryTree{
    public static int cl=0;
    static public void rightview(Node root, int nl){
        if(root==null){
            return;
        }
        if(cl<nl){
            System.out.print(" "+root.data);
            cl=nl;
        }
        //Remember to call left node first
        //if left node is null, we go to right node otherwise after printing left node, 
        //if condition will not satisfy the right node as cl=nl in that case
        
        
        rightview(root.left,nl+1);
        rightview(root.right,nl+1);
        
    }
	public static void main (String[] args) {
	    BinaryTree bt=new BinaryTree();
        Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		root.left.right.right = new Node(45);
		bt.rightview(root,1);
	}
}