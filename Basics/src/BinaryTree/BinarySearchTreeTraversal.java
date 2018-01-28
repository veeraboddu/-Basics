package BinaryTree;

public class BinarySearchTreeTraversal {
	
	public static void preOrderTraversal(Node root)
	{
		if(root == null) return;
		System.out.print(root.getData()+" ");
		preOrderTraversal(root.leftChild);
		preOrderTraversal(root.rightChild);
	
	}
	
	public static void inOrderTraversal(Node root)
	{
		if(root == null) return;
		
		inOrderTraversal(root.leftChild);
		System.out.print(root.getData()+" ");
		inOrderTraversal(root.rightChild);
	
	}
	
	public static void postOrderTraversal(Node root)
	{
		if(root == null) return;
		
		postOrderTraversal(root.leftChild);
		postOrderTraversal(root.rightChild);
		System.out.print(root.getData()+" ");
	
	}
	public static void main(String arg[]){
		BST bst= new BST();
		bst.add(7);
		bst.add(1);
		bst.add(10);
		preOrderTraversal(bst.root);
		System.out.println("");
		inOrderTraversal(bst.root);
		System.out.println("");
		postOrderTraversal(bst.root);
	}
}
