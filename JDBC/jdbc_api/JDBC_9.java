package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_9 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arun@2004");
		
	   con.setAutoCommit(false);
	   
	   Statement stmt = con.createStatement();
	   
	   stmt.addBatch("insert into teacher values(14,'Ambara','Project'),(15,'Patil','SpringBoot');");
//	   stmt.addBatch("insert into teacher values(12,'Sumit','Biology');");
//	   stmt.addBatch("insert into teacher values(13,'Ramakant','Scince');");
	   
	   int count = 1;
	   
	   int [] arr = stmt.executeBatch();
	   
	   for(int i : arr) {
		   System.out.println("no of rows affected: "+i+" queries: "+count);
		   count++;
	   }
	   
	   con.commit();
	   con.close();
	   

	}

}
