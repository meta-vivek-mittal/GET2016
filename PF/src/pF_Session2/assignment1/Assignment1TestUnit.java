package pF_Session2.assignment1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment1TestUnit {

	final int SIZE=5;
	Assignment1 assignment1=new Assignment1();
	
	//Function to test spaces
	@Test
	public void testspaces() {
		assertEquals("",assignment1.spaces(5,SIZE));       //for 5th row
		assertEquals(" ",assignment1.spaces(4,SIZE));	   //for 4th row
		assertEquals("  ",assignment1.spaces(3,SIZE));	   //for 3rd row
	}
	
	//Function to test numbers
	@Test
	public void testnumbers() {
		assertEquals("1",assignment1.numbers(1,SIZE)); //for 1st row
		assertEquals("121",assignment1.numbers(2,SIZE));  //for 2nd row
		assertEquals("12321",assignment1.numbers(3,SIZE));   //for 3rd row
	}
	
	//Function to test Pyramid Output
	@Test
	public void testpyramid() {
		String expected[] = {"    1", "   121", "  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		String actual[] = assignment1.printpyramid(SIZE);
		
		assertArrayEquals(expected,actual);

	}
}
