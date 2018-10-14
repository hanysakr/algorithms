package graph;

import java.util.Stack;

public class DFS<T> {

	

	public void dfsUsingStack(Node<T> node) {
		Stack<Node<T>>  stack = new Stack<>();
		stack.add(node);
		node.setVisited(true);
		
		while (!stack.isEmpty()) {
			Node<T> curr = stack.pop();
			System.out.print(curr.getData() + " ");
			for (Node<T> n : curr.getNeighbours()) {
				if(!n.isVisited()){
					stack.add(n);
					n.setVisited(true);
				}			
			}
			
		}
	}
	
	public void dfsUsingIterartion(Node<T> node){
		if(node == null){
			return;
		}
		
		System.out.print(node.getData() + " ");
		node.setVisited(true);
		for(Node<T> curr : node.getNeighbours()){
			if(!curr.isVisited()){
				curr.setVisited(true);
				dfsUsingIterartion(curr);
			}
		}
	}

	public static void main(String[] args) {
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node10);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
		
		DFS dfs = new DFS<>();
		dfs.dfsUsingStack(node40);
		
		node40.setVisited(false);
		node10.setVisited(false);
		node20.setVisited(false);
		node30.setVisited(false);
		node60.setVisited(false);
		node50.setVisited(false);
		node70.setVisited(false);
		System.out.println("");
		dfs = new DFS<>();
		dfs.dfsUsingIterartion(node40);
	}

}
