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
  
   // static int max=0;
    static boolean fuck=true;
    public static int height(Node root){
        if(root==null) return 0;
        return (1+height(root.left)+height(root.right));
    }
    public void zigzag(Node root){
        Queue<Node> q = new LinkedList<>();
         int num=0;
        if(root==null){
            return ;
        }
        q.add(root);
        int h=height(root);
        List<Integer> arr = new ArrayList<Integer>();
        while(!q.isEmpty()){
            
            num= q.size();
            arr.clear();
            while(num!=0){
                Node n= (Node)q.remove();
                arr.add(n.data);
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                num--;
                
            }
              if(fuck){
                  Collections.reverse(arr);
                  System.out.println(arr);
                  fuck = !fuck;
              } else{
                  System.out.println(arr);
                  fuck=!fuck;
              }
            
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
		root.left.left.left = new Node(40);
		root.left.left.right = new Node(45);
        bt.zigzag(root);

	}
}

