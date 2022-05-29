class BSTNode {
	String key;
	BSTNode left, right;
	public BSTNode(String k) { key = k; left = right = null;}
}
class BST_Tree {
	BSTNode root;
	BST_Tree() { root = null;}
	void insert(String key) { root = insertRec(root, key); }
	BSTNode insertRec(BSTNode root, String key) {
		if (root == null) {
			root = new BSTNode(key); // TODO 1
			return root;
		}
		if (key.compareTo(root.key) < 0)
			root.left = insertRec(root.left, key); 
		else if (key.compareTo(root.key) > 0)
			root.right = insertRec(root.right, key); // TODO 2
		return root;
	}
	void inorder() { inorderRec(root); }
	void inorderRec(BSTNode root) {
		if (root != null) {
			inorderRec(root.left); // TODO 3
			System.out.print(root.key + " "); // TODO 4
			inorderRec(root.right); // TODO 5
		}
	}
}
public class BST_Main {
	public static void main(String[] args) {
		BST_Tree myTree = new BST_Tree(); // TODO 6
		System.out.println("Insert Grapes, Apples, Oranges ");
		myTree.insert("Grapes"); // TODO 7
		myTree.insert("Apples"); // TODO 8
		myTree.insert("Oranges"); // TODO 9
		System.out.println("In-order traversal: ");
		myTree.inorder(); // TODO 10
	}
}
# OUTPUT: 
# Insert Grapes, Apples, Oranges 
# In-order traversal: 
# Apples Grapes Oranges 
