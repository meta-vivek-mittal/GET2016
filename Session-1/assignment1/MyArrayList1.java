package session1.assignment1;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;

public class MyArrayList1<E> implements Comparator<E> {

	int size;
	Object arrayList[] = new Object[10];
	Object[] arrayListTwo;

	/**
	 * 
	 * @param item(E) denotes the item to be added in the list
	 * @return (boolean) returns true/false whether item added or not
	 */
	public boolean add(E item) {
		int index = 0;
		while (arrayList[index] != null) {
			index++;
		}
		arrayList[index] = item;
		size++;
		if (size == arrayList.length - 1) {
			int n = arrayList.length * (3 / 2) + 1;
			arrayListTwo = new Object[n];
			arrayListTwo = arrayList;
			arrayList = new Object[n];
			arrayList = arrayListTwo;
		}
		return true;
	}
	/**
	 * 
	 * @param item(E) denotes the item to be added in the list at some position 
	 * @param position(int) denotes the position where the item is to be added
	 */
	public void addAtPosition(E item, int position) {
		if (position > arrayList.length) {
			System.out.println("Array Index Out Of Bound ! ");
			return;
		}
		Object temp = arrayList[position - 1];
		arrayList[position - 1] = item;
		size++;
		//checking for list size capacity, if full then increasing it by some factor
		if (size == arrayList.length - 1) {
			int n = arrayList.length * (3 / 2) + 1;
			arrayListTwo = new Object[n];
			arrayListTwo = arrayList;
			arrayList = new Object[n];
			arrayList = arrayListTwo;
		}
		for (int i = size(); i >= position - 1; i--) {
			arrayList[i + 1] = arrayList[i];
		}
		arrayList[position] = temp;
	}
	/**
	 * 
	 * @param item(E) shows the item to search in the list
	 * @param position(int) denotes the position from where we have to start searching for item
	 * @return (int) returns an integer which actually is the position of item.
	 */
	public int retrieveFrom(E item, int position) {
		if (position > arrayList.length) {
			System.out.println("Array Index Out Of Bound !");
			return -1;
		}
		boolean flag = false;
		while (position - 1 < arrayList.length) {
			if (arrayList[position - 1] == item) {
				flag = true;
				break;
			}
			position++;
		}
		if (flag == true)
			return (position);
		return -1;
	}
	/**
	 * @param item(E) shows the item to search in the list starting from 0th index
	 * @return (int) returns the index of searching item if found otherwise returns -1.
	 */
	public int retrieveFromStart(E item) {
		if (arrayList.length == 0) {
			System.out.println("Empty Array ! ");
			return -1;
		}
		boolean flag = false;
		int index = 0;
		while (index < arrayList.length) {
			if (arrayList[index] == item) {
				flag = true;
				break;
			}
			index++;
		}
		if (flag == true)
			return (index + 1);
		return -1;
	}
	/**
	 * 
	 * @param position(int) denotes the position where we are require to delete the item and do shifting as required.
	 */
	public void removeFromPosition(int position) {
		if (position > arrayList.length) {
			System.out.println("Error : Array Index Out Of Bound !");
			return;
		}
		int index;
		//shifting
		for (index = position - 1; index < arrayList.length - 1; index++) {
			arrayList[index] = arrayList[index + 1];
		}
		arrayList[index] = null;
		size--;
	}
	/**
	 * 
	 * @param item(E) denotes the item to be removed from the list.
	 */
	public void removeItem(E item) {
		if (arrayList.length == 0) {
			System.out.println("Empty List! Cant Remove");
			return;
		}
		boolean flag = false;
		int index = 0;
		while (index < arrayList.length) {
			if (arrayList[index] == item) {
				flag = true;
				break;
			}
			index++;
		}
		if (flag == true) {
			for (; index < arrayList.length - 1; index++) {
				arrayList[index] = arrayList[index + 1];
			}
			size--;
		}
		System.out.println("Element does not exist");
	}
	//following function clears the whole list
	public void clear() {
		if (arrayList.length == 0) {
			System.out.println("Empty List! Cant Remove");
			return;
		}
		int index = 0;
		while (index < arrayList.length)
			arrayList[index] = null;
	}
	//Following Function reverse the whole List.
	public void reverseArrayList() {
		if (arrayList.length == 0) {
			System.out.println("Empty List! Cant Remove");
			return;
		}
		int lowerIndex = 0;
		int highIndex = size();
		System.out.println(highIndex);
		while (lowerIndex < highIndex) {
			Object t = arrayList[lowerIndex];
			arrayList[lowerIndex] = arrayList[highIndex];
			arrayList[highIndex] = t;
			lowerIndex++;
			highIndex++;
		}
	}
	
	//returns the size of the list.
	public int size() {
		return size;
	}
	//Following Function returns the item at the specified position index. 
	public E get(int index) {
		if (arrayList[0] == null) {
			return null;
		}
		if (index > arrayList.length - 1) {
			System.out.println("Array Index Out Of Bound Exception");
			return null;
		}
		return (E) arrayList[index];

	}
	//function for sorting
	public void sort() {
		mergeSort(0, size - 1);
	}

	//Implementation of Merge Sort to Sort the items of the List.
	private void mergeSort(int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergeSort(low, middle);
			mergeSort(middle + 1, high);
			merge(low, middle, high);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void merge(int low, int middle, int high) {

		Object[] helper = new Object[size];
		for (int i = low; i <= high; i++) {
			helper[i] = arrayList[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (((Comparable) helper[i]).compareTo(helper[j]) < 0) {
				arrayList[k] = helper[i];
				i++;
			} else {
				arrayList[k] = helper[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			arrayList[k] = helper[i];
			k++;
			i++;
		}
	}
	
	private Object[] copy(int newSize) {
		Object[] temp = new Object[newSize];
		for (int i = 0; i < size; i++) {
			temp[i] = arrayList[i];
		}
		return temp;
	}
	//Function to add all the items to the list
	public void addAll(MyArrayList1<E> list) {
		arrayList = copy(size + list.size());
		for (int i = 0; i < list.size(); i++) {
			add(list.get(i));
		}
	}
}
