package session4.assignment2;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	/**
	 * @param str
	 *            (String) is a string which is to be permuted
	 * @return result(Set<String>) returns the set of permutations of str
	 */

	public static Set<String> permute(String str) {
		Set<String> result = new HashSet<String>();
		if (str == null) { // checking for null
			return null;
		} else if (str.length() == 0) { // checking for empty String
			result.add("");
			return result;
		}

		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> combinations = permute(rem);
		for (String newString : combinations) {
			for (int i = 0; i <= newString.length(); i++) {
				result.add(charAdd(newString, firstChar, i));
			}
		}
		return result;
	}

	public static String charAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}

	public static void main(String[] args) {
		String s = "ABCD";

		System.out.println("\nPermutations of String " + s + " : \n"
				+ permute(s));
	}

}
