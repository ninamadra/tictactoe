package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Objects;

public final class TicTacToeController {

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;

    private boolean isFirstPlayer = true;

    public void buttonClickHandler(final ActionEvent evt) {

        Button clickedButton = (Button) evt.getTarget();
        String buttonLabel = clickedButton.getText();

        if ("".equals(buttonLabel) && isFirstPlayer) {
            clickedButton.setText("X");
            isFirstPlayer = false;
        } else if ("".equals(buttonLabel)) {
            clickedButton.setText("O");
            isFirstPlayer = true;
        }

        find3InARow();
    }
    private void find3InARow() {

        if (!"".equals(b1.getText()) && Objects.equals(b1.getText(), b2.getText())
                && Objects.equals(b2.getText(), b3.getText())) {
            highlightWin(b1, b2, b3);
            return;
        }

        if (!"".equals(b4.getText()) && Objects.equals(b4.getText(), b5.getText())
                && Objects.equals(b5.getText(), b6.getText())) {
            highlightWin(b4, b5, b6);
            return;
        }

        if (!"".equals(b7.getText()) && Objects.equals(b7.getText(), b8.getText())
                && Objects.equals(b8.getText(), b9.getText())) {
            highlightWin(b7, b8, b9);
            return;
        }

        if (!"".equals(b1.getText()) && Objects.equals(b1.getText(), b4.getText())
                && Objects.equals(b4.getText(), b7.getText())) {
            highlightWin(b1, b4, b7);
            return;
        }

        if (!"".equals(b2.getText()) && Objects.equals(b2.getText(), b5.getText())
                && Objects.equals(b5.getText(), b8.getText())) {
            highlightWin(b2, b5, b8);
            return;
        }

        if (!"".equals(b3.getText()) && Objects.equals(b3.getText(), b6.getText())
                && Objects.equals(b6.getText(), b9.getText())) {
            highlightWin(b3, b6, b9);
            return;
        }

        if (!"".equals(b1.getText()) && Objects.equals(b1.getText(), b5.getText())
                && Objects.equals(b5.getText(), b9.getText())) {
            highlightWin(b1, b5, b9);
            return;
        }

        if (!"".equals(b3.getText()) && Objects.equals(b3.getText(), b5.getText())
                && Objects.equals(b5.getText(), b7.getText())) {
            highlightWin(b3, b5, b7);
        }
    }

    private void highlightWin(final Button first, final Button second, final Button third) {
        first.getStyleClass().add("winningButton");
        second.getStyleClass().add("winningButton");
        third.getStyleClass().add("winningButton");

    }
}
