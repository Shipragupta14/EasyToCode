import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
    Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }

    class BSTnode{
    	int data;
    	BSTnode left;
    	BSTnode right; 
    	BSTnode(int d){
    		data =d;
    		left=right=null;
    	}
    }

    public int size(){
    	int count =0;
    	Node n = head;
    	while(n!=null){
    		n=n.next;
    		count++;
    	}
    	return count;
    }

    BSTnode listToBST(int l){
    	if (l<=0) {
    		return null;	
    	}
    	BSTnode left =  listToBST(l/2);
    	BSTnode root = new BSTnode(head.data);
    	root.left = left;
    	head  = head.next;
    	root.right =  listToBST(l-(l/2)-1);
    	return root;
    }
    
    public void insert(int data){
        Node n = new Node(data);
        n.next = head;
        n.prev = null;

        if(head!=null){
            head.prev = n;
        }
        head = n;
        
    }

     public void print(){
        Node n= head;
        Node last=null;
        while(n!=null){
            System.out.print(n.data+" ");
            last=n;
            n=n.next;
        }
    }


    public void inorder(BSTnode n ){
    	//Node n = root;
    	if (n==null) {
    		return;
    	}
    	inorder(n.left);
    	System.out.print(n.data+"");
    	inorder(n.right);
    }
    public void preorder(BSTnode n ){
    	//Node n = root;
    	if (n==null) {
    		return;
    	}
    	System.out.print(n.data+"");
    	preorder(n.left);
    	preorder(n.right);
    }
    public void postorder(BSTnode n ){
    	//Node n = root;
    	if (n==null) {
    		return;
    	}
    	
    	postorder(n.left);
    	postorder(n.right);
    	System.out.print(n.data+"");
    }
    
    

    public static void main(String args[]){
    	LinkedList ll = new LinkedList();
    	ll.insert(7);
    	ll.insert(6);
    	ll.insert(5);
    	ll.insert(4);
    	ll.insert(3);
    	ll.insert(2);
    	ll.insert(1);
    	System.out.print("Linked list : ");
    	ll.print();
    	System.out.println("");
    	BSTnode root = ll.listToBST(ll.size());
    	System.out.print("Inorder : ");
    	ll.inorder(root);
    	System.out.println("");
    	System.out.print("Preorder : ");
    	ll.preorder(root);
    	System.out.println("");
    	System.out.print("Postorder : ");
    	ll.postorder(root);

    }
}