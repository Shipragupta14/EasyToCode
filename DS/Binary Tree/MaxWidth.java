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
  
    static int max=0;
    public int maxwidth(Node root){
        Queue<Node> q = new LinkedList<>();
         int num=0;
        if(root==null){
            return 0;
        }
        q.add(root);
        while(!q.isEmpty()){
           
            num= q.size();
            if(max<num){
                max=num;
            }
            while(num!=0){
                Node n= (Node)q.remove();
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                num--;
                
            }
        }
        return max;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BinaryTree bt  = new BinaryTree();
		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.right = new Node(15);
		root.right.left = new Node(25);
		root.right.right = new Node(35);
		int min =Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println(bt.maxwidth(root));

	}
}

