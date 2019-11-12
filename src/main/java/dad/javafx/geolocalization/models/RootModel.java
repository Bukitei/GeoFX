package dad.javafx.geolocalization.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RootModel {

	StringProperty ip = new SimpleStringProperty();

	public final StringProperty ipProperty() {
		return this.ip;
	}
	

	public final String getIp() {
		return this.ipProperty().get();
	}
	

	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}
	
	
	
}
