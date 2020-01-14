package com.sixdee.test.interviewbit.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	
	
	
	static class Graph{
		
		int V;
		LinkedList<Integer> adjList[];
		
		@SuppressWarnings("unchecked")
		Graph(int v){
			this.V=v;
			
			adjList=new LinkedList[V];
			
			
			for(int i=0;i<V;i++) {
				adjList[i]=new LinkedList<>();
			}
		}
		
	}
	
	
	static void addEdge(Graph graph,int src,int dest) {
		graph.adjList[src].add(dest);
	}
	
	void BreadthFS(Graph graph,int s){
		
		boolean visited[]=new boolean[graph.V];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = graph.adjList[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
		
		
	}
	

	public static void main(String[] args) {
		
		BFS bfs=new BFS();
		int v=4;
		Graph graph=new Graph(v);
		
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 2);
		addEdge(graph, 2, 0);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 3);
		
		System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

		bfs.BreadthFS(graph,2);
		

	}

}
