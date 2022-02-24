package Jdbc;

import java.sql.*;
import java.util.Collection;

public class PreparedStmt {

	public static void main(String[] args) throws SQLException {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql:///Employee", "root", "bhavneet");
			Statement stmt = con.createStatement();
			String query = "insert into list(id,name) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 109);
			pstmt.setString(2, "Bhavneet");
			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Inserted");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
