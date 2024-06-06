package main;

public class BinaryTree {
	// Method to calculate the height of the binary tree
	public int height(Node root) {
		if (root == null) {
			return -1; // Base case: height of an empty tree is -1
		} else {
			int leftHeight = height(root.getLeft());
			int rightHeight = height(root.getRight());
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	// Method to insert nodes into the binary search tree
	public Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.getData()) {
				cur = insert(root.getLeft(), data);
				root.setLeft(cur);
			} else {
				cur = insert(root.getRight(), data);
				root.setRight(cur);
			}
			return root;
		}
	}

}
