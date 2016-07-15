package pf1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment4TestUnit {

	public static boolean isEqualArray(int[][] expected, int[][] actual) {
		boolean flag = true;
		for (int i = 0; i < actual.length; i++) {
			for (int j = 0; j < actual.length; j++) {
				if (expected[i][j] != actual[i][j]) {
					flag = false;
					break;
				}
			}
		}
		if (!flag)
			return false;
		return true;
	}

	@Test
	public void test() {

		int arrival_time[] = { 1, 5, 9, 25 };
		int job_size[] = { 12, 7, 2, 5 };
		int expected[][] = { { 1, 1, 0, 1, 12 }, { 2, 5, 8, 13, 19 },
				{ 3, 9, 11, 20, 21 }, { 4, 25, 0, 25, 29 } };
		int FCFSOut[][] = new Assignment4().FCFS(arrival_time, job_size);

		assertTrue(isEqualArray(expected, FCFSOut));

	}

}
