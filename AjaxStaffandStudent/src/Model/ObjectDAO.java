package Model;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class ObjectDAO {
	static Connection cn;

	/*
	 * list all of elements in database return Arraylist objects
	 */
	public ArrayList<ObjectDTO> list() throws SQLException,
			ClassNotFoundException {

		String sql = "SELECT ps.ps_firstname,ps.ps_gender,inst.institue_position,hp.ph_number"
				+ "FROM tbperson ps, tbinstitue inst, tbhandphone hp"
				+ "where hp.ph_status>0";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<ObjectDTO> objectdto = new ArrayList<ObjectDTO>();
		System.out.println(rs.getFetchSize());
		/*try {
			while (rs.next()) {
				objectdto.add(new ObjectDTO(rs.getString("stu_id"), rs
						.getString("stu_name"), rs.getInt("stu_gender"), rs
						.getString("stu_university"),
						rs.getString("stu_class"), rs.getInt("stu_status")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return objectdto;
	}

	/*
	 * @param : id and status function update status 0 to 1 and 1 to 0 follow id
	 * return true/false for success or faild
	 */
	public boolean update(String id, int status) throws SQLException {
		try (PreparedStatement pstm = cn
				.prepareStatement("update hrd_students set stu_status=? where stu_id=?");) {

			pstm.setString(1, String.valueOf(status));
			pstm.setString(2, id);
			return pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * distinct the class value return Arraylist objects (0,1)
	 */
	public ArrayList<ObjectDTO> classList() throws SQLException {
		String sql = "SELECT distinct stu_class FROM hrd_students";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<ObjectDTO> objectdto = new ArrayList<ObjectDTO>();
		try {
			while (rs.next()) {
				objectdto.add(new ObjectDTO("", "", 0, "", rs
						.getString("stu_class"), 0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objectdto;
	}

	/*
	 * distinct the university value return Arraylist objects (0,1)
	 */
	public ArrayList<ObjectDTO> universityList() throws SQLException {
		String sql = "select distinct stu_university from hrd_students";
		java.sql.Statement stm = cn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<ObjectDTO> objectdto = new ArrayList<ObjectDTO>();
		try {
			while (rs.next()) {
				objectdto.add(new ObjectDTO("", "", 0, rs
						.getString("stu_university"), "", 0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objectdto;
	}

	/*
	 * Search all of content by name, class, university and status return as
	 * ArrayList objects
	 */
	public ArrayList<ObjectDTO> search(String name, String classes,
			String university, String status) throws SQLException {
		PreparedStatement ps = cn
				.prepareStatement("select * from hrd_students where stu_university LIKE ? and stu_class LIKE ? and stu_status LIKE ? and stu_name like ?");
		ps.setString(1, university + "%");
		ps.setString(2, classes + "%");
		ps.setString(3, status + "%");
		ps.setString(4, "%" + name + "%");
		ResultSet rs = ps.executeQuery();
		ArrayList<ObjectDTO> alist = new ArrayList<ObjectDTO>();
		while (rs.next()) {
			alist.add(new ObjectDTO(rs.getString("stu_id"), rs
					.getString("stu_name"), rs.getInt("stu_gender"), rs
					.getString("stu_university"), rs.getString("stu_class"), rs
					.getInt("stu_status")));
		}
		return alist;
	}

	/********************** Here is Connection Database *********************************/
	static {
		try {
			/*Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/hrdstudents", "root", "0231");*/
			Class.forName("org.postgresql.Driver");
	         cn = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/hrdcontactlist",
	            "postgres", "0231");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/********************** Here is Connection Database *********************************/
}
