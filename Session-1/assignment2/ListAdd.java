package session1.assignment2;

import java.util.Scanner;

import session1.assignment1.MyArrayList1;

public class ListAdd {

	MyArrayList1<String> list1 = new MyArrayList1<String>();
	MyArrayList1<String> list2 = new MyArrayList1<String>();
	/**
	 * Following Function input() takes the input of list1 and list2 and add them together.
	 */
	public void input() {
		Scanner sc = new Scanner(System.in);
		int sizeOfList1;
		int sizeOfList2;
		
		System.out.println("Enter size of first list");
		sizeOfList1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements");
		for(int i=0; i < sizeOfList1; i++) {
			list1.add(sc.nextLine());
		}
		
		System.out.println("Enter size of second list");
		sizeOfList2 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter elements");
		for(int i=0; i < sizeOfList2; i++) {
			list2.add(sc.nextLine());
		}
		list1.addAll(list2);
		sc.close();
	}
	
	public void display() {
		for(int i=0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
	public static void main(String[] args) {
		ListAdd object= new ListAdd();
		object.input();
		object.display();
	}
}
