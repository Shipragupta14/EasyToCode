class LinkedList{
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    Node reverse(Node n){
        Node prev = null;
        Node current = n;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        n=prev;
        return n ; 
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
    
        l.head=new Node(1);
        l.head.next=new Node(2);
        l.head.next.next=new Node(3);
        l.head.next.next.next=new Node(4);
    
        System.out.println("Linked list");
        l.print();
        head = l.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        l.print();
      //  }
    }
}

