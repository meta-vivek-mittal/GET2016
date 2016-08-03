package session4.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	List<Integer> heapArray;

	/**
	 * Constructor
	 */
	Heap() {
		heapArray = new ArrayList<Integer>();
	}

	/**
	 * Following function adds the priority element to the list
	 * 
	 * @param priority
	 *            (int) denotes the priority to be added in the list.
	 */
	public void insertInHeap(int priority) {
		heapArray.add(priority);
		// calling buildHeap after insertion of new priority
		buildHeap();
	}

	/**
	 * Following function buildHeap builds a heap.
	 */
	public void buildHeap() {
		System.out.println("Called Buildheap");
		for (int index = (heapArray.size() / 2) - 1; index >= 0; index--) {
			maxHeapify(index);
		}
	}

	/**
	 * Following function maxHeapify helps in getting max heap.
	 * 
	 * @param index
	 *            (int) denotes the index to be checked for max heap.
	 */
	public void maxHeapify(int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int largest = index;
		if (left < heapArray.size()
				&& heapArray.get(left) > heapArray.get(largest)) {
			largest = left;
		} else {
			largest = index;
		}
		if (right < heapArray.size()
				&& heapArray.get(right) > heapArray.get(largest)) {
			largest = right;
		}
		if (largest != index) {
			Integer temp = heapArray.get(largest);
			heapArray.set(largest, heapArray.get(index));
			heapArray.set(index, temp);
			maxHeapify(largest);
		}
	}

	/**
	 * Following function executes the function associated with the executing
	 * priority.
	 */
	public void serve() {
		if (isEmpty()) {
			System.out.println("No more jobs to serve");
			return;
		}
		System.out.println("Job " + heapArray.get(0) + " printed.");
		delete();
	}

	/**
	 * Following function remove the max node from max heap and calls buildHeap
	 * to make it again max heap.
	 * 
	 * @return return true/false whether element deletion is possible or not.
	 */
	public boolean delete() {
		System.out.println("delete");
		if (isEmpty()) {
			return false;
		} else {
			heapArray.set(0, heapArray.get(heapArray.size() - 1));
			System.out.println("value set at 0 "
					+ heapArray.get(heapArray.size() - 1));
			heapArray.remove(heapArray.size() - 1);
			buildHeap();
			return true;
		}
	}

	/**
	 * Following function checks for the emptiness of list or heap.
	 * 
	 * @return return true/false whether empty or not.
	 */
	public boolean isEmpty() {
		if (heapArray.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
