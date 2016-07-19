package session4.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TowerOfHanoiTestUnit {

	TowerOfHanoi towerOfHanoiObject;
	List<String> steps1;
	List<String> steps2;

	@Before
	public void setUp() throws Exception {
		towerOfHanoiObject = new TowerOfHanoi();
		steps1 = new ArrayList<String>();
		steps2 = new ArrayList<String>();
		steps1.add("Disk 1 is transferred from A to C");
		steps2.add("Disk 1 is transferred from A to B");
		steps2.add("Disk 2 is transferred from A to C");
		steps2.add("Disk 1 is transferred from B to C");
	}

	@Test
	public void testTowerOfHanoi() {
		assertEquals(steps1, towerOfHanoiObject.tower(1, "A", "B", "C")); //checking for 1 disk
		TowerOfHanoi.order.clear();										  //clears the set obtained from 1st check
		assertEquals(steps2, towerOfHanoiObject.tower(2, "A", "B", "C")); //checking for 2 disks
	}

}
