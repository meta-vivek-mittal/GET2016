package session2.assignment1;

import java.util.Scanner;

public class LinkedStackDemo {
	public static void main(String a[]) {
		LinkedStack<String> s = new LinkedStack<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the stack: " + s.size());
		
		//Following commented portion is to check the first part of assignment 1.
		/*int choice;
		do {
			System.out.println("Enter 1 to push : ");
			System.out.println("Enter 2 to pop : ");
			System.out.println("Enter 3 to peep : ");
			System.out.println("Enter 4 to exit : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter item : ");
				sc.nextLine();
				s.push(sc.nextLine());
				break;
			}

			case 2: {
				String item;
				item = s.pop();
				System.out.println("Popped Item : " + item);
				break;
			}

			case 3: {
				String item;
				item = s.peep();
				System.out.println("Peep Item : " + item);
				break;
			}

			default:
				System.out.println("Invalid Choice! Try Again : \n\n");
			}
		} while (choice != 4);

		// iterate through stack
		System.out.println("Stack contains following items till this moment:");
		for (int i = 1; i <= s.size(); i++) {
			System.out.println(s.get(i));
		}
		*/
		
		//Following uncommented code is to check the 2nd part of assignment1
		String inFixExpression = new String();
		System.out.println(" Enter expression in inFix form : ");
		inFixExpression= sc.nextLine();
		String postFixExpression = new String();
		postFixExpression = s.infixToPostfix(inFixExpression );
		System.out.println("Expression in PostFix : "+postFixExpression);
		sc.close();
	}
}
