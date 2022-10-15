package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {
    @Override
    public final void start(final Stage primaryStage) {
        try {
            BorderPane root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TicTacToe.fxml")));
            Scene scene = new Scene(root, 300, 400);
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("Application.css")).toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
