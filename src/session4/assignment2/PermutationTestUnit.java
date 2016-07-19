package session4.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class PermutationTestUnit {

	Permutation StrPermutations;

	Set<String> outputList1;

	@Before
	public void setUp() throws Exception {
		StrPermutations = new Permutation();
		outputList1 = new HashSet<String>();
		outputList1.add("ABC");
		outputList1.add("ACB");
		outputList1.add("BAC");
		outputList1.add("BCA");
		outputList1.add("CBA");
		outputList1.add("CAB");
	}

	@Test
	public void testPermutation() {
		assertEquals(outputList1, Permutation.permute("ABC"));
	}

}
