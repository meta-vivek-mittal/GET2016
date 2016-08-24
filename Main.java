package session1;

import java.util.*;

/**
 * Main class
 * @author Vivek 
 */
public class Main {

	public static void main(String args[]) {

		LibraryDAO libraryInfo = new LibraryDAO();
		libraryInfo.getConnection();

		// Getting name of the author from the user
		System.out.println("Enter author name");
		Scanner sc = new Scanner(System.in);
		String author = sc.nextLine();

		List<TitlesPOJO> titles = libraryInfo.getBookTitle(author);

		// (Assignment 1)Getting the list of books of that authors
		System.out.println("\tTitle_id and Title_name written by author "
				+ author);
		for (int index = 0; index < titles.size(); index++) {
			TitlesPOJO title = new TitlesPOJO();
			title = titles.get(index);
			System.out.println(title.getTitleId() + " " + title.getTitleName());
		}

		// (Assignment 2)Getting information regarding wheher book is is issued or not
		System.out
				.println("Enter book name to check whether bokk is issued or not.");
		String book = sc.next();
		Boolean isBookIssued = libraryInfo.isBookIssue(book);
		if (isBookIssued == true) {
			System.out.println("Book issued");
		} else {
			System.out.println("No book is issued");
		}

		// (Assignment 3)Deleting the books which were not issued for more than 1 year
		System.out.println(libraryInfo.noOfBooksDeleted() + "book deleted");
		System.out
				.println("are the book which were not issued in the last ione year");
		libraryInfo.closeConnection();
		sc.close();
	}
}