package Model;

public class institue {
	private String institueid;
	private String instituetitle;
	private String institueaddress;
	private String instituephone;
	private String instituewebsite;
	private String institueposition;
	private String type;
	public institue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public institue(String institueid, String instituetitle, String institueaddress, String instituephone,
			String instituewebsite, String institueposition, String type) {
		super();
		this.institueid = institueid;
		this.instituetitle = instituetitle;
		this.institueaddress = institueaddress;
		this.instituephone = instituephone;
		this.instituewebsite = instituewebsite;
		this.institueposition = institueposition;
		this.type = type;
	}
	public void set_type(String type){
		this.type= type;
		
	}
	public String get_type(){
		return this.type;
	}
	public String getInstitueid() {
		return institueid;
	}
	public void setInstitueid(String institueid) {
		this.institueid = institueid;
	}
	public String getInstituetitle() {
		return instituetitle;
	}
	public void setInstituetitle(String instituetitle) {
		this.instituetitle = instituetitle;
	}
	public String getInstitueaddress() {
		return institueaddress;
	}
	public void setInstitueaddress(String institueaddress) {
		this.institueaddress = institueaddress;
	}
	public String getInstituephone() {
		return instituephone;
	}
	public void setInstituephone(String instituephone) {
		this.instituephone = instituephone;
	}
	public String getInstituewebsite() {
		return instituewebsite;
	}
	public void setInstituewebsite(String instituewebsite) {
		this.instituewebsite = instituewebsite;
	}
	public String getInstitueposition() {
		return institueposition;
	}
	public void setInstitueposition(String institueposition) {
		this.institueposition = institueposition;
	}
	@Override
	public String toString() {
		return "institue [institueid=" + institueid + ", instituetitle=" + instituetitle + ", institueaddress="
				+ institueaddress + ", instituephone=" + instituephone + ", instituewebsite=" + instituewebsite
				+ ", institueposition=" + institueposition + "]";
	}
	
}
