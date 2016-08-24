package session1;

import java.sql.Connection;
import java.util.*;
import java.sql.*;
/**
 * This class fetch the information of library database as required
 * @author Vivek
 */
public class LibraryDAO {

	private Connection connection;	
	private DBConnection db;
	
	// Constructor
	public LibraryDAO() {
		db = new DBConnection();
	}

	/**
	 * This function load the driver as well as connect to driver of vendor database
	 */
	public void getConnection() {
		db.loadDriver();
		connection = db.connectDriver();
	}

	/**
	 * This function gets the books titles and their id's from the database 
	 * @param authorName is the name of the author whose books we have to fetch from 5the database.
	 * @return list of the title objects which contains title name and id's.
	 */
	public List<TitlesPOJO> getBookTitle(String authorName) {
		List<TitlesPOJO> titleList = new ArrayList<TitlesPOJO>();

		String query = 	"SELECT "
							+ "t.title_id,t.title_name from titles t "
						+ "INNER JOIN "
							+ "title_author ta ON t.title_id=ta.title_id "
						+ "INNER JOIN "
							+ "authors a on ta.author_id=a.author_id  "
						+ "WHERE "
							+ "a.author_name=?";

		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, authorName);
			ResultSet res = ps.executeQuery();

			while (res.next()) {
				TitlesPOJO tempTitle = new TitlesPOJO();
				tempTitle.setTitleId(res.getString(1));
				tempTitle.setTitleName(res.getString(2));
				titleList.add(tempTitle);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return titleList;
	}

	/**
	 * This function determines whether the book is issued or not 
	 * @param bookName is the name of the book required to find out whether issued or not
	 * @return boolean true/false
	 */
	public Boolean isBookIssue(String bookName) {

		String query = "SELECT "
						+ "count(*) from book_issue bi "
						+ "INNER JOIN "
						+ "books b ON bi.accession_number=b.accession_number "
						+ "INNER JOIN "
						+ "titles t on b.title_id=t.title_id where t.title_name=?";
		Boolean flag = false;
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, bookName);
			ResultSet res = ps.executeQuery();
			while (res.next()) {
				int count = res.getInt(1);
				if (count > 0) {
					flag = true;
				}
			}
			ps.close();
			res.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * Following function returns the number of books deleted which were not issued for more than 1 Year.
	 * @return no of books deleted
	 */
	public int noOfBooksDeleted() {
		int  rowsDeleted = 0;
		try{
			String query = "DELETE b.* FROM Books b LEFT JOIN book_issue bi ON b.accession_number = bi.accession_number WHERE bi.issue_date IS NULL OR bi.accession_number NOT IN (SELECT accession_number FROM Book_Issue WHERE DATEDIFF(CURRENT_TIMESTAMP,issue_date) <= 365);";
			PreparedStatement preparedStatement;
			preparedStatement = (PreparedStatement) this.connection.prepareStatement(query);
			rowsDeleted = preparedStatement.executeUpdate();

		}catch(Exception e){
			e.printStackTrace();
		}
		return rowsDeleted;
	}	
	public void closeConnection() {
		db.closeConnection();
	}
}