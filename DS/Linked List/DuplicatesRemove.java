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
        }
    }
	 public void insert(int data){
	        Node n = new Node(data);
	        n.next = head;
	        
	        head=n;

	    }

    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    void remove(){
    	Node p1=null;
    	Node p2=null;
    	Node dup=null;
    	p1=head;

    	while(p1!=null && p1.next!=null){
    		p2=p1;
    		while(p2.next!=null){
    			if (p1.data==p2.next.data) {
    				dup=p2.next;
    				p2.next=p2.next.next;
    			}else{
    				p2=p2.next;
    			}
    		}
    		p1=p1.next;

    	}
    }

    public static void main(String args[]){
    	LinkedList ll = new LinkedList();
    	ll.insert(7);
    	ll.insert(6);
    	ll.insert(5);
    	ll.insert(7);
    	ll.insert(3);
    	ll.insert(2);
    	ll.insert(1);
    	System.out.print("Linked list : ");
    	ll.print();
    	ll.remove();
    	System.out.println("");
    	ll.print();
    }

 }