package Jdbc;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Employee", "root", "bhavneet");
			Statement st = con.createStatement();
			String query = "create table list(id int, name varchar(20))";
			st.executeUpdate(query);
		} 
		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}
	}
}


//connection,statement,result set are interface.
// for extracting the data us;e result set interface.