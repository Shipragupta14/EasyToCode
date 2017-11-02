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

    public void fromLast(int n){
        Node temp =  head;
        int len =0;
        while(temp!=null){
            temp =temp.next;
            len++;
        }
        if(len<n){
            return;
        }
        temp=head;

        //remember to start with i =1 not 0
        for(int i=1;i<len-n+1;i++){
            temp=temp.next;
        }
        System.out.print(temp.data);
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
        l.print();
        System.out.println("");
        l.fromLast(3);
    }
}