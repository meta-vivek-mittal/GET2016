package pf2;

import java.util.Scanner;

public class Assignment1 {

	/**
	 * Following function spaces(int row,int n) print spaces
	 * 
	 * @param row(int) denotes the row no. of pattern
	 * @param n (int) denotes the size of pattern
	 * @return s1(String) of spaces
	 */
	public String spaces(int row, int n) {
		String s1 = "";
		int i = 1;
		int k = n - row;
		while (i <= k) {
			s1 += " "; // concating required no. of spaces
			i++;
		}

		return s1;
	}

	/**
	 * Following function numbers(int row,int n) print numbers
	 * @param row (int) denotes the row no.
	 * @param n(int) denotes the size of pattern
	 * @return s1(String) returns a string
	 */
	public String numbers(int row, int n) {
		String s1 = "";
		int i = 1;
		for (i = 1; i <= row; i++) {
			s1 += i;
		}
		i -= 2;
		while (i > 0) {
			s1 += i;
			i--;
		}

		return s1;
	}

	/**
	 * following Function returns a complete pattern
	 * @param n(int) denotes the size of pattern
	 * @return returns String
	 */
	public String[] printpyramid(int n) {
		String[] pyr = new String[2 * n - 1];
		// prints the upper half
		for (int i = 1; i <= n; i++) {
			pyr[i - 1] = spaces(i, n);
			pyr[i - 1] = pyr[i - 1] + numbers(i, n);
		}

		// prints the lower half
		int k = 1;
		for (int i = n + 1; i <= 2 * n - 1; i++, k++) {
			pyr[i - 1] = spaces(i, n + 2 * k);
			pyr[i - 1] = pyr[i - 1] + numbers(2 * n - i, n);
		}
		return pyr;
	}

	public static void main(String args[]) {
		Assignment1 str = new Assignment1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of rows");
		int n = sc.nextInt();
		for (String str1 : str.printpyramid(n)) { // for each loop that prints
													// rows of required pattern
			System.out.println(str1);
		}
		sc.close();
	}

}
