import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
    Node head;
    int size=0;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int data){
        Node n = new Node(data);
        if(size==0){
        	head=n;
        }else{
        	Node temp = head;
        	n.next=temp;
        	head=n;
    	}
    	size++;
    }

    public int pop(){
    	if(size==0){
    		System.out.println("Stack is empty");
    		return -1;

    	}else{
    		Node temp= head;
    		head=head.next;
    		size --; 
    		return temp.data;
    	}
    }
    
    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String args[]){
        LinkedList l =  new LinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.print();
        System.out.println("");
        l.pop();
        l.print();
    }

}