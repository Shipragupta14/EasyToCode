/*package whatever //do not write package name here */

//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
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
		
		void BFS(int s){
		    boolean[] visited = new boolean[V];
		    LinkedList<Integer> queue=new LinkedList<Integer>();
		    visited[s]=true;
		    queue.add(s);
		    while(queue.size()!=0){
		         s=queue.poll();
		        System.out.print(s+ " ");
		        //Can't replace this iterator with for loop
		        Iterator<Integer> i= adjlist[s].listIterator();
		            while(i.hasNext()){
		                 int n = i.next();
                            if (!visited[n])
                            {
                                visited[n] = true;
                                queue.add(n);
                            }
		            }
		    }
		}
		public static void main (String[] args) {
		    Graph g = new Graph(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(2);
	}
}

//output - 2 0 3 1