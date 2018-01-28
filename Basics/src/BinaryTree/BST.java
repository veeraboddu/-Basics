package BinaryTree;

public class BST {
	
	public Node root;
	
	public BST(){
		root = null;
	}
	
	public int visit(){
		return root.getData();
	}
	
	public void add(int value){
		root = add(root, value);
	}
	
	private Node add(Node root, int value){
		if(root == null){
			root = new Node(value);
		}
		else if(root.getData()>value){
			root.leftChild = add(root.leftChild, value);
		}
		else if(root.getData() < value){
			root.rightChild = add(root.rightChild, value);
		}
		return root;
	}

}
