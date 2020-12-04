/*
 * Author: Amir Elrahep
 * Date: 2/22/2020
 * Purpose: App class
 */

package com.amir;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        BorderPane rootPane = new BorderPane();
        //Scene scene = new Scene(loadFXML("Sudoku"));
        //scene.getStylesheets().add(getClass().getResource("css/dark.css").toExternalForm());

        Parent content = loadFXML("Sudoku");
        rootPane.setCenter(content);

        Scene scene = new Scene(rootPane);
        scene.getStylesheets().add(getClass().getResource("css/dark.css").toExternalForm());


        // menu bar
        MenuBar menuBar = new MenuBar();
        // file menu
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.SHORTCUT_DOWN));
        exitItem.setOnAction(ae -> Platform.exit());
        fileMenu.getItems().add(exitItem);
        menuBar.getMenus().add(fileMenu);

        // theme menu
        Menu themeMenu = new Menu("Theme");
        themeMenu.setMnemonicParsing(true);
        menuBar.getMenus().add(themeMenu);
        rootPane.setTop(menuBar);

        // switching between dark mode/light mode
        MenuItem dark = new MenuItem("Dark Mode");
        dark.setOnAction(ae -> {
            scene.getStylesheets().clear();
            setUserAgentStylesheet(null);
            scene.getStylesheets().add(getClass().getResource("css/dark.css").toExternalForm());
        });

        MenuItem light = new MenuItem("Light Mode");
        light.setOnAction(ae -> {
            scene.getStylesheets().clear();
            setUserAgentStylesheet(null);
            scene.getStylesheets().add(getClass().getResource("css/light.css").toExternalForm());
        });

        themeMenu.getItems().addAll(dark, light);

        // help menu
        Menu helpMenu = new Menu("Help");
        helpMenu.setMnemonicParsing(true);
        menuBar.getMenus().add(helpMenu);
        rootPane.setTop(menuBar);


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