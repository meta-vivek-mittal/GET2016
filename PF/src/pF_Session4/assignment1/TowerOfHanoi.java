package pF_Session4.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TowerOfHanoi {

	static List<String> order = new ArrayList<String>();

	public List<String> tower(int n, char beg, char aux, char end) {

		if (n == 1)
			order.add("Disk 1 is transferred from " + beg + " to " + end);
		else {
			tower(n - 1, beg, end, aux);
			order.add("Disk " + n + " is transferred from " + beg + " to " + end);
			tower(n - 1, aux, beg, end);
		}
		return order;
	}

	static int n;

	public static void main(String args[]) {
		TowerOfHanoi hanoi = new TowerOfHanoi();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Disks : ");
		n = sc.nextInt();
		order = hanoi.tower(n, 'A', 'B', 'C');

		for (int i = 0; i < order.size(); i++)
			System.out.println(order.get(i));
		sc.close();
	}
}
