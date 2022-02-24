package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DelQuery {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Employee", "root", "bhavneet");
			Statement st = con.createStatement();
			String query = " delete from list where id = 1 ";

			st.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}

	}

}
