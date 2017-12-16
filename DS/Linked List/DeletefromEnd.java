import java.util.*;
import java.io.*;

class LinkedList{
    static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	public void insert(int data){
			Node n = new Node(data);
			n.next=head;
			head=n;
	}

	public void print(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+"");
			n=n.next;
		}
	}

	public void pairswap(){
		Node n = head;
		while(n!=null){
			int temp= n.data;
			n.data=n.next.data;
			n.next.data = temp;
			//temp = n.next.next.data;
			n=n.next.next;

		}
	}
	
	public int kthByIteration(Node head, int k){
        if(head==null){
        return 0;
        		}
        Node curr = head;
        Node prev = null;
        while(k>0){
        			curr=curr.next;
        			k--;
        		}
        Node sec = head;
        while(curr!=null){
        			curr = curr.next;
        			prev = sec;
        			sec = sec.next;
        		}
        		prev.next=sec.next;
        int i = sec.data;
        System.out.println(i);
        return i;

	}

	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.insert(4);
		l.insert(3);
		l.insert(2);
		l.insert(1);
		l.print();
		System.out.println("");
		l.kthByIteration(head,2);
		l.print();
	}

	

}