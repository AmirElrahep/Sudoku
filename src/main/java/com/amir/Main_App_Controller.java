/*
 * Author: Amir Elrahep
 * Date: 2/22/2020
 * Purpose: Controller class for the Main App
 */

package com.amir;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import com.amir.model.sudokuGenerator;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
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
    private ArrayList<JFXButton> gameButtonList() {
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
    private void restGameBoardColor() {
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col].setStyle("-fx-background-color: #34495e;");
            }
        }
    }


    /**
     * This method erases the game board from everything. It first calls the restGameBoardColor method.
     * Creates a 2d-array of labels by calling the createGameBoard method. Loops through the 2d-array and sets
     * the text fill property to white for each square and sets the each square to null. Re-instantiates the
     * sudokuGenerator object, sg.
     */
    private void eraseGameBoard() {
        restGameBoardColor();
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
     * then it stays the same.
     */
    private void clearGameBoard() {
        restGameBoardColor();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col].getTextFill() != Color.GRAY) {
                    board[row][col].setText(null);
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
                    K = 2;
                } else if (btn.getText().equalsIgnoreCase("medium")) {
                    lblDifficulty.setText("Medium");
                    K = 35;
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
    }


    /**
     * This method changes the color of the selected square (label) and its corresponding row and column.
     * It first calls the restGameBoardColor method. Creates a 2d-array of labels by calling the createGameBoard
     * method. Loops through the 2d-array checking if a square (label) is pressed, making a game board selection.
     * If a selection is made, it loops through and changes the color of the corresponding squares (labels) in the
     * selections x and y directions. Changes the color of the selected square (label) to be slightly lighter.
     */
    public void gameBoardSelection() {
        restGameBoardColor();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // checking if a selection is made
                if (board[row][col].isPressed()) {
                    // changing the colors of the column and row of the selected label
                    for (int i = 0; i < 9; i++) {
                        board[i][col].setStyle("-fx-background-color: #425d77;");
                        board[row][i].setStyle("-fx-background-color: #425d77;");
                    }
                    // changing the color of the selected label to a lighter color
                    board[row][col].setStyle("-fx-background-color: #3b536b;");
                }
            }
        }
    }


    /**
     * This method makes the player move. Creates a string variable str and sets it to null. Creates an array
     * list of buttons by calling the gameButtonList method. Loops through the array list checking which button
     * is pressed. If the button is the reset button, it calls the clearGameBoard method, if the button is the
     * clear button, it sets str to null, else it sets str to the button text. Creates a 2d-array of integers
     * that represents the current board. Creates a 2d-array of integers representing the solved board. Creates a
     * 2d-array of labels by calling the createGameBoard method. Loops through the 2d-array to find the selected
     * square (label) by checking the background color and checks if the text fill property is not gray.
     * If it passes the check then it sets the text to str and updates the currentBoard. Then it checks if the
     * currentBoard is equal to the solvedBoard (solution).
     */
    public void makeMove() {
        String str = null;
        ArrayList<JFXButton> buttons = gameButtonList();

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

        int[][] currentBoard = sg.returnUnsolvedBoard();
        int[][] solvedBoard = sg.returnSolvedBoard();
        Label[][] board = createGameBoard();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col].getStyle().equals("-fx-background-color: #3b536b;") &&
                        board[row][col].getTextFill() != Color.GRAY) {

                    board[row][col].setText(str);

                    // checking if str is not equal to null in case the user cleared a square
                    if (str == null) {
                        currentBoard[row][col] = -9;
                    } else {
                        currentBoard[row][col] = Integer.parseInt(str);
                    }
                }
            }
        }

        if (Arrays.deepEquals(currentBoard, solvedBoard)) {
            System.out.println("Congrats!");
        }
    }


    /**
     * This method solves the sudoku puzzle. Calls the restGameBoardColor method. Uses the sudokuGenerator
     * object, sg, created above. sg calls the SolvedPuzzle method which generates a solved sudoku puzzle.
     * That puzzle is saved into a 2d-array of integers called tempBoard. A 2d-array of labels, named board,
     * is created and set to the createGameBoard method. Loops through and sets the values from tempBoard to board.
     */
    public void solvePuzzle() {
        restGameBoardColor();

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
    }


    /**
     * This method creates a new game. First calls the eraseGameBoard method, then calls the generatePuzzle method.
     */
    public void generateNewGame() {
        eraseGameBoard();
        generatePuzzle();
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

        lblVersion.setText("Version 1.0.0, built on May 10, 2020");
        paneHome.setVisible(true);
        paneDifficulty.setVisible(false);
        paneGame.setVisible(false);
    }

}