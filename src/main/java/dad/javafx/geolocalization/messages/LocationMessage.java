package dad.javafx.geolocalization.messages;

public class LocationMessage {

	private Double latitude;
	private Double longitude;
	private String city;
	private String zip;
	//private ArrayList<String> languages;
	private String calling_code;
	private String ip;
	private String country_flag;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
//	public ArrayList<String> getLanguages() {
//		return languages;
//	}
//	public void setLanguages(ArrayList<String> languages) {
//		this.languages = languages;
//	}
	
	public String getCalling_code() {
		return calling_code;
	}
	public void setCalling_code(String calling_code) {
		this.calling_code = calling_code;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getCountry_flag() {
		return country_flag;
	}
	public void setCountry_flag(String country_flag) {
		this.country_flag = country_flag;
	}
	
}
