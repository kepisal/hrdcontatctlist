package testing;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import DAO.objectinformation;
import Model.email;
import Model.handphone;
import Model.institue;
import Model.myfile;
import Model.organization;
import Model.person;

public class dbconnection {
	String saveFile = "D:/upload/";
	public static Connection DatabaseConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hrdcontactdb", "postgres",
					"0231");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<objectinformation> ListObjects() throws SQLException, ClassNotFoundException {
		String sql = "select tp.ps_firstname ,tp.ps_lastname,ti.institue_position,ti.institue_title,ti.institue_type,th.ph_number,te.email_address "
				+ "FROM tbperson tp, tbinstitue  ti,tbhandphone  th, tbemail te "
				+ "where tp.ps_id = ti.ps_id and tp.ps_id=th.ps_id and tp.ps_id=te.ps_id";
		java.sql.Statement stm = DatabaseConnection().createStatement();
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
				inst.set_type(rs.getString("institue_type"));
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
		PreparedStatement ps = DatabaseConnection().prepareStatement("select * from tbemail where ps_id = ?");
		ps.setInt(1, Integer.parseInt(psid));
		ResultSet rs = ps.executeQuery();
		ArrayList<email> alist = new ArrayList<email>();
		while (rs.next()) {
			alist.add(new email(Integer.toString(rs.getInt("email_id")), rs.getString("email_address"),
					rs.getString("email_description")));
		}
		return alist;
	}
	private File checkExist(String fileName) {
		File f = new File(saveFile+"/"+fileName);

		if(f.exists()){
		StringBuffer sb = new StringBuffer(fileName);
		sb.insert(sb.lastIndexOf("."),"-"+new Date().getTime());
		f = new File(saveFile+"/"+sb.toString());
		}
		return f;
		}
	public boolean newcard(person p,institue inst, handphone hp, email em,organization org, myfile files){
		
		try {
			
			PreparedStatement pstm = DatabaseConnection().prepareStatement("");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(DatabaseConnection().getMetaData().getDatabaseProductName());
	}
}
