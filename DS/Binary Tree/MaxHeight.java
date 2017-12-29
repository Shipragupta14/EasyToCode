import java.io.*;
import java.util.*;

class BST {
    class Node{
            int data;
            Node left , right;
            public Node(int d){
                data = d;
                left=right=null;
            }
    }

    static Node root;
    
    BST(){
        root = null;
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
    
   public int height(Node n){
       if(n==null)
        return 0;
    
        return (1+ Math.max(height(n.left), height(n.right)));
   }
    void Inorder(){
        Inorder(root);
    }
    void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
        System.out.print(n.data +" ");
        Inorder(n.right);
   }
	public static void main (String[] args) {
	    BST bst = new BST();
	    bst.insert(4);
	    bst.insert (1);
	    bst.insert(8);
	    bst.insert(5);
	    bst.insert(2);
	    bst.insert(7);
	     bst.insert(9);
	    bst.Inorder();
	    System.out.println("");
	    System.out.println(bst.height(root));
	  
	}
}