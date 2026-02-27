package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_4 {

	public static void main(String[] args) throws SQLException {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "arun@2004")) {

			PreparedStatement pt = con.prepareStatement("insert into user values(?,?,?,?);");

			pt.setInt(1, 9);
			pt.setString(2, "Arjun");
			pt.setString(3, "4567894652");
			pt.setString(4, "Latur");

			int row = pt.executeUpdate();

			if (row > 0) {
				System.out.println("Data Inserted Successfully ");
			}
		}

	}

}
