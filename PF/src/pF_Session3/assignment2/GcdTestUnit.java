package pF_Session3.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GcdTestUnit {
	Gcd hcf = new Gcd(); // Object Creation


	@Test
	public void test() {
		assertEquals(1, hcf.gcd(2, 1)); // check for gcd of (2,1)
		assertEquals(6, hcf.gcd(12, 18)); // check for gcd of (12,18)
		assertEquals(1, hcf.gcd(100, 3)); // check for gcd of (100,3)
	}
}
