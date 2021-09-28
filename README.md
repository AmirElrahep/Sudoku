# Sudoku

A modern desktop application of the classic Sudoku game.

## Table of Contents

* [General Information](#general-information)
    * [Built With](#built-with)
* [Screenshots and Gameplay](#screenshots-and-gameplay)
* [Features](#features)
* [Setup](#setup)
    * [Prerequisites & Useful Links](#prerequisites--useful-links)
    * [How to Build](#how-to-build)
* [Contact](#contact)

## General Information

This is a modern implementation of the classic game Sudoku. Unlike most Sudoku games, this is stress-free as there is no
pressure to finish the puzzle quickly and there is no scoring system. The current puzzle is never saved, so the user can
quit and start a new game without the limitation of finishing a puzzle before moving on.

Motivation behind the project was to make an elegant looking desktop application of the game Sudoku that provided a
stress-free playing environment.

### Built With

* JavaFX
* JFoenix
* CSS
* Maven

## Screenshots and Gameplay

![Start Pane](src/main/resources/com/amir/images/README%20images/start_pane.png)  
![Difficulty Pane](src/main/resources/com/amir/images/README%20images/difficulty_pane.png)  
![Game Pane](src/main/resources/com/amir/images/README%20images/game_pane.png)  
![Game Pane Play](src/main/resources/com/amir/images/README%20images/game_pane_play.png)  
![Gameplay](src/main/resources/com/amir/images/README%20images/gameplay.gif)

## Features

* Ability to change themes between Dark and Light mode
* Informative How To Play instructions
* Multiple difficulty settings
* Number button disable once it has been used 9 times
* Ability to clear a single square on the board using the Clear button
* Ability to clear entire board using the Reset button
* Conformation before starting a new game or solving the puzzle
* Ability to start a new game, change difficulty setting, or quit application after successful completion of puzzle

## Setup

The following is the installation process for this project on IntelliJ IDEA using Maven.

### Prerequisites & Useful Links

IntelliJ IDEA - [IntelliJ Download](https://www.jetbrains.com/idea/download/#section=mac)  
Maven on IntelliJ - [Maven Setup](https://www.jetbrains.com/help/idea/maven-support.html#maven_import_project_start)  
JFoenix - [JFoenix Download](https://github.com/jfoenixadmin/JFoenix)

### How to Build

1. Follow the download instructions for IntelliJ IDEA.
2. Clone the project - https://github.com/AmirElrahep/Sudoku.git
3. Navigate to the App class

   ```sh
   src/main/java/com/amir/App.java  
   ```

Run and enjoy!

## Contact

Amir Elrahep - [LinkedIn](https://www.linkedin.com/in/amir-elrahep-4141a1154/)
