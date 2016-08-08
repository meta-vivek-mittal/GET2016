package session7.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeftOccuranceTest {

	@Test
	public void leftOccuranceTest() {
		int array[] = new int[]{1,1,2,2,3,3};
		BinarySearch obj = new BinarySearch();
		int actual = obj.binarySearchResult(array, 0, array.length-1, 2);
		int expected = 2;
		
		assertEquals(expected, actual);
	}

}