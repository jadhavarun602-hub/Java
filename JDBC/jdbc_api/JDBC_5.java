package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_5 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "arun@2004")) {

			PreparedStatement ptmt = con.prepareStatement("insert into teacher values(?,?,?);");

			for (int i = 1; i <= 5; i++) {
				System.out.println("Enter Teacher ID: ");
				int id = sc.nextInt();
				System.out.println("Enetr Teacher Name: ");
				String name = sc.next();
				System.out.println("Enter Teacher Subject: ");
				String sub = sc.next();


				ptmt.setInt(1, id);
				ptmt.setString(2, name);
				ptmt.setString(3, sub);
				
				int row = ptmt.executeUpdate();
				
				if(row > 0) {
					System.out.println("row affected successfully: "+row);
				}

			}
		}

	}

}
