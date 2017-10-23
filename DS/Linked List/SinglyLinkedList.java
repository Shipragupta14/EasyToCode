/* package codechef; // don't place package name! */

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
    
    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
    public static void main(String args[]){

        LinkedList l =  new LinkedList();
        // Scanner sc = new Scanner(System.in);
        // while(sc.hasNextInt()){
        // int x = sc.nextInt();        
        
       // System.out.println(i);
        l.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
    
        l.head.next=second;
        second.next=third;
        l.print();
      //  }
    }
}

