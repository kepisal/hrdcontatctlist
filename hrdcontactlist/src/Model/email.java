package Model;

public class email {
	private String email_id;
	private String email_address;
	private String email_description;
	public email(){}
	public email(String email_id, String email_address, String email_description) {
		super();
		this.email_id = email_id;
		this.email_address = email_address;
		this.email_description = email_description;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getEmail_description() {
		return email_description;
	}
	public void setEmail_description(String email_description) {
		this.email_description = email_description;
	}
	@Override
	public String toString() {
		return "email [email_id=" + email_id + ", email_address=" + email_address + ", email_description="
				+ email_description + "]";
	}
	
}
