/*package whatever //do not write package name here */

https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
import java.io.*;
import java.util.*;
class Graph {
     LinkedList<Integer> adjlist[];
     int V;
	
		Graph(int v){
		    this.V=v;
		   adjlist=new LinkedList[v];
		   for(int i=0;i<v;i++){
		       adjlist[i]=new LinkedList();
		   }
		}
		
		void addEdge(int v, int w){
		    adjlist[v].add(w);
		}
		
		void DFSutil(int v, boolean[] visited){
		   visited[v]=true;
		   System.out.print(v+" ");  
		   Iterator<Integer> i=adjlist[v].listIterator();
		   while(i.hasNext()){
		       int n=i.next();
		       if(!visited[n]){
		           DFSutil(n,visited);
		       }
		   }
		}
		void DFS(int v){
		    boolean [] visited=new boolean[V];
		        DFSutil(v,visited);
		}
		public static void main (String[] args) {
		    Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(2);
	}
}

//output - 2 0 1 3