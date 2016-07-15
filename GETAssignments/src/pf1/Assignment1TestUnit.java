package pf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1TestUnit {

	@Test
	public void test() {

		assertEquals(14, Assignment1.convertBinaryToOctal(1100));
		assertEquals(65, Assignment1.convertBinaryToOctal(110101));
		assertEquals(11, Assignment1.convertBinaryToOctal(1001));
		assertEquals(23, Assignment1.convertBinaryToOctal(10011));

	}
}
