package com.sixdee.test.interviewbit.graph;

import java.util.LinkedList;

public class GraphRepresentation {
	
	
	static class Graph{
		
		int V;
		LinkedList<Integer>[] adjListArray;
		
		
		@SuppressWarnings("unchecked")
		Graph(int V){
			this.V=V;
			
			adjListArray=new LinkedList[V];
			
			
			for(int i=0;i<V;i++) {
				adjListArray[i]=new LinkedList<>();
			}
			
			
		}
		
		
		
	}
	
	
	static void addEdge(Graph graph,int src,int dest) {
		
		graph.adjListArray[src].addFirst(dest);
		
		graph.adjListArray[dest].addFirst(src);
		
	}
	
	
	static void printGraph(Graph graph) {
		
		for(int i=0;i<graph.V;i++) {
			
			 System.out.println("Adjacency list of vertex "+ i);
	            System.out.print("head");
	            for(Integer pCrawl: graph.adjListArray[i]){
	                System.out.print(" -> "+pCrawl);
	            }
	            System.out.println("\n");
			
		}
		
	}
	

	public static void main(String[] args) {
		
		
		// create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
      
        // print the adjacency list representation of 
        // the above graph
        printGraph(graph);
		
		
		
		

	}

}
