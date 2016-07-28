package session1.assignment3;

public class SinglyLinkedList<E> {

	public Node<E> head;
	int sizeOfLinkedList = 0;
	
	/**
	 * 
	 * @param index(int) denotes the position.
	 * @return returns the node at that position.
	 */
	public Node<E> node(int index) {
		Node<E> node = head;
		for(int i=0; i < index; i++) {
			node = node.link;
		}
		return node;
	}
	/**
	 * @param item(E) denotes the item to be added in the linked list.
	 * @param position(int) denotes the position at which the item is to be added.
	 * @return true/false whether item added or not
	 */
	public boolean add(E item, int position) {
		if (head == null) {
			Node<E> newNode = new Node<E>(item);
			head = newNode;
			newNode.link = null;
			sizeOfLinkedList++;
			return true;
		}
		Node<E> temp = head;
		Node<E> newNode = new Node<E>(item);
		newNode.link = null;
		int index = 1;
		while (index < position - 1) {
			temp = temp.link;
		}
		temp.link = newNode;
		sizeOfLinkedList++;
		return true;
	}
	/**
	 * @param item(E) denotes the item to be remove from the linked list.
	 * @return true/false whether item has been removed or not.
	 */
	public boolean removeItem(E item) {
		if (head == null) {
			System.out.println("Empty List");
			return false;
		}
		Node<E> current = head;
		Node<E> previous = head;
		boolean flag = false;
		while (current != null) {
			if (current.nodeValue == item) {
				flag = true;
				break;
			}
			previous = current;
			current = current.link;
		}
		if (flag == true) {
			previous = current.link;
			return true;
		}
		System.out.println("Item not in the List");
		return false;
	}
	/**
	 * @param position(int) denotes the position of node that is to be deleted from the list
	 * @return true/false whether item removed or not.
	 */
	public boolean removeAt(int position) {
		if (head == null) {
			System.out.println("Empty List");
			return false;
		} else if (position <= 0)
			return false;
		else if (position == 1)
			head = head.link;
		else if (position == 2)
			head.link = head.link.link;
		else {
			Node<E> current = head;
			int index = 2;
			while (index < position) {
				current = current.link;
			}
			current.link = current.link.link;
		}
		return true;
	}
	/**
	 * @param position(int) denotes the position of node which is to be retrieved
	 * @return the item at the specified position.
	 */
	public E retreiveItem(int position) {
		if (head == null) {
			System.out.println("Empty List");
			return null;
		} else if (position > sizeOfLinkedList) {
			System.out.println("Array Index Out Of Bound Exception");
			return null;
		} else {
			Node<E> current = head;
			int index = 0;
			while (current != null) {
				index++;
				if (index == position)
					break;
				current = current.link;
			}
			return current.nodeValue;

		}
	}
	// Following Funciton reverse the linked list.
	public boolean reverse() {
		if (head == null) {
			System.out.println("Empty List");
			return false;
		}
		Node<E> current = head;
		Node<E> boss = head;
		Node<E> previous = null;
		while (current != null) {
			boss = boss.link;
			current.link = previous;
			previous = current;
			current = boss;
		}
		return true;
	}
	//Following function sorts the linked list.
	public void sorting() {
		SinglyLinkedList<E> temp = new SinglyLinkedList<E>();
		Node<E> x = head;
		for (int i = 0; i < sizeOfLinkedList; i++) {
			temp.add(x.nodeValue, sizeOfLinkedList);
			x = x.link;
		}
		temp.sorting();
		x = head;
		for (int i = 0; i < temp.size(); i++) {
			x.nodeValue = temp.get(i);
			x = x.link;
		}
	}
	//Following Function returns the size of the Linked List.
	public int size() {
		return sizeOfLinkedList;
	}
	//returns the node at the specified index. 
	public E get(int index) {
		return node(index).nodeValue;
	}
}
