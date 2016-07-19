package pF_Session3.assignment1;
import java.util.Scanner;
public class Remainder {
		
	/**
	 * Function remainder() finds the remainder x(int) denotes the first no.
	 * y(int) denotes the second no. return (int) returns an integer which is
	 * the remainder
	 */
	public int remainder(int x, int y) {
		if (y == 0)
			return -1;
		if (x == y) 		//if both number are equal then remainder will be zero
			return 0;
		else if (x < y)
			return x;
		else
			return remainder(x - y, y);
	}

	public static void main(String args[]) {
		Remainder rem = new Remainder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 2 numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = rem.remainder(i, j);
		System.out.println(k);
		sc.close();
	}
}
