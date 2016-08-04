package session5.assignment3;

public class RecursiveSortedLinkedList {

	Node head;
	int sizeOfLinkedList;
	/**
	 * Constructor Definition
	 */
	RecursiveSortedLinkedList(){
		sizeOfLinkedList = 0;
	}
	
	/**
	 * Defining Class for Node. 
	 */
	private class Node {
		int info;
		Node next;

		Node() {
			this.info = 0;
			this.next = null;
		}
		Node(int item){
			this.info = item;
			this.next=null;
		}
	}

	/**
	 * Following function is a recursive merge sort function.
	 * @param head(Node) denotes the head node of linked list.
	 * @return returns(Node) head node of linked list.
	 */
	public Node merge_sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node middle = getMiddle(head); // get the middle of the list
		Node sHalf = middle.next;
		middle.next = null; // split the list into two halfs

		return merge(merge_sort(head), merge_sort(sHalf)); // recurse on that
	}

	/**
	 * Following function merges the 2 parts of sorted linked lists.
	 * @param a(Node) denotes head node for first part.
	 * @param b(Node) denotes head node for second part.
	 * @return returns(Node) the head node of merged sorted linked lists.
	 */
	public Node merge(Node a, Node b) {
		Node tempHead, current;
		tempHead = new Node();
		current = tempHead;
		while (a != null && b != null) {
			if (a.info <= b.info) {
				current.next = a;
				a = a.next;
			} else {
				current.next = b;
				b = b.next;
			}
			current = current.next;
		}
		current.next = (a == null) ? b : a;
		return tempHead.next;
	}

	/**
	 * Following function finds the middle element for separating linked lists in 2 parts. 
	 * @param head(Node) denotes the head node of Linked Lists 
	 * @return slow(Node) denotes the middle node of linked lists.
	 */
	public Node getMiddle(Node head) {
		if (head == null) {
			return head;
		}
		Node slow, fast;
		slow = fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	/**
	 * Following function adds element in the Linked Lists.
	 * @param item(int) denotes the element to be added in the linked lists.
	 * @return true/false depending on whether item added or not.
	 */
	public boolean add(int item) {
		if (head == null) {
			Node newNode = new Node(item);
			head = newNode;
			newNode.next = null;
			sizeOfLinkedList++;
			return true;
		}
		Node temp = head;
		Node newNode = new Node(item);
		newNode.next = null;
		while(temp.next!=null)
			temp=temp.next;
		temp.next = newNode;
		sizeOfLinkedList++;
		head = merge_sort(head);
		return true;
	}
	
	/**
	 * Following function diplays the Sorted Linked lists.
	 */
	public void display(){
		Node temp = head;
		while(temp!= null){
			System.out.print("\t"+temp.info);
			temp = temp.next; 
		}
	}
}
