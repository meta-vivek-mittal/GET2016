package session4.assignment2;

import java.util.Scanner;

public class RoomAllotment {

	// Assuming No. of guests are not greater than 7
	static int NUMBER_OF_ROOMS = 7;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Room Booking System : ");
		System.out.println("Maximum "+NUMBER_OF_ROOMS+" are available :");
		System.out.println("Enter number of guests : ");
		int n = sc.nextInt();
		int array[] = new int[n];
		int hashValue;
		int rooms[] = new int[NUMBER_OF_ROOMS];

		// input of ages of guests
		for (int i = 0; i < n; i++) {
			System.out.println("Enter age of guest " + (i + 1));
			array[i] = sc.nextInt();
		}

		// Sorting of all the guests on the basis of their age.
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		/**
		 * In the following logic , a hashValue is calculated as shown, then,
		 * check for the availability of room at the hasvalue index, if not
		 * available, then proceed to next room to check availability.
		 */
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			flag = false;
			hashValue = array[i] % NUMBER_OF_ROOMS;
			if (rooms[hashValue] == 0) {
				rooms[hashValue] = array[i];
				continue;
			}
			int temp = hashValue;
			while (temp < NUMBER_OF_ROOMS) {
				if (rooms[temp] == 0) {
					flag = true;
					break;
				}
				temp++;
			}
			if (flag == true) {
				rooms[temp] = array[i];
			} else {
				temp = 0;
				while (temp < hashValue) {
					if (rooms[temp] == 0) {
						flag = true;
						rooms[temp] = array[i];
						break;
					}
					temp++;
				}
			}
		}

		System.out.println("Rooms Alloted according to the age of Guests : \n");

		for (int i = 0; i < NUMBER_OF_ROOMS; i++) {
			System.out.println("\tRoom " + (i + 1) + " : " + rooms[i]
					+ " years old");
		}
		
		sc.close();
	}
}
