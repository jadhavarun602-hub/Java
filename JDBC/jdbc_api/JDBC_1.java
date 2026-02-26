package jdbc_api;

// connecting the MySQL

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arun@2004");
		
//		System.out.println(con);
		
		System.out.println("mysql connector...");

	}

}
