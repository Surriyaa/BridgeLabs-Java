package com.graph;

import java.util.ArrayList;

public class Graph {

		ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
		Graph(int v){
			for(int i=0;i<v;i++) {
				adjList.add(new ArrayList<Integer>());
			}
		}
		public void addEdge(int u, int v) {
			
			adjList.get(u).add(v);
			adjList.get(v).add(u);	
		}
		
		public void printAll() {
			
			for(int i=0;i<adjList.size();i++) {
				System.out.println("Printing the "+i+" vertex");
				
				for(int j=0;j<adjList.get(i).size();j++) {
					System.out.println(" "+ adjList.get(i).get(j));
				}
			}
		}
	
	

}
