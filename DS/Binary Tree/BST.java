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

    Node root;
    
    BST(){
        root = null;
    }
    public boolean search(int n){
        Node current = root;
        while(current!=null){
            if(current.data==n){
                System.out.println("true");
                return true;
            }else if(current.data>n){
                current = current.left;
            }else{
                current = current.right;
            }
        }
          System.out.println("false"); 
         return false;  
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
    
    public void delete(int data){
        root = delete(root, data);
    }
    
    private Node delete(Node root, int data){
        if(root==null){
            return root;
        }
        
        if(root.data>data){
            root.left = delete(root.left, data);
        }else if(root.data<data){
            root.right = delete(root.right, data);
        }else{
            //for no or one child 
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            
            //for 2 children
            root.data = min(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    
    int min(Node root){
        //replacing the root with inorder successor
        int minv = root.data;
        while(root.left!=null){
            minv= root.left.data;
            root = root.left;
        }
        return minv;
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
	    bst.search(5);
	    Scanner sc = new Scanner(System.in);
	    //no.of nodes wants to delete
	    int n = sc.nextInt();
	    for(int i =0;i<n;i++){
	        //node want to delete
	        bst.delete(sc.nextInt());
	        bst.Inorder();
	    }
	  
	}
}