package session7.assignment;

public class BinarySearch {

	/**
	 * Following function returns the result of searching of item in the binary
	 * search tree.
	 * @param arr(int []) denotes the array.
	 * @param low(int) denotes the lowest index of array.
	 * @param high(int) denotes the highest index of array.
	 * @param target(int) denotes the item to search.
	 * @return (int) the position of item.
	 */
	public int binarySearchResult(int arr[], int low, int high, int target) {

		if (arr.length == 0) {
			System.out.println("Empty Array");
			return -1;
		} else {
			// to find median position of array
			int mid = (low + high) / 2;
			// target not found condition
			if (low > high) {

				return -1;
			} else if (target < arr[mid]) { // when target is lesser than a[mid]
				return binarySearchResult(arr, low, mid - 1, target);
			} else if (target > arr[mid]) { // when target is greater than a[mid]
				return binarySearchResult(arr, mid + 1, high, target);
			} else { // target found condition
				int leftOccurance = 0;
				leftOccurance = binarySearchResult(arr, low, mid - 1, target); // found
																				// left
																				// occurrence
																				// using
																				// recursion
				if (leftOccurance == -1) {
					return mid;
				} else {
					System.out.println("mid" + mid + "leftOccurance"
							+ leftOccurance);
					return leftOccurance;
				}
			}
		}
	} 
}