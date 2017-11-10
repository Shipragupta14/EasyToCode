import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LinkedList{
     Node head=null;
   // int size=0;
    
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
          //  next=null;
        }
    }
    
    
    Node sortMerge(Node a, Node b){
        Node result = null;
        if(a==null){
            return b;
        }
        if (b==null) {
            return a;
        }
        if (a.data<=b.data) {
            result = a;
            result.next = sortMerge(a.next,b);

        }else{
            result = b;
            result.next = sortMerge(a,b.next);
        }

        return result;
       // System.out.println(result);

    }

    public void insert(int data){
        Node n = new Node(data);
        n.next = head;
        
        head=n;

    }
    
    public void print(Node n ){
       // Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String args[]){
       LinkedList l = new LinkedList();
        Node a = new Node(5);
        a.next = new Node (6);
        a.next.next = new Node(8);
        l.print(a);
        System.out.println("");
        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(17);
         b.next.next.next = new Node (19);
        // b.next.next.next.next = new Node (2);
        l.print(b);
        System.out.println("");
        Node result;
        result = l.sortMerge(a,b);
         System.out.println("");
         l.print(result);
         
        
    }

}