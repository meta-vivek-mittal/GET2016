package session4.assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NqueensTestUnit {

	int position[];			// store position of queen for each row
	int output[][][];		// output store all the case that may be possible
	Nqueens nQueen;		
	
	@Before
	public void setUp() throws Exception {
		// fix the size of array
		position = new int[5];
		output = new int[5][5][5];
		nQueen = new Nqueens();
	}

	@Test
	public void testQueen() {
		output = nQueen.queen(1, 4, position, output);
		
		int[] test1 = output[0][1];
		int[] test2 = output[0][2];
		int[] test3 = output[0][3];
		int[] test4 = output[0][4];
		
		// compare of the possible solution 
		assertArrayEquals(new int[] { 0, 0, 1, 0, 0 }, test1);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 1 }, test2);
		assertArrayEquals(new int[] { 0, 1, 0, 0, 0 }, test3);
		assertArrayEquals(new int[] { 0, 0, 0, 1, 0 }, test4);
	}

}