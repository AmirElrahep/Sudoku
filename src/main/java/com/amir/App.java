/*
 * Author: Amir Elrahep
 * Date: 2/22/2020
 * Purpose: App class
 */

package com.amir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(loadFXML("Sudoku"));
        scene.getStylesheets().add(getClass().getResource("css/style.css").toExternalForm());
        stage.setTitle("Sudoku");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch();
    }

}