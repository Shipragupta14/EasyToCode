import java.util.*;
import java.io.*;

class LinkedList{
    Node head;
    
    static class Node{
        String data;
        Node next;
        Node(String d){
            data=d;
            next=null;
        }
    }

    boolean isPalindrome(){
    	Node n = head;
    	String str = "";
    	while(n!=null){
    		str= str.concat(n.data);
    		n=n.next;
    	}

    	return isPalindromeCheck(str);
    }

    boolean isPalindromeCheck(String s){
    	int size = s.length();
    	for(int i =0;i<size;i++){
    		if(s.charAt(i)!=s.charAt(size-i-1)){
    			return false;
    		}

    	}
    	return true;
    	
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node("a");
        list.head.next = new Node("bc");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("dcb");
        list.head.next.next.next.next = new Node("a");
 
        System.out.println(list.isPalindrome());
 
    }
}
