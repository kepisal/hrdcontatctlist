package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtilities {
	public static Connection DatabaseConnection(){
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hrdcontactlist",
		            "postgres", "0231");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
