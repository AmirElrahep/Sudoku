package com.amir.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Controller class for the SolveGame_Pane
 *
 * @author Amir Elrahep
 * @since 11-28-2020
 */
public class SolveGame_Controller implements Initializable {

    @FXML
    private Label lblSolveGameMsg;


    /**
     * This method initializes the SolveGame_Pane when the program runs.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblSolveGameMsg.setWrapText(true);
        lblSolveGameMsg.setText("Are you sure you want to solve the game? You will lose any progress you have made.");
    }

}
