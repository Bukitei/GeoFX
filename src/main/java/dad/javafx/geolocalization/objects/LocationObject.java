package dad.javafx.geolocalization.objects;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LocationObject {

	StringProperty latitude, longtitude, city, zip, language, time, calling, currency, ip;
	
	public LocationObject(String latitude, String longtitude, String city, String zip, String language, String time, String calling, String currency, String ip) {

		this.latitude = new SimpleStringProperty(latitude);
		this.longtitude = new SimpleStringProperty(longtitude);
		this.city = new SimpleStringProperty(city);
		this.zip = new SimpleStringProperty(zip);
		this.language = new SimpleStringProperty(language);
		this.time = new SimpleStringProperty(time);
		this.calling = new SimpleStringProperty(calling);
		this.currency = new SimpleStringProperty(currency);
		this.ip = new SimpleStringProperty(ip);
		
	}
	
}
