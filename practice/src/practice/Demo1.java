package practice;
import java.sql.*;

public class Demo1 {

		public static void main(String[] args) throws SQLException {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "bhavneet");
				Statement st = con.createStatement();
				String query = "insert into student(id,name) values(102,'Aman')";
				st.executeUpdate(query);
			} 
			catch (Exception e) {
				System.out.println("Exception has occured " + e);
			}
		}

	}

	//connection,statement,result set are interface.
	// for extracting the data us;e result set interface.