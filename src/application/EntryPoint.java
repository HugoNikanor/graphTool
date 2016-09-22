package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPoint extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scene graphScene = graphCanvas.GraphSceneFactory.makeGraphScene();

		primaryStage.setTitle("Graph Tool");

		primaryStage.setScene(graphScene);
		primaryStage.show();
	}
}
