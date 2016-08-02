package session3.assignment1;

import java.util.Scanner;

public class PreOrderTraversal {
	
	/**
	 * Following function inserts the node in the binary search tree.
	 * @param root(Node) denotes the address of root node.
	 * @param item(int) denotes the item to be added in the tree as a node.
	 * @return returns root(Node) 
	 */
	public Node insertNode(Node root, int item){
		
		if(root == null){
			Node newNode = new Node(item);
			root=newNode;
			return root;
		} else if(root.data > item){
			root.left= insertNode(root.left,item);
		} else {
			 root.right=insertNode(root.right,item);
		} 
		return root;
	}
	
	/**
	 * Folowing function prints the BST in Preorder manner
	 * @param root(Node) denotes the root of BST.
 	 */
	public void preOrder(Node root){
		if(root == null)
			return;
		System.out.println("\t"+root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	public static void main(String args[]){
		
		Node root=null;
		PreOrderTraversal obj = new PreOrderTraversal();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of items to be added in the BST : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter Element "+(i+1)+":");
			int item = sc.nextInt();
			root=obj.insertNode(root, item);
		}
		System.out.println("PreOrder Traversal : \n");
		obj.preOrder(root);		
		sc.close();
	}
}
