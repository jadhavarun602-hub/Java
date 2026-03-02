package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_8 {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arun@2004");
				PreparedStatement stmt = con.prepareStatement("select * from user ;");)
		{
			boolean temp = stmt.execute();
			if(temp) {
				System.out.println("DQL");
				ResultSet rs = stmt.getResultSet();
				
				while(rs.next()) {
					System.out.println("ID: "+rs.getInt(1));
					System.out.println("Name: "+rs.getString(2));
					System.out.println("Contact: "+rs.getString(3));
					System.out.println("Address: "+rs.getString(4));
					System.out.println("--------------------------------");
				}
			}else {
				int row = stmt.getUpdateCount();
				System.out.println("row affected: "+row);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
