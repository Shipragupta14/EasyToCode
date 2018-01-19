import java.io.*;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node (int data){
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree {
  
    static int level = 1;
    public void levelorder(Node root, int min, int max){
        Queue<Node> q = new LinkedList<>();
         int num=0;
        if(root==null){
            return ;
        }
        q.add(root);
        while(!q.isEmpty()){
            num= q.size();
            while(num!=0){
                Node n= (Node)q.remove();
                if(level>=min  && level <=max){
                    System.out.println(" "+n.data);
                 //   System.out.println("");
                }
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                num--;
                
            }
             level++;
            
        }
     
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		root.left.right.left = new Node(40);
		root.left.right.right = new Node(45);
		root.left.right.left.left = new Node(50);
        bt.levelorder(root, 2,3);

	}
}

