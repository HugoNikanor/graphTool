package application;

import java.io.IOException;

import abstractGraph.Graph;
import commandInterface.ConnectionPoint;
import commandInterface.MessageHandler;

import graphScene.GraphSceneFactory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPoint extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Graph graph = new Graph();
		MessageHandler handler = new graphCanvas.GraphInterface(graph);

		ConnectionPoint connectionPoint
			= new ConnectionPoint(12345, handler);

		Scene graphScene = GraphSceneFactory.makeGraphScene(handler);

		primaryStage.setTitle("Graph Tool");

		primaryStage.setMinHeight(500);
		primaryStage.setMinWidth(500);

		primaryStage.setScene(graphScene);

		primaryStage.show();

		primaryStage.setOnCloseRequest(ev -> {
			try {
				connectionPoint.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	}
}
