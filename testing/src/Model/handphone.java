package Model;

public class handphone {
	private String phoneid;
	private String phonenumber;
	private String phonedescription;
	private int phonestatus;
	public handphone(){}
	public handphone(String phoneid, String phonenumber, String phonedescription, int phonestatus) {
		super();
		this.phoneid = phoneid;
		this.phonenumber = phonenumber;
		this.phonedescription = phonedescription;
		this.phonestatus = phonestatus;
	}
	public String getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(String phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	@Override
	public String toString() {
		return "handphone [phoneid=" + phoneid + ", phonenumber=" + phonenumber + ", phonedescription="
				+ phonedescription + ", phonestatus=" + phonestatus + "]";
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPhonedescription() {
		return phonedescription;
	}
	public void setPhonedescription(String phonedescription) {
		this.phonedescription = phonedescription;
	}
	public int getPhonestatus() {
		return phonestatus;
	}
	public void setPhonestatus(int phonestatus) {
		this.phonestatus = phonestatus;
	}
	
	
}
