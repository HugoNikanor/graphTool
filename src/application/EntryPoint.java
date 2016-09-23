package application;

import java.io.IOException;

import commandInterface.ConnectionPoint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPoint extends Application {

	private ConnectionPoint connectionPoint;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Scene graphScene = graphCanvas.GraphSceneFactory.makeGraphScene();

		primaryStage.setTitle("Graph Tool");

		primaryStage.setMinHeight(500);
		primaryStage.setMinWidth(500);

		primaryStage.setScene(graphScene);
		primaryStage.show();

		connectionPoint = new ConnectionPoint(12345);
		primaryStage.setOnCloseRequest(ev -> {
			try {
				connectionPoint.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	}
}
