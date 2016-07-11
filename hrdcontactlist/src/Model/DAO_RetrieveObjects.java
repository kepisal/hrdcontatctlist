package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utilities.DatabaseUtilities;

public class DAO_RetrieveObjects {
	protected Connection cn=DatabaseUtilities.DatabaseConnection();
	public ArrayList<email> ListObjects() throws SQLException, ClassNotFoundException {

		String sql = "select * from tbemail";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<email> objectdto = new ArrayList<email>();
		try {
			while(rs.next()){
				objectdto.add(
						new email(Integer.toString(rs.getInt("email_id")), rs.getString("email_address"), rs.getString("email_description")));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return objectdto;
	}
}
