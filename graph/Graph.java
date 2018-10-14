package graph;

import java.util.List;

public abstract class Graph {

	private int numVertices;
	private int numEdge;
	
	public Graph(){
		numEdge = 0;
		numVertices = 0;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdge() {
		return numEdge;
	}
	
	public void addVertex(){
		implementAddVertex();
		numVertices++;
	}
	
	public void addEdg(int v, int w){
		implementAddEdg(v,w);
		numEdge++;
	}

	public abstract void implementAddEdg(int v, int w);

	public abstract void implementAddVertex();
	
	public abstract List<Integer> getNeighbors(int v);
	
	
}
