package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Utilities.DatabaseUtilities;

public class DAO_RetrieveObjects {
	protected Connection cn = DatabaseUtilities.DatabaseConnection();

	public ArrayList<objectinformation> ListObjects() throws SQLException, ClassNotFoundException {
		String sql = "select tp.ps_firstname ,tp.ps_lastname,ti.institue_position,ti.institue_title,th.ph_number,te.email_address "
				+ "FROM tbperson tp, tbinstitue  ti,tbhandphone  th, tbemail te "
				+ "where tp.ps_id = ti.ps_id and tp.ps_id=th.ps_id and tp.ps_id=te.ps_id";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<objectinformation> objects = new ArrayList<objectinformation>();
		person p = null;
		institue inst = null;
		handphone ph = null;
		email em = null;
		try {
			//System.out.println(rs.getFetchSize());
			while (rs.next()) {	
				p = new person();
				inst = new institue();
				ph = new handphone();
				em = new email();
				p.setPersonfirstname(rs.getString("ps_firstname"));
				p.setPersonlastname(rs.getString("ps_lastname"));
				inst.setInstitueposition(rs.getString("institue_position"));
				inst.setInstituetitle(rs.getString("institue_title"));
				ph.setPhonenumber(rs.getString("ph_number"));
				em.setEmail_address(rs.getString("email_address"));
				objects.add(new objectinformation(p, inst, ph, em));
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return objects;
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
