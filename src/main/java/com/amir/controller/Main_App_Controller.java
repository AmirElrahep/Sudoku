/*
 * Author: Amir Elrahep
 * Date: 2/22/2020
 * Purpose: Controller class for the Main App
 */

package com.amir.controller;

import com.amir.App;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import com.amir.model.sudokuGenerator;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.ResourceBundle;


public class Main_App_Controller implements Initializable {

    /**
     * These are the different anchor panes.
     */
    @FXML
    private AnchorPane paneHome;
    @FXML
    private AnchorPane paneDifficulty;
    @FXML
    private AnchorPane paneGame;


    /**
     * These are the buttons for each of the anchor panes.
     */
    // home pane buttons
    @FXML
    private JFXButton btnNewGame;

    // difficulty pane buttons
    @FXML
    private JFXButton btnDifficultyBack;
    @FXML
    private JFXButton btnEasy;
    @FXML
    private JFXButton btnMedium;
    @FXML
    private JFXButton btnHard;
    @FXML
    private JFXButton btnEvil;

    // game pane buttons
    @FXML
    private JFXButton btnGameBack;
    @FXML
    private JFXButton btnGenerateNewGame;
    @FXML
    private JFXButton btnSolve;
    @FXML
    private JFXButton btnOne;
    @FXML
    private JFXButton btnTwo;
    @FXML
    private JFXButton btnThree;
    @FXML
    private JFXButton btnFour;
    @FXML
    private JFXButton btnFive;
    @FXML
    private JFXButton btnSix;
    @FXML
    private JFXButton btnSeven;
    @FXML
    private JFXButton btnEight;
    @FXML
    private JFXButton btnNine;
    @FXML
    private JFXButton btnClear;
    @FXML
    private JFXButton btnReset;


    /**
     * These are the labels for the game board. lbl1 - lbl81 represent each individual square on the board.
     */
    @FXML
    private Label lblVersion;
    @FXML
    private Label lblDifficulty;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;
    @FXML
    private Label lbl4;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl6;
    @FXML
    private Label lbl7;
    @FXML
    private Label lbl8;
    @FXML
    private Label lbl9;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl11;
    @FXML
    private Label lbl12;
    @FXML
    private Label lbl13;
    @FXML
    private Label lbl14;
    @FXML
    private Label lbl15;
    @FXML
    private Label lbl16;
    @FXML
    private Label lbl17;
    @FXML
    private Label lbl18;
    @FXML
    private Label lbl19;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl21;
    @FXML
    private Label lbl22;
    @FXML
    private Label lbl23;
    @FXML
    private Label lbl24;
    @FXML
    private Label lbl25;
    @FXML
    private Label lbl26;
    @FXML
    private Label lbl27;
    @FXML
    private Label lbl28;
    @FXML
    private Label lbl29;
    @FXML
    private Label lbl30;
    @FXML
    private Label lbl31;
    @FXML
    private Label lbl32;
    @FXML
    private Label lbl33;
    @FXML
    private Label lbl34;
    @FXML
    private Label lbl35;
    @FXML
    private Label lbl36;
    @FXML
    private Label lbl37;
    @FXML
    private Label lbl38;
    @FXML
    private Label lbl39;
    @FXML
    private Label lbl40;
    @FXML
    private Label lbl41;
    @FXML
    private Label lbl42;
    @FXML
    private Label lbl43;
    @FXML
    private Label lbl44;
    @FXML
    private Label lbl45;
    @FXML
    private Label lbl46;
    @FXML
    private Label lbl47;
    @FXML
    private Label lbl48;
    @FXML
    private Label lbl49;
    @FXML
    private Label lbl50;
    @FXML
    private Label lbl51;
    @FXML
    private Label lbl52;
    @FXML
    private Label lbl53;
    @FXML
    private Label lbl54;
    @FXML
    private Label lbl55;
    @FXML
    private Label lbl56;
    @FXML
    private Label lbl57;
    @FXML
    private Label lbl58;
    @FXML
    private Label lbl59;
    @FXML
    private Label lbl60;
    @FXML
    private Label lbl61;
    @FXML
    private Label lbl62;
    @FXML
    private Label lbl63;
    @FXML
    private Label lbl64;
    @FXML
    private Label lbl65;
    @FXML
    private Label lbl66;
    @FXML
    private Label lbl67;
    @FXML
    private Label lbl68;
    @FXML
    private Label lbl69;
    @FXML
    private Label lbl70;
    @FXML
    private Label lbl71;
    @FXML
    private Label lbl72;
    @FXML
    private Label lbl73;
    @FXML
    private Label lbl74;
    @FXML
    private Label lbl75;
    @FXML
    private Label lbl76;
    @FXML
    private Label lbl77;
    @FXML
    private Label lbl78;
    @FXML
    private Label lbl79;
    @FXML
    private Label lbl80;
    @FXML
    private Label lbl81;


