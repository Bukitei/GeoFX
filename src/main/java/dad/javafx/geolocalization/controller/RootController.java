package dad.javafx.geolocalization.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.geofx.utils.UniRestObjectMapper;
import dad.javafx.geolocalization.messages.LocationMessage;
import dad.javafx.geolocalization.models.RootModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;


public class RootController implements Initializable {
	
	//FXML
	@FXML
	private VBox view;
	
	@FXML
	private TextField ip;
	
	@FXML
	private Button check;
	
	@FXML
	private TabPane tab;
	
	@FXML
	private Tab Location, Connection, Security;
	
	//model
	
	private ConnectionController connect = new ConnectionController();
	private LocationController location = new LocationController();
	private SecurityController security = new SecurityController();
	
	private RootModel model = new RootModel();
	
	public RootController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/rootFXML.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Unirest.setObjectMapper(new UniRestObjectMapper());
		
		ip.textProperty().bindBidirectional(model.ipProperty());
		
		model.setIp("8.8.8.8");
		Location.setContent(this.location.getView());
		Connection.setContent(connect.getView());
		Security.setContent(security.getView());
		check.setOnAction(evt -> onCheckAction(model.getIp()));
		
	}
	
	private void onCheckAction(String ip) {
		
			try {
				InetAddress geek = InetAddress.getByName(ip);
				if(geek.isReachable(5000)) {
					Alert yes = new Alert(AlertType.INFORMATION);
					yes.setTitle("CONECTADO");
					yes.setHeaderText("Se ha conectado satisfactoriamente");
					yes.setContentText("Puedes ver tus datos en la pestaña");
					yes.showAndWait();
					dataIn(ip);
				}else {
					Alert error = new Alert(AlertType.ERROR);
					error.setTitle("ERROR");
					error.setHeaderText("No se ha podido conectar");
					error.setContentText("No se ha podido conectar a la ip: "+ip);
					error.showAndWait();
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnirestException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	private void dataIn(String ip) throws UnirestException {
		
		LocationMessage location;
		
		location = Unirest
				.get("http://api.ipapi.com/"+ip+"?access_key=10dea73b77e6ff56fd1a6bb7b1bdb4e1")
				.asObject(LocationMessage.class)
				.getBody();
		
		
		this.location.locationDataIn(
				location.getLatitude(), 
				location.getLongitude(), 
				location.getCity(), 
				location.getZip(), 
				location.getCalling_code(), 
				location.getIp(),
				location.getCountry_flag());
	}
	
	public VBox getView(){
		return view;
	}

}
