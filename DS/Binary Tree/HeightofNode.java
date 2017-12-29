import java.io.*;
import java.util.*;

class BST {
    static class Node{
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
    
//   public int height(Node n){
//       if(n==null)
//         return 0;
    
//         return (1+ Math.max(height(n.left), height(n.right)));
//   }

    public int search(Node root,int data, int height){
       if(root==null) return 0;
       if(root.data == data) return height;
       
       int level = search(root.left, data, height+1);
       if(level!=0) return level;
       
       return search(root.right, data, height+1);
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
	    bst.root = new Node(5);
	    bst.root.left = new Node(10);
	    bst.root.right = new Node (15);
	    bst.root.left.left = new Node(20);
	    bst.root.left.right = new Node(25);
	    bst.root.left.right.left = new Node(35);
	    bst.Inorder();
	    System.out.println("");
	   // System.out.println(bst.height(root));
	   // System.out.println("");
	    System.out.println(bst.search(root,25, 1));
	  
	}
}