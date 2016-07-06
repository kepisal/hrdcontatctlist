package ultilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;

public class DBUtility {
	
	private static Connection cn;
	
	public static Connection getConnection() throws SQLException{
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdstudents","root","0231");
		//cn=DriverManager.getConnection("jdbc:postgres://localhost/")
		return cn;
	}
	
}

