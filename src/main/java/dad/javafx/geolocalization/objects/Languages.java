package dad.javafx.geolocalization.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Languages {

	String code;
	String name;
	
	@JsonProperty("native")
	String _native;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String get_native() {
		return _native;
	}

	public void set_native(String _native) {
		this._native = _native;
	}
	
	
}
