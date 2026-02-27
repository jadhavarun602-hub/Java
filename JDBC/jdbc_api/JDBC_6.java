package jdbc_api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_6 {

	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "arun@2004")) {

			PreparedStatement pt1 = con.prepareStatement("insert into user values(?,?,?,?);");
			PreparedStatement pt2 = con.prepareStatement("insert into teacher values(?,?,?);");

//			this is user info
			
			for (int i = 1; i <= 3; i++) {

				System.out.println("Enter Student id: ");
				int id = sc.nextInt();
				System.out.println("Enter Student name: ");
				String name = sc.next();
				System.out.println("Enetr Student contact: ");
				String contact = sc.next();
				System.out.println("Enter Student add: ");
				String add = sc.next();
				
				pt1.setInt(1, id);
				pt1.setString(2, name);
				pt1.setString(3, contact);
				pt1.setString(4, add);
				
				int row1 = pt1.executeUpdate();
				
				if(row1 > 0) {
					System.out.println("row affected successfully: "+row1);
				}
			}
			
//			this teacher info
			
			for (int i = 1; i <= 3; i++) {

				System.out.println("Enter teacher id: ");
				int id = sc.nextInt();
				System.out.println("Enter teacher name: ");
				String name = sc.next();
				System.out.println("Enetr teacher subject: ");
				String sub = sc.next();
				
				
				pt2.setInt(1, id);
				pt2.setString(2, name);
				pt2.setString(3, sub);
				
				
				int row2 = pt2.executeUpdate();
				
				if(row2 > 0) {
					System.out.println("row affected successfully: "+row2);
				}
			}

		}

	}

}
