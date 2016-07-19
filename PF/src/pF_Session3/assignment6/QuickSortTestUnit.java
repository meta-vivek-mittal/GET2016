package pF_Session3.assignment6;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTestUnit {
	QuickSort quick = new QuickSort();

	@Test
	public void test() {
		int array1[] = {2,5,8,9,10,77,55};
		int array2[] = {};
		assertArrayEquals(array1, quick.quicksort(array1,0,6));
		assertArrayEquals(array2, quick.quicksort(array2,0,-1));
	}
}
