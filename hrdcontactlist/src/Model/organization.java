package Model;

public class organization {
	private String _id;
	private String _title;
	private String _description;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public organization(String _id, String _title, String _description) {
		super();
		this._id = _id;
		this._title = _title;
		this._description = _description;
	}
	@Override
	public String toString() {
		return "organization [_id=" + _id + ", _title=" + _title + ", _description=" + _description + "]";
	}
	
}
