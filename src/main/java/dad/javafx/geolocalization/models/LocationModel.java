package dad.javafx.geolocalization.models;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class LocationModel {

	 private StringProperty latitude = new SimpleStringProperty("?");
	 private StringProperty longtitude = new SimpleStringProperty("?");
	 private StringProperty city = new SimpleStringProperty("?");
	 private StringProperty zip = new SimpleStringProperty("?");
	 private StringProperty language = new SimpleStringProperty("?");
	 private StringProperty time = new SimpleStringProperty("?");
	 private StringProperty calling = new SimpleStringProperty("?");
	 private StringProperty currency = new SimpleStringProperty("?");
	 private StringProperty ip = new SimpleStringProperty("?");
	
	private ObjectProperty<Image> image = new SimpleObjectProperty<>();

	public final StringProperty latitudeProperty() {
		return this.latitude;
	}
	

	public final String getLatitude() {
		return this.latitudeProperty().get();
	}
	

	public final void setLatitude(final String latitude) {
		this.latitudeProperty().set(latitude);
	}
	

	public final StringProperty longtitudeProperty() {
		return this.longtitude;
	}
	

	public final String getLongtitude() {
		return this.longtitudeProperty().get();
	}
	

	public final void setLongtitude(final String longtitude) {
		this.longtitudeProperty().set(longtitude);
	}
	

	public final StringProperty cityProperty() {
		return this.city;
	}
	

	public final String getCity() {
		return this.cityProperty().get();
	}
	

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	

	public final StringProperty zipProperty() {
		return this.zip;
	}
	

	public final String getZip() {
		return this.zipProperty().get();
	}
	

	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}
	

	public final StringProperty languageProperty() {
		return this.language;
	}
	

	public final String getLanguage() {
		return this.languageProperty().get();
	}
	

	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	

	public final StringProperty timeProperty() {
		return this.time;
	}
	

	public final String getTime() {
		return this.timeProperty().get();
	}
	

	public final void setTime(final String time) {
		this.timeProperty().set(time);
	}
	

	public final StringProperty callingProperty() {
		return this.calling;
	}
	

	public final String getCalling() {
		return this.callingProperty().get();
	}
	

	public final void setCalling(final String calling) {
		this.callingProperty().set(calling);
	}
	

	public final StringProperty currencyProperty() {
		return this.currency;
	}
	

	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	

	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	

	public final StringProperty ipProperty() {
		return this.ip;
	}
	

	public final String getIp() {
		return this.ipProperty().get();
	}
	

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}


	public final ObjectProperty<Image> imageProperty() {
		return this.image;
	}
	


	public final Image getImage() {
		return this.imageProperty().get();
	}
	


	public final void setImage(final Image image) {
		this.imageProperty().set(image);
	}
	
	
	
	
	
	
}
