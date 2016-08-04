package session5.assignment1;

import java.util.LinkedList;
import java.util.List;

public class Concordance {

	public static void main(String args[]) {
		String concatedString = "";
		for (int i = 0; i < args.length; i++) {
			concatedString += args[i];
		}

		// converting whole concated string to lowercase.
		concatedString = concatedString.toLowerCase();
		System.out.println(concatedString);

		// creating list array of 200 Integer type.
		@SuppressWarnings("unchecked")
		List<Integer>[] list = new List[200];

		// creating linked list on each index of list.
		for (int i = 0; i < 200; i++) {
			list[i] = new LinkedList<Integer>();
		}

		/**
		 * following loop reads character one by one and simultaneously stores
		 * the index in the linked list at the position given by the unicode of
		 * readed character in the list.
		 */
		for (int i = 0; i < concatedString.length(); i++) {
			int ch = concatedString.charAt(i);
			list[ch].add(i);
		}

		System.out.println("\t Characters\t Positions--------->");
		System.out.println("\t |");
		System.out.println("\t |");
		System.out.println("\t\\/");
		/**
		 * Following loop prints the character and its position of occurrences.
		 */
		for (int i = 0; i < 200; i++) {
			if (list[i].size() > 0) {
				char ch = (char) i;
				System.out.print("\t   " + ch + "\t");
				for (int x : list[i]) {
					System.out.print("\t" + x);
				}
				System.out.println();
			}
		}
	}
}
