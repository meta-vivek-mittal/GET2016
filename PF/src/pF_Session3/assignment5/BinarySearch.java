package pF_Session3.assignment5;

import java.util.Scanner;

public class BinarySearch {
	/**
	 * Function binarySearch() searches the item in an arrray given to us.
	 * array[](int) denotes the array. item(int) denotes the number to search.
	 * initial(int) denotes the position of first index in an array.
	 * lastpos(int) denotes the position of last index in an array. return (int)
	 * returns the position of searched number if found otherwise returns -1.
	 */
	public int binarySearch(int array[], int item, int initialpos, int lastpos) {
		if (initialpos > lastpos)
			return -1;
		int mid = (initialpos + lastpos) / 2;
		if (array[mid] == item)
			return mid + 1;
		else if (array[mid] < item)
			return binarySearch(array, item, mid + 1, lastpos);
		else
			return binarySearch(array, item, initialpos, mid - 1);
	}

	public static void main(String args[]) {
		BinarySearch search = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers : ");
		int i = sc.nextInt();
		int array[] = new int[i];
		for (int j = 0; j < i; j++)
			array[j] = sc.nextInt();
		System.out.println("Enter any number to search : ");
		int item = sc.nextInt();
		int found = search.binarySearch(array, item, 0, array.length - 1);
		System.out.println(found);
		sc.close();
	}
}
