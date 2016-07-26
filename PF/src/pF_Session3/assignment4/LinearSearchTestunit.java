package pF_Session3.assignment4;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearSearchTestunit {
	LinearSearch search = new LinearSearch(); // object creation of class

	@Test
	public void test() {
		int array1[] = { 2, 5, 8, 9, 10, 77, 55 };
		assertEquals(-1, search.linearSearch(array1, 88, 6)); // search for
																// number 88 in
																// the array1
		assertEquals(6, search.linearSearch(array1, 77, 6)); // search for
																// number 77 in
																// the array1
	}

}
