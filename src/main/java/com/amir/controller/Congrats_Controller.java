package com.amir.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Controller class for the Congrats_Pane
 *
 * @author Amir Elrahep
 * @since 11-28-2020
 */
public class Congrats_Controller implements Initializable {

    @FXML
    private Label lblCongratsMsg;


    /**
     * This method initializes the Congrats_Pane when the program runs.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblCongratsMsg.setWrapText(true);
        lblCongratsMsg.setText("Congratulations you solved the puzzle! Do you want to start a new game? Press Close to quit the application or Previous to select a different difficulty.");
    }

}
