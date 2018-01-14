//http://algorithms.tutorialhorizon.com/check-if-two-bsts-are-identical/
import java.io.*;
import java.util.*;

class BST {
    class Node{
            int data;
            Node left , right;
            public Node(int d){
                this.data = d;
                this.left= null;
                this.right=null;
            }
    }

    Node root;
    
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
    
    public static boolean isIdentical(Node n1, Node n2){
        if(n1==null && n2==null){
            return true;
        }else if(n1!=null && n2==null){
            return false;
        }else if(n1==null && n2!=null){
            return false;
        }
        else if(n1.data==n2.data && isIdentical(n1.left, n2.left) && isIdentical(n1.right, n2.right)){
            return true;
        }else{
            return false;
        }
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
	   // bst.Inorder();
	    BST bst2 = new BST();  
	     bst2.insert(4);
	    bst2.insert (1);
	    bst2.insert(8);
	    bst2.insert(5);
	    bst2.insert(2);
	    bst2.insert(7);
	    bst2.insert(9);
	    if(bst2.isIdentical(bst.root , bst2.root)){
	        System.out.println("True");
		}else{
		    System.out.println("false");
	    }

	    
	  
	}
}