package pF_Session3.assignment3;

import java.util.Scanner;

public class Largest {
	/**
	 * Function largest() finds the largest digit in the number which is passed
	 * as argument number(int) denotes the number. return (int) returns a
	 * maximum digit
	 */
	public int largest(int number) {
		if (number / 10 == 0)
			return number;
		int unitdigit = number % 10;
		int tensdigit = (number / 10) % 10;
		if (unitdigit <= tensdigit)
			return largest(number / 10);
		else
			return largest((number / 100) * 10 + unitdigit);
	}

	public static void main(String args[]) {
		Largest large = new Largest();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number");
		int i = sc.nextInt();
		int k = large.largest(i);
		System.out.println(k);
		sc.close();
	}

}
