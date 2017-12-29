import java.io.*;
import java.util.*;

class Node{
        int data;
        Node left, right;
        public Node(int d){
            data = d;
            left=right=null;
        }
}
class BinaryTree{
    static Node root ;
    BinaryTree(){
    root = null;
    }                                                                                                                                                                                                                                                    
    void insert(int data){
        root = insert(root, data);
    }
    private Node insert(Node n , int data){
        if(n ==null){
            n = new Node(data);
        }else{
            if(n.left==null){
               
                 n.left = insert(n.left, data);
                 System.out.println(n.left);
            }else{
                n.right = insert(n.right ,data);
            }
        }
        return n;
    }
    void Preorder(Node n){
        if(n==null)
            return;
        System.out.print(n.data +" ");
        Preorder(n.left);
        Preorder(n.right);
   }
   void Postorder(Node n){
        if(n==null)
            return;
        Postorder(n.left);
        Postorder(n.right);
        System.out.print(n.data +" ");
   }
   void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
        System.out.print(n.data +" ");
        Inorder(n.right);
   }
    
    
	public static void main (String[] args) {
		BinaryTree bt = new BinaryTree();
		Scanner sc = new Scanner (System.in);
	//	System.out.println("Enter total no. of nodes");
	    int n = sc.nextInt();
		for (int i=0;i<n ;i++ ){
		    int d= sc.nextInt();
	        bt.insert(d);
	       // bt.Preorder(root);
		} 
	
 		bt.Preorder(root.left);
//  		System.out.println("");
//  		bt.Postorder(root);
//  		System.out.println("");
//  		bt.Inorder(root);

	}
}