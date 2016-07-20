package session1.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTestUnit {

	Matrix matrix = new Matrix(3, 3);

	@SuppressWarnings("deprecation")
	@Test
	public void test() {

		int array2D1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int array2D2[][] = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int array2D3[][] = { { 14, 32, 50 }, { 32, 77, 122 }, { 50, 122, 194 } };
		assertEquals(array2D2, matrix.transpose(array2D1)); // check for
															// transpose matrix
		assertEquals(array2D3,
				matrix.multiplication(array2D1, array2D2, 3, 3, 3, 3));// check
																		// for
																		// multiplication
																		// of
																		// matrix

	}

}
