package pF_Session3.assignment3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LargestTestUnit {
	Largest digit = new Largest();

	@Test
	public void test() {
		assertEquals(2, digit.largest(2)); // check for number 2
		assertEquals(9, digit.largest(1257369)); // check for number 1257369
		assertEquals(4, digit.largest(444)); // check for number 444
	}

}
