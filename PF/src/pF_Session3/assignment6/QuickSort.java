package pF_Session3.assignment6;

import java.util.Scanner;

public class QuickSort {

	/**
	 * Function partition() arr[](int) p(int) denotes the initial position.
	 * r(int) denotes the last position return (int) returns a maximum digit
	 */
	public int partition(int arr[], int p, int r) {
		int i = p - 1, j = p, item = arr[r];
		while (j < r) {
			if (arr[j] < item) {
				i++;
				int t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}
			j++;
		}
		int t = arr[i + 1];
		arr[i + 1] = arr[r];
		arr[r] = t;

		return i + 1;
	}

	public int[] quicksort(int arr[], int p, int r) {

		int pos;
		if (p < r) {
			pos = partition(arr, p, r);
			quicksort(arr, p, pos - 1);
			quicksort(arr, pos + 1, r);
		}

		return arr;
	}

	public static void main(String args[]) {
		QuickSort quick = new QuickSort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of Elements : ");
		int i = sc.nextInt();
		int arr[] = new int[i];
		System.out.println("Enter all " + i + " numbers : ");
		for (int j = 0; j < i; j++) {
			arr[j] = sc.nextInt();
		}
		int a[] = quick.quicksort(arr, 0, i - 1);
		for (int x : a)
			System.out.print(x + "\t");
		sc.close();
	}
}
