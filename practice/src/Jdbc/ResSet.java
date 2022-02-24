package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResSet {

	public static void main(String[] args) throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///Employee", "root", "bhavneet");
			Statement st = con.createStatement();
			String query = "Select * from list";
			ResultSet rs = st.executeQuery("select * from list");
			while(rs.next())
			{
		    System.out.println(rs.getInt(1)+ " " +rs.getString(2));
			System.out.println(rs.getInt("ID")+ "  " +rs.getString("NAME"));
			}
			st.executeUpdate(query);
		} 
		catch (Exception e) {
			System.out.println("Exception has occured " + e);
		}

	}

}
//execute update is used for delete, update, create the query.
//basically it is used to manipulating the data 