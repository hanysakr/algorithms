package graph;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	
	private T data;
	private List<Node<T>> neighbours;
	private boolean visited;
	
	public Node(T data){
		this.data = data;
		neighbours = new ArrayList<>();
		this.visited = false;
	}
	
	public T getData() {
		return data;
	}
	public List<Node<T>> getNeighbours() {
		return neighbours;
	}
	
	public void addNeighbours(Node<T> newNode){
		neighbours.add(newNode);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
	
}
