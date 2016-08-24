package Model;

public class myfile {
	private String _id;
	private String _filepath;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String get_filepath() {
		return _filepath;
	}
	public void set_filepath(String _filepath) {
		this._filepath = _filepath;
	}
	public myfile(String _id, String _filepath) {
		super();
		this._id = _id;
		this._filepath = _filepath;
	}
	@Override
	public String toString() {
		return "myfile [_id=" + _id + ", _filepath=" + _filepath + "]";
	}
	
}	
