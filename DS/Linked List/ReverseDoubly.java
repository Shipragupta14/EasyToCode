import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
    Node head;
    
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data=d;
            next=null;
            prev=null;
        }
    }

    public void startInsert(int data){
        Node n = new Node(data);
        n.next = head;
        n.prev = null;

        if(head!=null){
            head.prev = n;
        }
        head = n;
        
    }

    public void reverse(){
        Node temp = null;
        Node current = head;
        while(current!=null){
            temp = current.prev;
            current.prev=current.next;
            current.next=temp;
            current = current.prev;
        }    
        if(temp!=null){
            head = temp.prev;
        }    
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

    public static void main(String args[]){
        LinkedList l = new LinkedList();
        l.startInsert(2);
        l.startInsert(4);
        l.startInsert(8);
        l.startInsert(10);
        l.print();
        System.out.println("");
        l.reverse();
        l.print();
    }
}