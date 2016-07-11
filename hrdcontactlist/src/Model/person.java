package Model;

public class person {
	private String personid;
	private String personfirstname;
	private String personlastname;
	private int persongender;
	public person(String personid, String personfirstname, String personlastname, int persongender) {
		super();
		this.personid = personid;
		this.personfirstname = personfirstname;
		this.personlastname = personlastname;
		this.persongender = persongender;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public String getPersonfirstname() {
		return personfirstname;
	}
	public void setPersonfirstname(String personfirstname) {
		this.personfirstname = personfirstname;
	}
	public String getPersonlastname() {
		return personlastname;
	}
	public void setPersonlastname(String personlastname) {
		this.personlastname = personlastname;
	}
	public int getPersongender() {
		return persongender;
	}
	public void setPersongender(int persongender) {
		this.persongender = persongender;
	}
	@Override
	public String toString() {
		return "person [personid=" + personid + ", personfirstname=" + personfirstname + ", personlastname="
				+ personlastname + ", persongender=" + persongender + "]";
	}
	
}
