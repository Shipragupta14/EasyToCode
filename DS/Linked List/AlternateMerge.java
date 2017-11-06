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
    
    public void print(Node head){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public void alterMerge(Node a, Node b){
        Node temp =a;
        while(a!=null && b!=null){
            Node a1 = a.next;
            Node b1 = b.next;
            a.next = b;
            b.next = a1;
            a=a1;
            b=b1;   
        }
        System.out.println("alternate merge list");
        print(temp);
        System.out.println("");
        System.out.println("Remaining list");
        print(b);
    }

    public static void main (String args[]){
        LinkedList l = new LinkedList();
        Node a = new Node(5);
        a.next = new Node (3);
        a.next.next = new Node(4);
        l.print(a);
        System.out.println("");
        Node b = new Node(7);
        b.next = new Node(8);
        b.next.next = new Node(1);
        b.next.next.next = new Node (9);
        b.next.next.next.next = new Node (2);
        l.print(b);
        System.out.println("");
        l.alterMerge(a,b);


    }
}