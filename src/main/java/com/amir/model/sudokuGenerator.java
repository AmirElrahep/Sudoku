package com.amir.model;

import java.util.Arrays;


/**
 * Sudoku puzzle generator
 *
 * @author Amir Elrahep
 * @since 3-09-2020
 */
public class sudokuGenerator {

    int[][] unsolvedBoard;
    int[][] solvedBoard;
    int N;              // number of rows/columns
    int SRN;            // square root of N
    int K;              // number of missing digits


    /**
     * This constructors takes two parameters, one for the size of the board and one for the number of
     * missing elements. Generates a 2d-array representing the size of the sudoku board.
     *
     * @param N size of the board
     * @param K number of missing elements
     */
    public sudokuGenerator(int N, int K) {
        this.N = N;
        this.K = K;

        // calculating the square root of N
        double SRNd = Math.sqrt(N);
        SRN = (int) SRNd;

        unsolvedBoard = new int[N][N];
    }


    /**
     * This constructors takes zero parameters. Generates a 2d-array representing the size of the sudoku board.
     */
    public sudokuGenerator() {
        // calculating the square root of N
        double SRNd = Math.sqrt(N);
        SRN = (int) SRNd;

        unsolvedBoard = new int[N][N];
    }


    /**
     * This method generates a sudoku board by calling other methods
     */
    public void unsolvedPuzzle() {
        // filling the diagonal of SRN x SRN blocks
        fillDiagonal();

        // filling remaining blocks
        fillRemaining(0, SRN);

        // copying the generated sudoku board before removing k digits inorder to have a solved version of
        // the sudoku puzzle
        solvedBoard = Arrays.stream(unsolvedBoard).map(int[]::clone).toArray(int[][]::new);

        // removing k digits to make game
        removeKDigits();
    }


    /**
     * This method fills the diagonal SRN number of SRN x SRN matrices
     */
    void fillDiagonal() {
        for (int i = 0; i < N; i = i + SRN) {
            // for diagonal box, start coordinates->i==j
            fillBox(i, i);
        }
    }


    /**
     * This method takes three parameters, rowStart and colStart and num. rowStart and colStart represent
     * the row and column on the sudoku board to start the checking if a 3 x 3 block contains num. Returns false
     * if the 3 x 3 block contains num, else returns true.
     *
     * @param rowStart represents the row on the board to start checking
     * @param colStart represents the column on the board to start checking
     * @param num      number to check for
     * @return false if 3 x 3 block contains num, else returns true
     */
    boolean unUsedInBox(int rowStart, int colStart, int num) {
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                if (unsolvedBoard[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    /**
     * This method takes two parameters, row and col, representing the start of the 3 x 3 block to fill.
     *
     * @param row represents the row
     * @param col represents the column
     */
    void fillBox(int row, int col) {
        int num;
        for (int i = 0; i < SRN; i++) {
            for (int j = 0; j < SRN; j++) {
                do {
                    num = randomGenerator(N);
                }
                while (!unUsedInBox(row, col, num));

                unsolvedBoard[row + i][col + j] = num;
            }
        }
    }


    /**
     * This method takes one parameters, num, representing the highest number that can be generated.
     * Returns a random number (between 1 and 9).
     *
     * @param num highest number that can be generated
     * @return a random generated number between 1 and 9
     */
    int randomGenerator(int num) {
        return (int) Math.floor((Math.random() * num + 1));
    }


    /**
     * This method takes three parameters, row, col amd num. Row and col represent the start of the 3 x 3 block
     * to check if it is safe to add a number to one of the cells.
     *
     * @param row represents the row
     * @param col represents the column
     * @param num number to be added
     */
    boolean CheckIfSafe(int row, int col, int num) {
        return (unUsedInRow(row, num) &&
                unUsedInCol(col, num) &&
                unUsedInBox(row - row % SRN, col - col % SRN, num));
    }


    /**
     * This method takes two parameters, row and num. Checks if num is found in that row.
     *
     * @param row represents the row
     * @param num represents number to check
     * @return false if row contains the number to check, else return true
     */
    boolean unUsedInRow(int row, int num) {
        for (int col = 0; col < N; col++) {
            if (unsolvedBoard[row][col] == num) {
                return false;
            }
        }
        return true;
    }


    /**
     * This method takes two parameters, col and num. Checks if num is found in that column.
     *
     * @param col represents the column
     * @param num represents the number to check
     * @return false if column contains the number to check, else return true
     */
    // check in the row for existence
    boolean unUsedInCol(int col, int num) {
        for (int row = 0; row < N; row++) {
            if (unsolvedBoard[row][col] == num) {
                return false;
            }
        }
        return true;
    }


    /**
     * This method takes two parameters row and col, representing the start of a 3 x 3 block.
     * It calls itself recursively to fill the remaining 3 x 3 blocks.
     *
     * @param row represents the row
     * @param col represents the column
     */
    boolean fillRemaining(int row, int col) {
        //  System.out.println(i+" "+j);
        if (col >= N && row < N - 1) {
            row++;
            col = 0;
        }
        if (row >= N && col >= N) {
            return true;
        }

        if (row < SRN) {
            if (col < SRN)
                col = SRN;
        } else if (row < N - SRN) {
            if (col == (row / SRN) * SRN)
                col += SRN;
        } else {
            if (col == N - SRN) {
                row++;
                col = 0;
                if (row >= N) {
                    return true;
                }
            }
        }

        for (int num = 1; num <= N; num++) {
            if (CheckIfSafe(row, col, num)) {
                unsolvedBoard[row][col] = num;
                if (fillRemaining(row, col + 1)) {
                    return true;
                }
                unsolvedBoard[row][col] = 0;
            }
        }
        return false;
    }


    /**
     * This method removes the k number of elements from the sudoku board.
     */
    void removeKDigits() {
        int count = K;
        while (count != 0) {
            int cellId = randomGenerator(N * N);
            //System.out.println("cell id: " + cellId);

            // extract coordinates i  and j
            int row = cellId / N;
            int col = cellId % 9;

            if (row == 9) {
                row--;
            }

            //System.out.println("coordinates: " + i + " " + j + "\n");
            if (unsolvedBoard[row][col] != 0) {
                unsolvedBoard[row][col] = 0;
                count--;
            }
        }
    }


    /**
     * This method returns the 2d-array of integers representing the unsolved sudoku board.
     *
     * @return unsolvedBoard
     */
    public int[][] returnUnsolvedBoard() {
        return unsolvedBoard;
    }


    /**
     * This method returns the 2d-array of integers representing the solved sudoku board
     *
     * @return solvedBoard
     */
    public int[][] returnSolvedBoard() {
        return solvedBoard;
    }


    /**
     * This method prints the sudoku board.
     */
    public void printSudoku() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(unsolvedBoard[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    /*
    // driver test code
    public static void main(String[] args) {
        int N = 9, K = 40;
        sudokuGenerator sudoku = new sudokuGenerator(N, K);

        sudoku.unsolvedPuzzle();
        System.out.println(Arrays.deepToString(sudoku.returnSolvedBoard()));

        sudoku.printSudoku();
    }
    */

}
