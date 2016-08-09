package session8.assignment1;

import java.util.Scanner;

public class BinarySearchTree {

	private int numberOfElements;
	private int index;
	private int array[];

	public class Node {
		int data;
		Node right;
		Node left;

		public Node() {
			data = 0;
			right = null;
			left = null;
		}

		public Node(int item) {
			data = item;
			right = null;
			left = null;
		}
	}

	/**
	 * Following function takes input from the user.
	 */
	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements");
		numberOfElements = sc.nextInt();
		Node root = null;
		array = new int[numberOfElements];
		for (int index = 0; index < numberOfElements; index++) {
			System.out.println("Enter Element " + (index + 1) + " : ");
			array[index] = sc.nextInt();
			root = binarySearchTree(root, array[index]);
		}
		System.out.println("\n\nElements in disorderly format :");
		display();
		sc.close();
		System.out.println("\n\nArray in Inorder form : ");
		inOrder(root);
	}

	public Node binarySearchTree(Node root, int item) {
		if (root == null) {
			Node newNode = new Node(item);
			root = newNode;
			return root;
		} else if (root.data > item) {
			root.left = binarySearchTree(root.left, item);
		} else {
			root.right = binarySearchTree(root.right, item);
		}
		return root;
	}

	public void display() {
		System.out.println();
		for (int index = 0; index < numberOfElements; index++) {
			System.out.print("\t" + array[index]);
		}
	}

	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		array[index++] = root.data;
		inOrder(root.right);
	}
}