    /**
     * This creates a new sudokuGenerator object named sg to be used for generating a sudoku puzzle.
     * N is the number of rows/columns, K is the number of missing digits.
     */
    private final int N = 9;
    private int K = 0;
    private sudokuGenerator sg = new sudokuGenerator();

    // testing
    private String primaryColor = "-fx-background-color: #2A2E37";
    private String secondaryColor = "-fx-background-color: #92D1C2"; //00bcf2
    private String selectionColor = "-fx-background-color: #353a45";


    // private helper methods

    /**
     * This method creates an arrayList of buttons and adds all of the difficulty buttons to the array list.
     * Returns the arrayList of buttons.
     *
     * @return buttons
     */
    private ArrayList<JFXButton> difficultyButtonList() {
        ArrayList<JFXButton> buttons = new ArrayList<>();
        buttons.add(btnEasy);
        buttons.add(btnMedium);
        buttons.add(btnHard);
        buttons.add(btnEvil);

        return buttons;
    }


    /**
     * This method creates an arrayList of buttons and adds all of the buttons for the game to the array list.
     * Returns the arrayList of buttons.
     *
     * @return buttons
     */
    private ArrayList<JFXButton> createGameButtonList() {
        ArrayList<JFXButton> buttons = new ArrayList<>();
        buttons.add(btnOne);
        buttons.add(btnTwo);
        buttons.add(btnThree);
        buttons.add(btnFour);
        buttons.add(btnFive);
        buttons.add(btnSix);
        buttons.add(btnSeven);
        buttons.add(btnEight);
        buttons.add(btnNine);
        buttons.add(btnClear);
        buttons.add(btnReset);

        return buttons;
    }


    /**
     * This method creates an arrayList of labels and adds all of the labels for the game board to the array list.
     * Returns the arrayList of labels.
     *
     * @return labels
     */
    private ArrayList<Label> createLabelsList() {
        ArrayList<Label> labels = new ArrayList<>();

        labels.add(lbl1);
        labels.add(lbl2);
        labels.add(lbl3);
        labels.add(lbl4);
        labels.add(lbl5);
        labels.add(lbl6);
        labels.add(lbl7);
        labels.add(lbl8);
        labels.add(lbl9);
        labels.add(lbl10);
        labels.add(lbl11);
        labels.add(lbl12);
        labels.add(lbl13);
        labels.add(lbl14);
        labels.add(lbl15);
        labels.add(lbl16);
        labels.add(lbl17);
        labels.add(lbl18);
        labels.add(lbl19);
        labels.add(lbl20);
        labels.add(lbl21);
        labels.add(lbl22);
        labels.add(lbl23);
        labels.add(lbl24);
        labels.add(lbl25);
        labels.add(lbl26);
        labels.add(lbl27);
        labels.add(lbl28);
        labels.add(lbl29);
        labels.add(lbl30);
        labels.add(lbl31);
        labels.add(lbl32);
        labels.add(lbl33);
        labels.add(lbl34);
        labels.add(lbl35);
        labels.add(lbl36);
        labels.add(lbl37);
        labels.add(lbl38);
        labels.add(lbl39);
        labels.add(lbl40);
        labels.add(lbl41);
        labels.add(lbl42);
        labels.add(lbl43);
        labels.add(lbl44);
        labels.add(lbl45);
        labels.add(lbl46);
        labels.add(lbl47);
        labels.add(lbl48);
        labels.add(lbl49);
        labels.add(lbl50);
        labels.add(lbl51);
        labels.add(lbl52);
        labels.add(lbl53);
        labels.add(lbl54);
        labels.add(lbl55);
        labels.add(lbl56);
        labels.add(lbl57);
        labels.add(lbl58);
        labels.add(lbl59);
        labels.add(lbl60);
        labels.add(lbl61);
        labels.add(lbl62);
        labels.add(lbl63);
        labels.add(lbl64);
        labels.add(lbl65);
        labels.add(lbl66);
        labels.add(lbl67);
        labels.add(lbl68);
        labels.add(lbl69);
        labels.add(lbl70);
        labels.add(lbl71);
        labels.add(lbl72);
        labels.add(lbl73);
        labels.add(lbl74);
        labels.add(lbl75);
        labels.add(lbl76);
        labels.add(lbl77);
        labels.add(lbl78);
        labels.add(lbl79);
        labels.add(lbl80);
        labels.add(lbl81);

        return labels;
    }


