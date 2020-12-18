package com.amir.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller class for the NewGame_Pane
 *
 * @author Amir Elrahep
 * @since 11-28-2020
 */
public class NewGame_Controller implements Initializable {

    @FXML
    private Label lblNewGameMsg;


    /**
     * This method initializes the NewGame_Pane when the program runs.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblNewGameMsg.setWrapText(true);
        lblNewGameMsg.setText("Are you sure you want to start a new game? You will lose any progress you have made.");
    }

}
