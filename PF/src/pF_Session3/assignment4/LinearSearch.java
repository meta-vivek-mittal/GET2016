package pF_Session3.assignment4;

import java.util.Scanner;

public class LinearSearch {
	/**
	 * Function linearSearch() searches the item in an arrray given to us.
	 * array[](int) denotes the array. item(int) denotes the number to search.
	 * lastpos(int) denotes the position of last index in an array. return (int)
	 * returns the position of searched number if found otherwise returns -1.
	 */
	public int linearSearch(int array[], int item, int lastpos) {
		if (lastpos == -1)
			return -1;
		if (array[lastpos] == item) // checking the last element with item
			return (lastpos + 1);
		else
			return linearSearch(array, item, lastpos - 1); // recursive call
	}

	public static void main(String args[]) {
		LinearSearch search = new LinearSearch();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many numbers : ");
		int i = sc.nextInt();
		int array[] = new int[i];
		for (int j = 0; j < i; j++)
			array[j] = sc.nextInt();
		System.out.println("Enter any number to search : ");
		int item = sc.nextInt();
		int found = search.linearSearch(array, item, array.length - 1);
		System.out.println(found);
		sc.close();
	}

}
