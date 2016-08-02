package session3.assignment2;

import java.util.Scanner;

/**
 * @author Vivek
 */
/**
 * 
 * Logic : 2 Trees which have inorder traversal just reverse of each other is treated as mirror image similar trees.
 *
 */
public class IsMirrorImageSimilar {
	int array[] ;
	int i;

	
	/**
	 * Following function traveres the BST in INORDER manner and stores the item in array
	 * @param root(Node) denotes root node of BST.
	 */
	public void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		array[i++] = root.data;
		inOrder(root.right);
	}
	/**
	 * Following Function returns the array which stores the BST in inorder manner.
	 * @return array(int[]) returns the integer array of inorder items.
	 */
	public int[] getInorder() {
		return array;
	}

	/**
	 * Following function adds the item in BST.
	 * @param root(Node) denotes the root node of BST.
	 * @param item(item) denotes the item to be added in the BST.
	 * @return root(Node) denotes the root Node of BST.
	 */
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

	/**
	 * Following function adds the item in BST(of Opposite property).
	 * @param root(Node) denotes the root node of BST.
	 * @param item(item) denotes the item to be added in the BST.
	 * @return root(Node) denotes the root Node of BST.
	 */
	public Node binarySearchMirrorTree(Node root, int item) {
		if (root == null) {
			Node newNode = new Node(item);
			root = newNode;
			return root;
		} else if (root.data < item) {
			root.left = binarySearchMirrorTree(root.left, item);
		} else {
			root.right = binarySearchMirrorTree(root.right, item);
		}
		return root;
	}

	public static void main(String args[]) {
		IsMirrorImageSimilar obj1 = new IsMirrorImageSimilar();
		IsMirrorImageSimilar obj2 = new IsMirrorImageSimilar();
		
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter numbers of elements for tree 1 : ");
		int n = sc.nextInt();
		obj1.array=new int[n];
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter Element : " + i);
			int item = sc.nextInt();
			root = obj1.binarySearchTree(root, item);
		}
		//Function call to store the inorder pattern in array of obj1 of tree 1 
		obj1.inOrder(root);

		//printing inorder pattern of tree 1
		System.out.println("Inorder of Tree 1: ");
		for(int i=0;i<n;i++){
			System.out.println("\t"+obj1.array[i]);
		}
		
		root = null;

		System.out.println("Enter numbers of elements for tree 2 : ");
		int m = sc.nextInt();
		obj2.array=new int[m];
		for (int i = 1; i <= m; i++) {
			System.out.println("Enter Element : " + i);
			int item = sc.nextInt();
			root = obj2.binarySearchMirrorTree(root, item);
		}
		//Function call to store the inorder pattern in array of obj2 of tree 2
		obj2.inOrder(root);
		System.out.println("Inorder of Tree 2: ");
		for(int i=0;i<n;i++){
			System.out.println("\t"+obj2.array[i]);
		}
		boolean flag = true;
		if (n == m) {
			for (int i = 0, j = n - 1; i < n && j > 0; i++, j--) {
				if (obj1.array[i] != obj2.array[j]) {
					flag = false;
					break;
				}
			}
		} else {
			System.out.println("Trees are not Mirror to each other");
		}

		if (flag == true) {
			System.out.println("Trees are mirror to each other");
		} else {
			System.out.println("Trees are not Mirror to each other");
		}

		sc.close();
	}
}
