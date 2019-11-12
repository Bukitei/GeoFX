package dad.javafx.geolocalization.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dad.javafx.geolocalization.models.LocationModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	//FXML
	@FXML
	private GridPane view;
	
	@FXML
	private ImageView imageV;
	
	@FXML
	private Label latitude, longtitude, city, zip, language, time, calling, currency, ip;

	//model
	
	private LocationModel model = new LocationModel();
	
	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/geolocalizationFXML.fxml"));
		loader.setController(this);  //Este será nuestro controlador
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		imageV.imageProperty().bind(model.imageProperty());
		latitude.textProperty().bind(model.latitudeProperty());
		longtitude.textProperty().bind(model.longtitudeProperty());
		city.textProperty().bind(model.cityProperty());
		zip.textProperty().bind(model.zipProperty());
		language.textProperty().bind(model.languageProperty());
		time.textProperty().bind(model.timeProperty());
		calling.textProperty().bind(model.callingProperty());
		currency.textProperty().bind(model.currencyProperty());
		ip.textProperty().bind(model.ipProperty());

	}
	
	public GridPane getView() {
		return view;
	}
	
	public void locationDataIn(double latitude, double longtitude, String city, String zip, String calling, String ip, String flag) {
		System.out.println(flag);
		model.setLatitude(Double.toString(latitude));
		model.setLongtitude(Double.toString(longtitude));
		model.setCity(city);
		model.setZip(zip);
		model.setCalling(calling);
		model.setIp(ip);
		model.setImage(new Image(flag));
		
		
	}

}
