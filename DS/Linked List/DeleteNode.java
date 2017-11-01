/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
    Node head;
    
     class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public  void deleteKey(int key){
        Node n = head;
        Node prev=null;
        if(n!=null && n.data==key){
            head = n.next;
        }
        while(n!=null && n.data!=key){
            prev=n;
            n=n.next;

        }
        if(n==null){
            System.out.println("Key is not present");
            return;
        }
        prev.next = n.next;
    }
    
    public  void deletePos(int pos){
        Node n = head;
        Node prev=null;

        if(pos==0){
            head = n.next;
            return;
        }
       
        for(int i =0;n!=null&& i<pos-1;i++){
            prev=n;
            n=n.next;
        }
        if(n==null || n.next==null){
           // System.out.println("Key is not present");
            return;
        }
        prev.next = n.next;
    }

    public void insert(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
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
       l.insert(5);
       l.insert(2);
       l.insert(3);
       l.insert(6);
       l.insert(1);

        l.print();
        l.deletePos(4);
        System.out.println("");
        l.print();
       l.deleteKey(3);
        System.out.println("");
        l.print();
      
    }
}

