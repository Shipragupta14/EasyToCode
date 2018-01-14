import java.io.*;
import java.util.*;

class BT {
    static class Node{
            int data;
            Node left , right;
            public Node(int d){
                data = d;
                left=right=null;
            }
    }

    static Node root;
    
    BT(){
        root = null;
    }
    
    public int height(Node n){
       if(n==null)
        return 0;
    
        return (1+ Math.max(height(n.left), height(n.right)));
   }
   public void levelOrder(Node n){
       int h= height(n);
       for(int i=0;i<h;i++){
           print(n, i);
           System.out.println("");
       }
   }
   public void print(Node n, int x){
       if (n==null)
        return ;
       if(x==1){
           System.out.print(" "+n.data);
       }else{
          print(n.left, x-1);
          print(n.right, x-1);
       }
   }
   
   public static void main(String args[]){
       BT bt = new BT();
       bt.root = new Node(5);
	    bt.root.left = new Node(10);
	    bt.root.right = new Node (15);
	    bt.root.left.left = new Node(20);
	    bt.root.left.right = new Node(25);
	    bt.root.left.right.left = new Node(35);
	    bt.levelOrder(root);
   }
}