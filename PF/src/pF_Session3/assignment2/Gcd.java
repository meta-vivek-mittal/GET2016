package pF_Session3.assignment2;
import java.util.Scanner;
public class Gcd {
	/**
	 * Function gcd() finds the greatest common divisor of 2 numbers passed as
	 * arguments. x(int) denotes the first no. y(int) denotes the second no.
	 * return (int) returns an integer which is actually the gcd
	 */
	public int gcd(int x, int y) {
		if (y == 0)
			return x;
		if (x > y)
			return gcd(y, x % y);
		else
			return gcd(y, x);
	}

	public static void main(String args[]) {
		Gcd hcf = new Gcd();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 2 numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = hcf.gcd(i, j);
		System.out.println(k);
		sc.close();
	}


}
