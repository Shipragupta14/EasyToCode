/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
    int size = 0;
    public Node head= null;
    public Node tail = null;

    public void startInsert(int d){
        System.out.println("push "+d);
        Node n = new Node(d)
        if(size==0){
            head=n;
            tail=n;
            n.next=head;    //tail.next = head
        }else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next= head;
        }
        size++;
    }

    public void endInsert(int d){
        if(size==0){
            tail=n;
            haed = n;
            n.next=head;
        }else{
            tail.next = n;
            tail= n;
            tail.next= head;
        }
        size++;
        System.out.println("added at end "+d);
    }
    
    public void print(){
        Node n = head;
        do{
            System.out.print(n.data+" ");
            n=n.next;
        }while(n!=head);
    }

   public static void main (String args[]){
        LinkedList l = new LinkedList();
        l.startInsert(3);
        l.startInsert(2);
        l.startInsert(1);
        l.print(); 
        l.endInsert(4);
        l.print(); 
    }
    
}

