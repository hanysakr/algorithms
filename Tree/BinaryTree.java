package Tree;

public class BinaryTree<T> {
	
	public void preOrder(TreeNode<T> node){
		if(node == null)
			return;
		
		System.out.print(node.getData()+ " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}
	
	public void inOrder(TreeNode<T> node){
		if(node == null)
			return;
		
		inOrder(node.getLeft());
		System.out.print(node.getData()+ " ");
		inOrder(node.getRight());
	}
	
	public void postOrder(TreeNode<T> node){
		if(node == null)
			return;
		
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getData()+ " ");
	}
	
	
	public static void main(String[] args){
		
		
		TreeNode node10=new TreeNode(10, null, null);
		TreeNode node30=new TreeNode(30, null, null);
		TreeNode node50=new TreeNode(50, null, null);
		TreeNode node70=new TreeNode(70, null, null);
		
		TreeNode node20=new TreeNode(20, node10, node30);
		TreeNode node60=new TreeNode(60, node50, node70);

		TreeNode rootNode =new TreeNode(40, node20, node60);
		
		BinaryTree bt = new BinaryTree<>();
		bt.preOrder(rootNode);
		System.out.println("");
		bt.inOrder(rootNode);
		System.out.println("");
		bt.postOrder(rootNode);
	}

}
