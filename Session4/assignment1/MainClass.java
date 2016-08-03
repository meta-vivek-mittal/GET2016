package session4.assignment1;

import java.util.Scanner;

public class MainClass {

	/**
	 * Following main functions acting as a driver class for the Heap class.
	 * @param args[](String) denotes the string array which contains command line arguments.
	 */
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Heap heap = new Heap();
		int choice;
		String yesNo;
		do{
			System.out.println("Enter 1 for Undergraduates : ");
			System.out.println("Enter 2 for Graduate's : ");
			System.out.println("Enter 3 for Professor's work : ");
			System.out.println("Enter 4 for Chair : ");
			System.out.println("Enter 5 to Print : ");
			choice = input.nextInt();
			input.nextLine();
			switch(choice){
			
			case 1 : {
						heap.insertInHeap(1);
						break;
				}
			case 2 : {
						heap.insertInHeap(2);
						break;	
				}
			case 3 : {
						heap.insertInHeap(3);
						break;	
				}
			case 4 : {
						heap.insertInHeap(4);
						break;	
				}
			case 5 : {
						heap.serve();
						break;
				}
			
			default : {
						System.out.println("Invalid Choice :  TRY AGAIN \n");
				}
			}
			System.out.println("Enter Y for Continue otherwise N : \n");
			yesNo = input.nextLine(); 
			
		}while(!yesNo.equalsIgnoreCase("n"));
		
		input.close();
	}
}
