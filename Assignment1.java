package pf1;

import java.util.Scanner;

public class Assignment1 {
	public static int convertBinaryToOctal(int binary) {
		int digit, octal = 0, decimal = 0, value = 1;
		while (binary != 0) {
			digit = binary % 10;
			decimal = decimal + digit * value;
			value = value * 2;
			binary = binary / 10;
		}

		int i = 1;
		while (decimal != 0) {

			digit = decimal % 8;
			decimal = decimal / 8;
			octal = octal + (digit * i);

			i = i * 10;
		}
		return octal;
	}

	/*
	 * public static void main(String args[]) { Scanner sc=new
	 * Scanner(System.in); System.out.println("Enter the binary number"); int
	 * binary= sc.nextInt(); int octal=convertBinaryToOctal(binary);
	 * System.out.println(octal);
	 * 
	 * 
	 * }
	 */
}
