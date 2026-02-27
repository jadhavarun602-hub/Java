package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password", "arun@2004");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/student",p);
		
		System.out.println(con);
		System.out.println("connection connected..");
		
		con.close();

	}

}
