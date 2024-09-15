# Rock-Paper-Scissors Game

## Overview

This is a simple Rock-Paper-Scissors game implemented in Java. The game allows a player to play against the computer, which makes random choices. The game logic is implemented using helper functions and the `Scanner` class for user input.

## Features

- **Player vs. Computer**: Play Rock-Paper-Scissors against the computer.
- **Random Computer Choices**: Computer makes random choices using the `Helper` class.
- **User Input**: User inputs their choice using the `Scanner` class.
- **Game Results**: The game determines the winner and displays the result.

## Prerequisites

- Java 8 or higher


### Game.java

The entry point for the application. It handles user input, invokes game logic, and displays the result.

### Helper.java

Contains utility functions, including the random item picker used to select the computer's choice.

## How to Run

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/whoismuktar/rock-paper-scissors-java.git
    ```

2. **Navigate to the Project Directory**:
    ```bash
    cd rock-paper-scissors-java
    ```

3. **Compile the Code**:
    ```bash
    javac src/Game.java src/Helper.java -d bin
    ```

4. **Run the Application**:
    ```bash
    java -cp bin Game
    ```

## Usage

1. When prompted, enter your choice: `rock`, `paper`, or `scissors`.
2. The computer will make a random choice.
3. The result will be displayed, indicating whether you won, lost, or tied.

## Example

