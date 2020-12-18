package com.amir.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Controller class for the HowToPlay_Pane
 *
 * @author Amir Elrahep
 * @since 12-17-2020
 */
public class HowToPlay_Controller implements Initializable {

    @FXML
    private Label lblHowToPlayMsg;


    /**
     * This method initializes the HowToPlay_Pane when the program runs.
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblHowToPlayMsg.setWrapText(true);
        lblHowToPlayMsg.setText("Sudoku is played on a grid of 9 x 9 spaces. Within the rows and columns are 9 “squares” (made up of 3 x 3 spaces). Each row, column and square (9 spaces each) needs to be filled out with the numbers 1-9, without repeating any numbers within the row, column or square.\n");
    }

}
