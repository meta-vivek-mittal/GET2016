package pF_Session3.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemainderUnitTest {
	Remainder rem = new Remainder(); // object creation

	@Test
	public void test() {
		assertEquals(0, rem.remainder(2, 1)); // check for remainder of (2,1)
		assertEquals(-1, rem.remainder(2, 0)); // check for remainder of (2,0)
		assertEquals(1, rem.remainder(100, 3)); // check for remainder of
												// (100,3)
	}

}
