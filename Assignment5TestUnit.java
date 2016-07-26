package pf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment5TestUnit {

	@Test
	public void test() {

		int input1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int input2[] = { 7, 6, 5, 4, 3, 2, 1 };
		int input3[] = { 1, 2, 1, 3, 1, 4, 1 };

		assertEquals(1, Assignment5.issort(input1));
		assertEquals(2, Assignment5.issort(input2));
		assertEquals(0, Assignment5.issort(input3));
	}

}
