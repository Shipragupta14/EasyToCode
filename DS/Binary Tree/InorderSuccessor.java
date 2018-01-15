//http://algorithms.tutorialhorizon.com/sorted-array-to-binary-search-tree-of-minimal-height/
import java.io.*;
import java.util.*;
class Node{
        int data;
        Node left, right, next;
        public Node(int d){
            data = d;
            left=right=next=null;
        }
}
class BinaryTree {
    Node root;
    static Node next = null;
    void successor( Node node){
         if (node != null) 
        {
            successor(node.right);
              node.next = next;
            next = node;
              successor(node.left);
        }
    }
    void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
        System.out.print(n.data +" ");
        Inorder(n.right);
   }
	public static void main (String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);
        tree.successor(tree.root);
        Node x=tree.root.left.left;
        while(x!=null){
            tree.Inorder(x);
            x=x.next;
        }
	}
}