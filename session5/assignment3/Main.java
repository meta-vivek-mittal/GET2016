package session5.assignment3;

import java.util.Scanner;

public class Main {
	
	/**
	 * Following function(main()) is a driver class for class RecursiveSortedLinkedList
	 * @param args[](String) denotes Command Line Arguments.
	 */
	public static void main(String args[]){
		RecursiveSortedLinkedList obj = new RecursiveSortedLinkedList();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		for(int i=0; i<n ;i++){
			System.out.println("Enter Element "+(i+1)+" : ");
			obj.add(sc.nextInt());
		}		
		System.out.println("Sorted List : ");
		obj.display();
		sc.close();
	}
}
