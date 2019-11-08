package dad.javafx.geolocalization.main;

import dad.javafx.geolocalization.controller.rootcontroller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

	private rootcontroller root;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		this.root = new rootcontroller();
		
		VBox root = this.root.getView();
		Scene scene = new Scene(root, 800, 600);
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

}
