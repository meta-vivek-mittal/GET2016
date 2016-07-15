package pf1;

import java.util.Scanner;

public class Assignment2 {
	public static int[] removeDuplicate(int input[]) {
		boolean found;
		String output = "";
		for (int i = 0; i < input.length; i++) {
			found = false;
			for (int j = 0; j < i; j++) {
				if (input[i] == input[j]) {
					found = true;
					break;
				}
			}

			if (found == true) {
				continue;
			}
			output += "" + input[i];
		}
		return getIntArray(output);
	}

	/*
	 * public static void main(String args[]) { Scanner sc=new
	 * Scanner(System.in); System.out.println("How many Numbers : "); int
	 * i=sc.nextInt(); int input[]=new int[i]; for(int j=0;j<i;j++) {
	 * 
	 * input[j]=sc.nextInt(); } int[] output;
	 * 
	 * output = removeDuplicate(input);
	 * 
	 * for (int x : output) { System.out.println(x); } }
	 */

	public static int[] getIntArray(String input) {
		int inputLength = input.length();
		int temp[] = new int[inputLength];
		for (int loopVariable = 0; loopVariable < inputLength; loopVariable++) {
			temp[loopVariable] = Integer.parseInt(input.charAt(loopVariable)
					+ "");
		}

		return temp;

	}
}
