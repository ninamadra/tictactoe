package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Objects;

public class Main extends Application {
    @Override
    public final void start(final Stage primaryStage) {
        try {
            VBox root = new VBox();
            BorderPane game = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TicTacToe.fxml")));
            StackPane menu = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("menu.fxml")));
            root.getChildren().addAll(menu,game);
            Scene scene = new Scene(root, 300, 410);
            game.getStylesheets().add(Objects.requireNonNull(getClass().getResource("Application.css")).toExternalForm());
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
