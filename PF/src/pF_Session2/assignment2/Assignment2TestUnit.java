package pF_Session2.assignment2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Assignment2TestUnit {

			final int ROWS=5;
			
			Assignment2 assignment2=new Assignment2();
			
			//Function to test spaces
			@Test
			public void testspaces() {
				assertEquals("    ",assignment2.spaces(5,ROWS));   //for 5th row
				assertEquals("   ",assignment2.spaces(4,ROWS));	   //for 4th row
				assertEquals("  ",assignment2.spaces(3,ROWS));	   //for 3rd row
			}
			
			//Function to test numbers
			@Test
			public void testnumbers() {
				assertEquals("12345",assignment2.numbers(1,ROWS)); //for 1st row
				assertEquals("1234",assignment2.numbers(2,ROWS));  //for 2nd row
				assertEquals("123",assignment2.numbers(3,ROWS));   //for 3rd row
			}
			
			//Function to test pyramid
			@Test
			public void testpyramid() {
				String expected[] = {"12345", " 1234", "  123","   12","    1"};
				String actual[] = assignment2.printpyramid(ROWS);
				
				assertArrayEquals(expected,actual);
    }
}


