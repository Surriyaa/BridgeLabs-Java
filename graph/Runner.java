package graph;

public class Runner {

	public static void main(String[] args) {
		
		Graph g=new Graph(5);
		
		g.addEdge(0,1);
		g.addEdge(2,3);
		g.addEdge(1,2);
		g.addEdge(3,4);
		g.addEdge(0,4);
		g.addEdge(1,4);
		
		g.printAll();
		
	}

}
