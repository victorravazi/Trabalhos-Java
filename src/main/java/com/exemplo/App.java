package com.exemplo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage stage) {
		Button botao = new Button("Clique aqui");

		botao.setOnAction(e -> {
			System.out.println("Botão clicado!");
		});

		StackPane root = new StackPane(botao);
		Scene scene = new Scene(root, 400, 300);

		stage.setTitle("Teste JavaFX");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
