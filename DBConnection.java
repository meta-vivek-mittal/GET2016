package session1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * This Class is used to connect the java program to database (JDBC)
 * @author Vivek
 *
 */
public class DBConnection {
	
	Connection connection = null; // Connection object to connect database

	/**
	 * This function loads the drivers of database
	 */
	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		}
	}

	/**
	 * This function will connect the driver to that database
	 * @return connection object for that database
	 */
	public Connection connectDriver() {
		String host = "jdbc:mysql://localhost:3306/";
		String dbName = "lis";
		String mysqlURL = host + dbName;

		String userID = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(mysqlURL, userID, password);
		} catch (SQLException e) {
			System.out.println("Can't connect to database");
		}
		return connection;
	}

	/**
	 * This will close the connection with the database
	 */
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error...");
		}
	}
}