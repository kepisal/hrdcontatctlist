package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utilities.DatabaseUtilities;

public class DAO_RetrieveObjects {
	protected Connection cn = DatabaseUtilities.DatabaseConnection();

	public ArrayList<email> ListObjects() throws SQLException, ClassNotFoundException {

		String sql = "select * from tbemail";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<email> objectdto = new ArrayList<email>();
		try {
			while (rs.next()) {
				objectdto.add(new email(Integer.toString(rs.getInt("email_id")), rs.getString("email_address"),
						rs.getString("email_description")));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return objectdto;
	}

	public ArrayList<email> retrieveobjectby(String psid) throws NumberFormatException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = cn.prepareStatement("select * from tbemail where ps_id = ?");
		ps.setInt(1, Integer.parseInt(psid));
		ResultSet rs = ps.executeQuery();
		ArrayList<email> alist = new ArrayList<email>();
		while (rs.next()) {
			alist.add(new email(Integer.toString(rs.getInt("email_id")), rs.getString("email_address"),
					rs.getString("email_description")));
		}
		return alist;
	}
}
