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

    public void deleteNode( Node n){
        if (head==null|| n==null) {
            return;
        }
        if (head==n) {
           head=n.next;
           return;
        }
        if(n.prev!=null){
            n.prev.next = n.next;
        }
        if (n.next!=null) {
            n.next.prev = n.prev;
        }
        return;
    }

    public void deletePos(int pos){
        if(head==null||pos<=0){
            return;
        }        
        Node n = head;
        for(int i=1;i<pos && n!=null;i++){
            n = n.next;
        }
        if(n==null){
            return;
        }
        deleteNode(n);
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
        l.deletePos(4);
        l.deletePos(2);
        l.print();
    }
}