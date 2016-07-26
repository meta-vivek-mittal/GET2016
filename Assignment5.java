package pf1;

import java.util.Scanner;

public class Assignment5 {

	public static int issort(int input[]) {

		int increasing = 0;
		int decreasing = 0;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] < input[i + 1])
				increasing++;
			else
				decreasing++;
		}

		if (increasing == input.length - 1)
			return 1;
		if (decreasing == input.length - 1)
			return 2;
		return 0;
	}

	/*
	 * public static void main(String args[]) {
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("How many Numbers : "); int count = sc.nextInt(); int
	 * input[] = new int[count]; for (int j = 0; j < count; j++) {
	 * 
	 * input[j] = sc.nextInt(); } System.out.println(input.length); int val =
	 * issort(input);
	 * 
	 * System.out.println(val); sc.close(); }
	 */
}
