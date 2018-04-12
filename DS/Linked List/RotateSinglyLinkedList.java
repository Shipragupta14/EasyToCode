/*package whatever //do not write package name here */

//Given a list, rotate the list to the right by k places, where k is non-negative.
import java.io.*;
import java.util.*;

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
        int size=1;
        void rotate(int k){
            if(k==0) return;
            Node n=head;
            Node curr=head;
            int i=0;
            
            for( i=0;n.next!=null;i++){
                size++;
                n=n.next;
            }
            int count=1;
            while(count<size-k && curr!=null){
                count++;
                curr=curr.next;
            }
            Node kth=curr;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=head;
            head=kth.next;
            kth.next=null;
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
        public static void main (String[] args) {
	//	Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		ll.insert(5);
    	ll.insert(4);
    	ll.insert(3);
    	ll.insert(2);
    	ll.insert(1);
    	ll.print();
    	System.out.println("");
    	ll.rotate(2);
    	ll.print();
	}
    }
	
/*
output-
1 2 3 4 5 
4 5 1 2 3 
TC - O(n)
*/