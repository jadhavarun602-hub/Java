package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_3 {

	public static void main(String[] args) throws SQLException {
		
	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arun@2004")){
		

	
	Statement stmt = con.createStatement();
	
	int row = stmt.executeUpdate("insert into user values(6,'Kishor','8527498476','Japan'),(7,'Krishna','8765419635','Delhi'),(8,'Vinod','8509844635','Satara');");
	
	System.out.println("connection connect..");
	System.out.println("How many row affected: "+row);
	
	
	
	}
		
	}

}
