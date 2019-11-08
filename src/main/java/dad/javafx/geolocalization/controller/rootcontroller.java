package dad.javafx.geolocalization.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class rootcontroller implements Initializable {
	
	//FXML
	@FXML
	private VBox view;
	
	@FXML
	private TextField ip;
	
	@FXML
	private Button check;
	
	@FXML
	private TabPane tab;
	
	//model
	
	private ConnectionController connect = new ConnectionController();
	
	public rootcontroller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/rootFXML.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//tab.getTabs().get(0).setContent(connect.getView());
		
	}
	
	public VBox getView(){
		return view;
	}

}
