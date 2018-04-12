//print the second largest element of BST

import java.io.*;
import java.util.*;
class BST{
    public static ArrayList arr;
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int d){
            data=d;
            left=right=null;
        }
    }
    Node root;
    BST(){
        root=null;
    }
     public void insert (int data){
        root = insert(root, data);
    }
    private Node insert(Node root, int data ){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(root.data>data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }
     
     void Inorder(){
        
        Inorder(root);
    }
    void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
       // System.out.print(n.data +" ");
        arr.add(n.data);
        Inorder(n.right);
   }
   
	public static void main (String[] args) {
		BST bt=new BST();
		bt.insert(4);
		bt.insert(3);
		bt.insert(6);
		bt.insert(2);
		bt.insert(1);
		bt.insert(5);
		bt.insert(7);
		arr=new ArrayList();
		bt.Inorder();
		int x=(arr.size());
		System.out.println(arr.get(x-2));
		
	}
}

/*
output=6
*/