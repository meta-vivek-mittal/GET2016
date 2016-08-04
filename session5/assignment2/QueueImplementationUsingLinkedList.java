package session5.assignment2;

/**
 * Implemented Queue using Linked list because :
 * 1.) It is dynamic in nature.
 * 2.) Linked List provides all fundamental functionality of queue in easy way. 
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * In this class we are using LinkedList to perform queue operations because add
 * and remove methods of LinkedList fulfills the queue properties(FIFO)
 */
public class QueueImplementationUsingLinkedList {
	public List<Integer> head;

	QueueImplementationUsingLinkedList() {
		head = new LinkedList<Integer>();
	}

	/**
	 * Following function adds the element in the queue
	 * @param value(int) denotes the value to be added in the list.
	 */
	public void enqueue(int value) {
		head.add(value);
	}

	/**
	 * Following function deletes element from the front end of the queue.
	 * @return (int) denotes the element that has been removed from the queue.
	 */
	public int dequeue() {
		return head.remove(0);
	}

	/**
	 * Following function returns the size of queue.
	 * @return (int) denotes the size of queue
	 */
	public int size() {
		return head.size();
	}

	/**
	 * Following function clears the queue.
	 * @return true/false whether cleared or not.
	 */
	public boolean clear() {
		head.clear();
		return true;
	}

	/**
	 * Following function returns the front element of the queue.
	 * @return (int) denotes the front element.
	 */
	public int getFront() {
		return head.get(0);
	}

	/**
	 * Using Iterator to print elements of queue
	 */
	public String toString() {
		Iterator<Integer> iterator = head.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return "";
	}
}
