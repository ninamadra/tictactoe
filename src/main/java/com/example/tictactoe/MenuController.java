package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.scene.control.MenuItem;

public final class MenuController {
    public void menuClickHandler(final ActionEvent evt) {

        MenuItem clickedMenu = (MenuItem) evt.getTarget();
        String menuLabel = clickedMenu.getText();

        if ("exit".equals(menuLabel)) {
            clickedMenu.setText("CLICKED");
            System.out.println("exit");
            System.exit(0);

        }
    }
}
