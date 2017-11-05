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
    
    public void swap(){
        Node n = head;
        while(n!=null && n.next!=null){
            int temp = n.data;
            n.data= n.next.data;
            n.next.data = temp;
            n=n.next.next;
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
    public static void main(String args[]){
        LinkedList l =  new LinkedList();
        l.insert(20);
        l.insert(4);
        l.insert(15);
        l.insert(35);
        l.insert(54);
        l.print();
        System.out.println("");
        l.swap();
        l.print();
    }

}