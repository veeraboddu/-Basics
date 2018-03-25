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



/*
 
 Algorithm for Binary search tree
 	1.
node class

node leftnode;
node rightnode;
int value;

constructor for assignment 
generate setter and getter for left/right/value

----------
2.
BST class

Public Node root;
constructor BST =null

add(node roo, int value) 
- check root = null then assign value to root.
- if root != null then
- check root> value 
      letf = vaule -> recursion(left,value)
- check root < value
      right = value ->recursion(right,value)


---------------------
3. traversal 

bst b1 = new bst();
b1.add() - elments 25, 20, 35, 10, 22, 30, 40
     
          25
     20        35
  10    22   30   40

preorder
- root= NULL - return
- getData/value
- preorderTraversal (root.leftnode)
- preorderTraversal (root.rightnode)

inorder
- root= NULL - return
- inorderTraversal (root.leftnode)
- getData/value
- inorderTraversal (root.rightnode)

postorder
- root= NULL - return
- postorderTraversal (root.leftnode)
- postorderTraversal (root.rightnode)
- getData/value 
 
 7. Methods in stack
Ans
   push, pop, delete, sele
stack - push(),pop(), peek(), search(), empty() - check empty or not, 
peek() - looks at the object at the top of this stack without remove it. 
search() - returns the position where an object on the stack.

 
 */
