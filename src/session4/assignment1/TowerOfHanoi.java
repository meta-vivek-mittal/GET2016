package session4.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowerOfHanoi {

	// stores the list of steps required to transfer no. of disks from one bar
	// to another
	static List<String> order = new ArrayList<String>();

	/**
	 * 
	 * @param n
	 *            (int) denotes the no. disks
	 * @param beg
	 *            (String) denotes the source bar
	 * @param aux
	 *            (String) denotes the auxiliary bar
	 * @param end
	 *            (String) denotes the destination bar
	 * @return order(List<String>) returns the list of steps to transfer disks
	 *         from source to destination.
	 */
	public List<String> tower(int n, String beg, String aux, String end) {

		if (n == 1)
			order.add("Disk 1 is transferred from " + beg + " to " + end);
		else {
			tower(n - 1, beg, end, aux); // recursive call to transfer (n-1)
											// disks from source to auxiliary
			order.add("Disk " + n + " is transferred from " + beg + " to "
					+ end);
			tower(n - 1, aux, beg, end); // recursive call to transfer (n-1)
											// disks from auxiliary to
											// destination.
		}
		return order;
	}

	static int n;

	public static void main(String args[]) {
		TowerOfHanoi hanoi = new TowerOfHanoi();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Disks : ");
		n = sc.nextInt();
		order = hanoi.tower(n, "A", "B", "C");

		for (int i = 0; i < order.size(); i++)
			System.out.println(order.get(i));
		sc.close();
	}
}
