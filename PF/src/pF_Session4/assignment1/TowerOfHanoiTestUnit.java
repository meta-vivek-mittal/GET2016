package pF_Session4.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class TowerOfHanoiTestUnit {

	private static TowerOfHanoi hanoi = new TowerOfHanoi();
	private List<String> expected;
	private List<String> value;
	private int actual;

	@Parameters
	public static Collection<Object[]> data(){
		
		return Arrays.asList(new Object[][] {{new ArrayList<String>(Arrays.asList("Disk 1 is transferred from A to C","Disk 2 is transferred from A to B","Disk 1 is transferred from C to B")),2},{new ArrayList<String>(Arrays.asList("Disk 3 is transferred from A to C","Disk 1 is transferred from B to A","Disk 2 is transferred from B to C","Disk 1 is transferred from A to C")),3}});
	
	}
	public TowerOfHanoiTestUnit(ArrayList<String> expected ,int input){
			this.expected = expected;
			this.actual = input;
		}

	@Test
	public void test() {
		value = hanoi.tower(actual,'A','B','C');
		assertEquals(expected, value);
		value.clear();
	}
			
}

