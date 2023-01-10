package tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
    public static char[] board = new char[9];
    Scanner scan = new Scanner(System.in);
    public static String Winner ="play";
    public static void main(String[] args) {
        System.out.println("::------- WELCOME TO TIC TAC TOE GAME -------::");
        TicTacToeGame mainObject = new TicTacToeGame();
        Repositories repositoriesObject = new Repositories();
        repositoriesObject.createBoard();
        repositoriesObject.choiceLetter();
        repositoriesObject.showBoard();
        while (Winner == "play"){
            repositoriesObject.playGame();
            repositoriesObject.showBoard();
        }
    }
}