    /**
     * This method creates a 2d-array of labels representing the game board. Creates an array list of
     * labels by calling the labelsList method. Loops through the 2d-array and sets each label to the
     * labels in the array list. Returns the 2d-array.
     *
     * @return board
     */
    private Label[][] createGameBoard() {
        Label[][] board = new Label[9][9];
        ArrayList<Label> labels = createLabelsList();

        int count = 0;
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = labels.get(count);
                count++;
            }
        }
        return board;
    }


    /**
     * This method resets the game board to be all one color.
     * Creates a 2d-array of labels by calling the createGameBoard method. Loops through the array and
     * sets the background color for each label to be the same.
     */
    private void resetGameBoardColor() {
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col].setStyle(String.valueOf(Color.TRANSPARENT));
            }
        }
    }


    /**
     * This method sets the game button disable property (buttons 1 - 9).
     * Creates an arrayList of buttons by calling the createButtonList method. Loops through the array and
     * sets the disable property for each button to true.
     */
    private void disableGameButtons() {
        ArrayList<JFXButton> buttons = createGameButtonList();

        for (int i = 0; i <= 9; i++) {
            buttons.get(i).setDisable(true);

        }
    }


    /**
     * This method resets the game button disable property (buttons 1 - 9).
     * Creates an arrayList of buttons by calling the createButtonList method. Loops through the array and
     * sets the disable property for each button to false.
     */
    private void enableGameButtons() {
        ArrayList<JFXButton> buttons = createGameButtonList();

        for (JFXButton btn : buttons) {
            btn.setDisable(false);
        }
    }


    /**
     * This method erases the game board from everything. It first calls the restGameBoardColor method.
     * Creates a 2d-array of labels by calling the createGameBoard method. Loops through the 2d-array and sets
     * the text fill property to white for each square and sets the each square to null. Re-instantiates the
     * sudokuGenerator object, sg.
     */
    private void eraseGameBoard() {
        resetGameBoardColor();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col].setTextFill(Color.WHITE);
                board[row][col].setText(null);
            }
        }

        sg = new sudokuGenerator(N, K);
    }


    /**
     * This method clears the game board form all user entries. It first calls the restGameBoardColor method.
     * Creates a 2d-array of labels by calling the createGameBoard method. Loops through the 2d-array checking
     * if a square's (label's) text fill property is not gray. If not then it sets it equal to null. If it is
     * then it stays the same. Calls the clearCurrentBoard method.
     */
    private void clearGameBoard() {
        resetGameBoardColor();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col].getTextFill() != Color.GRAY) {
                    board[row][col].setText(null);
                }
            }
        }
        clearCurrentBoard();
    }


    /**
     * This method clears the current game board for all user entries. Creates a 2d-array of integers by calling
     * the returnUnsolvedBoard method from the sg object created above. Creates a 2d-array of labels by calling
     * the createGameBoard method. Loops through the 2d-array checking if a square's (label's) text is equal to null,
     * if it is then it sets the current location in the currentBoard to 0.
     */
    private void clearCurrentBoard() {
        int[][] currentBoard = sg.returnUnsolvedBoard();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col].getText() != null) {
                    currentBoard[row][col] = Integer.parseInt(board[row][col].getText());
                } else {
                    currentBoard[row][col] = 0;
                }
            }
        }
    }


    /**
     * This method generates a sudoku puzzle by using the sudokuGenerator object, sg, created above.
     * sg calls the unsolvedPuzzle method which generates an unsolved sudoku puzzle. That puzzle is saved into
     * a 2d-array of integers called tempBoard. A 2d-array of labels, named board, is created and set to the
     * createGameBoard method. Loops through and sets the values from tempBoard to board. Values added to board
     * textFill property are set to grey, indicating that it is the generated puzzle and not the users entry.
     * Calls the resetGameButtonDisable method.
     */
    private void generatePuzzle() {
        sg.unsolvedPuzzle();

        // printing the solved board to the terminal (for testing purposes)
        //System.out.println("Solution\n" + Arrays.deepToString(sg.returnSolvedBoard()));

        int[][] tempBoard = sg.returnUnsolvedBoard();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (tempBoard[row][col] == 0) {
                    board[row][col].setText("");
                } else {
                    board[row][col].setText(String.valueOf(tempBoard[row][col]));
                    board[row][col].setTextFill(Color.GRAY);
                }
            }
        }

        enableGameButtons();
    }


    // public methods

    /**
     * These are the methods when the back button is pressed for the different game panes or the new game button
     * on the home pane are pressed. Sets the current pane visibility to false and sets the corresponding pane's
     * visibility to true.
     */
    public void btnNewGamePressed() {
        paneHome.setVisible(false);
        paneDifficulty.setVisible(true);
    }

    public void btnDifficultyBackPressed() {
        paneDifficulty.setVisible(false);
        paneHome.setVisible(true);
    }

    public void btnGameBackPressed() {
        paneGame.setVisible(false);
        paneDifficulty.setVisible(true);
    }


    /**
     * This method generates a game based on the difficulty selected. Sets the difficulty pane's visibility to
     * false and the game pane's visibility to true. Calls the eraseGameBoard method. Creates an array list of
     * buttons bt calling the difficultyButtonList method. Loops through the array list to find the selected button.
     * Sets the value of K depending on the selected difficulty. Calls the generatePuzzle method.
     * Calls the resetGameButtonDisable method. Calls the makeMove method to disable buttons if needed.
     */
    public void difficultySelected() {
        paneDifficulty.setVisible(false);
        paneGame.setVisible(true);
        eraseGameBoard();
        ArrayList<JFXButton> buttons = difficultyButtonList();

        for (JFXButton btn : buttons) {
            if (btn.isPressed()) {
                if (btn.getText().equalsIgnoreCase("easy")) {
                    lblDifficulty.setText("Easy");
                    K = 20; //20
                } else if (btn.getText().equalsIgnoreCase("medium")) {
                    lblDifficulty.setText("Medium");
                    K = 35; //35
                } else if (btn.getText().equalsIgnoreCase("hard")) {
                    lblDifficulty.setText("Hard");
                    K = 55;
                } else if (btn.getText().equalsIgnoreCase("evil")) {
                    lblDifficulty.setText("Evil");
                    K = 65;
                }
            }
        }

        sg = new sudokuGenerator(N, K);
        generatePuzzle();
        makeMove();
    }


    /**
     * This method changes the color of the selected square (label) and its corresponding row and column.
     * It first calls the restGameBoardColor method. Creates a 2d-array of labels by calling the createGameBoard
     * method. Loops through the 2d-array checking if a square (label) is pressed, making a game board selection.
     * If a selection is made, it loops through and changes the color of the corresponding squares (labels) in the
     * selections x and y directions. Changes the color of the selected square (label) to be slightly lighter.
     */
    public void gameBoardSelection() {
        resetGameBoardColor();
        Label[][] board = createGameBoard();

        // selecting colors based off of what theme is selected (dark/light)
//        String row_columnColor;
//        String selectionColor;
//        if (paneGame.getBackground().getFills().toString().equals("[javafx.scene.layout.BackgroundFill@4953c340]")) {
//            row_columnColor = "-fx-background-color: #425d77";
//            selectionColor = "-fx-background-color: #3b536b";
//        } else {
//            row_columnColor = "-fx-background-color: #90a9c1";
//            selectionColor = "-fx-background-color: #849fbb";
//        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // checking if a selection is made
                if (board[row][col].isPressed()) {
                    // changing the colors of the column and row of the selected label
                    for (int i = 0; i < 9; i++) {
                        board[i][col].setStyle(secondaryColor);
                        board[row][i].setStyle(secondaryColor);
                    }
                    // changing the color of the selected label to a lighter color
                    board[row][col].setStyle(selectionColor);
                }
            }
        }
    }


    /**
     * This method makes the player move.
     * <p>
     * -- Part one --
     * Creates a string variable str and sets it to null. Creates an array
     * list of buttons by calling the gameButtonList method. Loops through the array list checking which button
     * is pressed. If the button is the reset button, it calls the clearGameBoard method, if the button is the
     * clear button, it sets str to null, else it sets str to the button text.
     * <p>
     * -- Part two --
     * Creates a 2d-array of integers that represents the current board. Creates a 2d-array of integers representing
     * the solved board. Creates a 2d-array of labels by calling the createGameBoard method. Loops through the
     * 2d-array to find the selected square (label) by checking the background color and checks if the text fill
     * property is not gray. If it passes the check then it sets the text to str and updates the currentBoard.
     * <p>
     * -- Part three --
     * This part deals with disabling the game buttons (1-9 buttons) based of the number of occurrences each number has.
     * It calls the resetGameButtonDisable method to enable all of the buttons. Loops through the game and counts the
     * number of occurrences each number has. If a number occurs 9 times, the button for that number is disabled.
     * <p>
     * -- Part four --
     * Checks if the currentBoard is equal to the solvedBoard (solution), if so, prompts the user if they want to start
     * a new game or quit the application via a dialog pane.
     */
    public void makeMove() {
        // -- part one --
        String str = null;
        ArrayList<JFXButton> buttons = createGameButtonList();

        // getting the value of the button pressed
        for (JFXButton btn : buttons) {
            if (btn.isPressed()) {
                if (btn.getText().equalsIgnoreCase("reset")) {
                    clearGameBoard();
                } else if (btn.getText().equalsIgnoreCase("clear")) {
                    str = null;
                } else {
                    str = btn.getText();
                }
            }
        }

        // part two --
        int[][] currentBoard = sg.returnUnsolvedBoard();
        int[][] solvedBoard = sg.returnSolvedBoard();
        Label[][] board = createGameBoard();

        // selecting colors based off of what theme is selected (dark/light)
//        String selectionColor;
//        if (paneGame.getBackground().getFills().toString().equals("[javafx.scene.layout.BackgroundFill@4953c340]")) {
//            selectionColor = "-fx-background-color: #3b536b";
//        } else {
//            selectionColor = "-fx-background-color: #849fbb";
//        }

        // using value from button pressed to display in puzzle as user input
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col].getStyle().equals(selectionColor) &&
                        board[row][col].getTextFill() != Color.GRAY) {

                    board[row][col].setText(str);

                    // checking if str is not equal to null in case the user cleared a square
                    if (str == null) {
                        currentBoard[row][col] = 0;
                    } else {
                        currentBoard[row][col] = Integer.parseInt(str);
                    }
                }
            }
        }

        // -- part three --
        enableGameButtons();

        int num = 0; // number to count occurrences of
        int count = 0; // number of occurrences

        while (num <= 9) {
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (currentBoard[row][col] == num) {
                        count++;
                    }
                }
            }
            // printing the number and its occurrences to the terminal (for testing purposes)
            // (uncomment blank line at end of while loop)
            System.out.println(num + " occurs " + count + " times");

            // if number of occurrences is 9 times, disable corresponding button
            if (num != 0 && count == 9) {
                buttons.get(num - 1).setDisable(true);
            }

            // setting count back to 0 and incrementing num by 1 to check for the next number
            count = 0;
            num++;
        }// end while loop
        System.out.println("\n");

        // -- part four --
        // (for testing) uncomment following lines and comment out remainder of the method to bypass the dialog pane
