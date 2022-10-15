package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public final class MenuController {

    public void menuClickHandler(final ActionEvent evt) {

        MenuItem clickedMenu = (MenuItem) evt.getTarget();
        String menuLabel = clickedMenu.getText();

        if ("exit".equals(menuLabel)) System.exit(0);
        Dialog<Object> dialog = new Dialog<>();
        dialog.setTitle("how to play");
        VBox vbox = new VBox(5);
        Label howto = new Label("how to play:");
        howto.setStyle("-fx-font-family: 'DejaVu Sans Mono';" + "-fx-font-size: 20;" + "-fx-font-weight: bold");
        Label play = new Label("Players take turns putting their marks in empty squares. The first player to get 3 in a row is the winner.");
        play.setStyle("-fx-font-family: 'DejaVu Sans Mono';" + "-fx-font-size: 12");
        vbox.getChildren().addAll(howto, play);
        ButtonType buttonType = new ButtonType("ok", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().setContent(vbox);
        dialog.getDialogPane().getButtonTypes().add(buttonType);
        dialog.showAndWait();
    }
}
