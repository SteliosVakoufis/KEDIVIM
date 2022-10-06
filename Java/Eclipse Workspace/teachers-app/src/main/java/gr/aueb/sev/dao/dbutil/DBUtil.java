package gr.aueb.sev.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	
	/*
	 * No instances of this class should be available
	 */
	private DBUtil () {}
	
	private static Connection getConnection() 
			throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/teachersdb?serverTimezone=UTC";
			String username = "zeen";
			String password = "123EEEEE93CA123";
			
			con = DriverManager.getConnection(url, username, password);
			
			return con;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static void CloseConnection() throws SQLException{
		con.close();
	}
	
}
