package Tree;

public class TreeNode<T> {

	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(T data, TreeNode<T> left, TreeNode<T> right){
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	
}
