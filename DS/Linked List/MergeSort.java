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
    
    Node getmiddle(Node n){
       // Node n = head;
        if (n==null) {
            return n;
        }
        Node p1=n;
        Node p2=n.next;
        while(p2!=null){
            p2=p2.next;
            if (p2!=null) {
                p1=p1.next;
                p2=p2.next;
            }
        }
        return p1;
    }

    Node mergeSort(Node h){

        if (h==null || h.next==null) {
            return h;
        }
        Node m1 = getmiddle(h);
        Node m2 = m1.next;
        m1.next = null;
        Node left=mergeSort(h);
        Node right = mergeSort(m2);
        Node sort = sortMerge(left, right);

        return sort;
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
        LinkedList l =  new LinkedList();
        l.insert(20);
        l.insert(4);
        l.insert(15);
        l.insert(35);
        l.insert(54);
        l.print(l.head);
        System.out.println("");
        l.head = l.mergeSort(l.head);
        l.print(l.head);
    }

}