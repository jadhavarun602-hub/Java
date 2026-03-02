package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_7 {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","arun@2004");
				PreparedStatement psmt = con.prepareStatement("select * from user;");
						ResultSet rs = psmt.executeQuery()){
			
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Contect: "+rs.getString(3));
				System.out.println("Address: "+rs.getString(4));
				System.out.println("---------------------------------------");
			}
			
		}

	}

}
