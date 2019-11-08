package dad.javafx.geolocalization.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {
	
	@FXML
	private GridPane view;

	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/geolocalizationFXML.fxml"));
		loader.setController(this);  //Este será nuestro controlador
		loader.load();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {


	}
	
	public GridPane getView() {
		return view;
	}

}
