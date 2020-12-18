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
        lblHowToPlayMsg.setText("The classic Sudoku game involves a grid of 81 squares. The grid is divided into nine blocks, each containing nine squares.\n" +
                "\n" +
                "The rules of the game are simple: each of the nine blocks has to contain all the numbers 1-9 within its squares. Each number can only appear once in a row, column or box.\n" +
                "\n" +
                "The difficulty lies in that each vertical nine-square column, or horizontal nine-square line across, within the larger square, must also contain the numbers 1-9, without repetition or omission.\n" +
                "\n" +
                "Every puzzle has just one correct solution.");
    }

}