//        if (Arrays.deepEquals(currentBoard, solvedBoard)) {
//            System.out.println("Congrats!");
//        }

        if (Arrays.deepEquals(currentBoard, solvedBoard)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Congratulations_Pane.fxml"));
                DialogPane newGameDialogPane = fxmlLoader.load();

                Dialog<ButtonType> dialog = new Dialog<>();
                dialog.setDialogPane(newGameDialogPane);
                dialog.setTitle("Congratulations");

                Optional<ButtonType> result = dialog.showAndWait();
                if (result.get() == ButtonType.YES) {
                    startNewGame();
                } else {
                    Platform.exit();
                    System.exit(0);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    /**
     * This method solves the sudoku puzzle if the user accepts the dialog pane. Calls the restGameBoardColor method.
     * Uses the sudokuGenerator object, sg, created above. sg calls the SolvedPuzzle method which generates a solved
     * sudoku puzzle. That puzzle is saved into a 2d-array of integers called tempBoard. A 2d-array of labels,
     * named board, is created and set to the createGameBoard method. Loops through and sets the values from
     * tempBoard to board.
     */
    public void solvePuzzle() {
        // (for testing) uncomment following lines and comment out remainder of the method to bypass the dialog pane
//        resetGameBoardColor();
//
//        int[][] tempBoard = sg.returnSolvedBoard();
//        Label[][] board = createGameBoard();
//
//        for (int row = 0; row < 9; row++) {
//            for (int col = 0; col < 9; col++) {
//                if (tempBoard[row][col] == 0) {
//                    board[row][col].setText("");
//                } else {
//                    board[row][col].setText(String.valueOf(tempBoard[row][col]));
//                }
//            }
//        }

        resetGameBoardColor();

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Solve_Game_Pane.fxml"));
            DialogPane newGameDialogPane = fxmlLoader.load();

            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(newGameDialogPane);
            dialog.setTitle("Solve Game");

            Optional<ButtonType> result = dialog.showAndWait();
            if (result.get() == ButtonType.YES) {
                resetGameBoardColor();

                int[][] tempBoard = sg.returnSolvedBoard();
                Label[][] board = createGameBoard();

                for (int row = 0; row < 9; row++) {
                    for (int col = 0; col < 9; col++) {
                        if (tempBoard[row][col] == 0) {
                            board[row][col].setText("");
                        } else {
                            board[row][col].setText(String.valueOf(tempBoard[row][col]));
                        }
                    }
                }

                disableGameButtons(); // disabling all of the game buttons
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method creates a new game if the user accepts the dialog pane.
     * First calls the eraseGameBoard method, then calls the generatePuzzle method.
     * Calls the makeMove method to disable buttons if needed.
     */
    public void generateNewGame() {
        // (for testing) uncomment following lines and comment out remainder of the method to bypass the dialog pane
//        eraseGameBoard();
//        generatePuzzle();
//        makeMove();

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("New_Game_Pane.fxml"));
            DialogPane newGameDialogPane = fxmlLoader.load();

            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.setDialogPane(newGameDialogPane);
            dialog.setTitle("New Game");

            Optional<ButtonType> result = dialog.showAndWait();
            if (result.get() == ButtonType.YES) {
                eraseGameBoard();
                generatePuzzle();
                makeMove();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method creates a new game without user accepting dialog pane. First calls the eraseGameBoard method,
     * then calls the generatePuzzle method. Calls the makeMove method to disable buttons if needed.
     */
    public void startNewGame() {
        eraseGameBoard();
        generatePuzzle();
        makeMove();
    }


    /**
     * This method initializes the Main App window when the program runs
     *
     * @param url            url
     * @param resourceBundle resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //createGameBoard(); // calling the createGameBoard method
        //generatePuzzle(); // calling the generatePuzzle method

        lblVersion.setText("Version 1.0, built on May 10, 2020");
        paneHome.setVisible(true);
        paneDifficulty.setVisible(false);
        paneGame.setVisible(false);
    }

}
