package com.amir.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Controller class for the About_Pane
 *
 * @author Amir Elrahep
 * @since 12-17-2020
 */
public class About_Controller implements Initializable {

    @FXML
    private Label lblAboutMsg;


    /**
     * This method initializes the About_Pane when the program runs.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblAboutMsg.setWrapText(true);
        lblAboutMsg.setText("Version 2.0\nBuild Date: December 18, 2020\n\nBy: Amir Elrahep");
    }

}
