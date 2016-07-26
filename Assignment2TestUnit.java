package pf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2TestUnit {

	@Test
	public void test() {

		int input[] = { 1, 5, 2, 3, 4, 2, 1, 4, 2, 3, 1 };
		int output[] = { 1, 5, 2, 3, 4 };

		assertArrayEquals(output, Assignment2.removeDuplicate(input));

	}

}
