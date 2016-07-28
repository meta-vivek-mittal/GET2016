package session1.assignment3;

/**
* @author Vivek
* Creation of Singly Linked List
*/
public class Node<E> {
	
	public E nodeValue;
	public Node<E> link;
	
	public Node(){
		nodeValue = null;
		link = null;
	}
	
	public Node(E item){
		nodeValue = item;
		link = null;
	}
}