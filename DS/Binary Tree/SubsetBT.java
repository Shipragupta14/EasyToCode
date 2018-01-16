//http://algorithms.tutorialhorizon.com/given-two-binary-trees-check-if-one-binary-tree-is-a-subtree-of-another/
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
    
    public String Inorder(Node n){
        if(n==null)
            return "";
        return(Inorder(n.left)+
        (n.data +" ")+
        Inorder(n.right));
        
   }
   
    public String Preorder(Node n){
        if(n==null)
            return "";
        return((n.data +" ")+
        Preorder(n.left)+
        Preorder(n.right));
        
   }
   public boolean check(Node a, Node b){
       String ioa = Inorder(a);
       String iob = Inorder(b);
       String poa = Preorder(a);
       String pob=Preorder(b);
       return((ioa.toLowerCase().contains(iob.toLowerCase()) && poa.toLowerCase().contains(pob.toLowerCase())) || (iob.toLowerCase().contains(ioa.toLowerCase()) && pob.toLowerCase().contains(poa.toLowerCase())));
   }
	public static void main (String[] args) {
	    Node rootA = new Node(1);
		rootA.left = new Node(2);
		rootA.right = new Node(4);
		rootA.left.left = new Node(3); 
		rootA.right.right = new Node(6);
		rootA.right.left = new Node(5); 
		Node rootB = new Node(4);
		rootB.left = new Node(5);
		rootB.right = new Node(6); 
		BinaryTree bt = new BinaryTree();
		bt.Inorder(rootA);
		bt.Inorder(rootB);
		System.out.println(bt.check(rootA,rootB));
	}
}