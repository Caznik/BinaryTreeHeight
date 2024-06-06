package main;

import java.util.Scanner;

public class BinaryTreeHeight {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = tree.insert(root, data);
        }
        scan.close();


        int height = tree.height(root);
        System.out.println("Height of the binary tree is: " + height);

	}

}
