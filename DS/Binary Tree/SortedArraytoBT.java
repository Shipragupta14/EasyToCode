//http://algorithms.tutorialhorizon.com/sorted-array-to-binary-search-tree-of-minimal-height/
import java.io.*;
import java.util.*;
class Node{
        int data;
        Node left, right;
        public Node(int d){
            data = d;
            left=right=null;
        }
}
class BinaryTree {
    public Node recursion(int[] arr, int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root = new Node(arr[mid]);
        root.right = recursion(arr, mid+1, end);
        root.left = recursion(arr, start, mid-1);
        return root;
        
    }
    void Inorder(Node n){
        if(n==null)
            return;
        Inorder(n.left);
        System.out.print(n.data +" ");
        Inorder(n.right);
   }
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        BinaryTree bt = new BinaryTree();
        Node no = bt.recursion(a, 0, n-1);
        bt.Inorder(no);
	}
}