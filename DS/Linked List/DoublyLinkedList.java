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

    public void betweenInsert(Node prevn, int data){
        if(prevn==null){
                return;
        
        }
        Node n = new Node(data);
        n.next = prevn.next;
        prevn.next=n;
        n.prev=prevn;
        
        if(n.next!=null){
            n.next.prev=n;
        }
    }

    public void endInsert(int data){
        Node n = new Node (data);
        n.next = null;
        Node last =head;
        if(head==null){
            n.prev=null;
            head= n;
            return;
        }
        while(last.next!=null){
            last=last.next;
            

        }
        n.prev=n;
        last.next= n;
    }

    public void print(){
        Node n= head;
        Node last=null;
    //  System.out.println("Traversal in forward direction:");
        while(n!=null){
            System.out.print(n.data+" ");
            last=n;
            n=n.next;
        }
        System.out.println();
//          System.out.println("Traversal in backward direction:");
//          while(last!=null){
//              System.out.print(last.data+" "); 
//              last=last.prev;     
//      }
    }

    public static void main(String args[]){
        LinkedList l =  new LinkedList();
        l.endInsert(6);
        l.startInsert(7);
        l.startInsert(1);
        l.endInsert(4);
        l.betweenInsert(l.head.next,8);
        l.print();
    }

}