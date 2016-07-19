package pf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment6TestUnit {

	Assignment6 arraymerge = new Assignment6();

	@Test
	public void test() {
		int array1[] = { 1, 2, 4, 6, 7, 9, 11 };
		int array2[] = { 2, 4, 5, 7, 8, 9, 10, 13 };
		// assertArrayValue(true,arraymerge(array1,array2));
		assertTrue(arraymerge.check(array1, array2));
	}
}
