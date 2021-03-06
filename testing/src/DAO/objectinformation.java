package DAO;

import java.io.Serializable;
import java.util.ArrayList;

import Model.email;
import Model.handphone;
import Model.institue;
import Model.person;

public class objectinformation implements Serializable {
	private String _fullname;
	private String _position;
	private String _institue;
	private String _phone;
	private String _email;
	private String _type;
	public objectinformation(person p, institue inst, handphone phones, email emails){
		_fullname = p.getPersonfirstname()+" "+p.getPersonlastname();
		_position = inst.getInstitueposition();
		_institue = inst.getInstituetitle();
		_phone = phones.getPhonenumber();
		_email = emails.getEmail_address();
		_type=inst.get_type();
	}
	
	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public String get_fullname() {
		return _fullname;
	}
	public void set_fullname(String _fullname) {
		this._fullname = _fullname;
	}
	public String get_position() {
		return _position;
	}
	public void set_position(String _position) {
		this._position = _position;
	}
	public String get_institue() {
		return _institue;
	}
	public void set_institue(String _institue) {
		this._institue = _institue;
	}
	public String get_phone() {
		return _phone;
	}
	public void set_phone(String _phone) {
		this._phone = _phone;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	@Override
	public String toString() {
		return "objectinformation [_fullname=" + _fullname + ", _position=" + _position + ", _institue=" + _institue
				+ ", _phone=" + _phone + ", _email=" + _email + "]";
	}
	
}
