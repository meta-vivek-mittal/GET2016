package pF_Session3.assignment5;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTestUnit {
	BinarySearch search = new BinarySearch(); // object creation of class

	@Test
	public void test() {
		int array1[] = { 2, 5, 8, 9, 10, 77, 55 };
		assertEquals(-1, search.binarySearch(array1, 88, 0, 6)); // check for
																	// number 88
		assertEquals(6, search.binarySearch(array1, 77, 0, 6)); // check for
																// number
																// 77
	}

}
