package tictactoegame;

import java.util.Scanner;

public class TicTacToeGame {
    char[] board = new char[9];
    char userChoiceLetter;
    char cpuAllocateLetter;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("::------- WELCOME TO TIC TAC TOE GAME -------::");
        TicTacToeGame mainObject = new TicTacToeGame();
        mainObject.createBoard();
        mainObject.showBoard();
        mainObject.choiceLetter();
    }

    void createBoard() {
        int length = board.length;
        for (int i = 0; i < length; i++) {
            board[i] = 'N';
        }
    }

    void choiceLetter() {
        System.out.println("\nPLEASE CHOICE ONE LETTER \n ENTER 1] CHOOSE 'X'\n ENTER 2] CHOOSE 'O'");
        int choice = scan.nextInt();
        if (choice == 1){
            userChoiceLetter = 'X';
            cpuAllocateLetter = 'O';
            System.out.println("USER CHOOSE LETTER : "+userChoiceLetter);
            return;
        }
        userChoiceLetter = '0';
        cpuAllocateLetter = 'X';
        System.out.println("USER CHOOSE LETTER : "+userChoiceLetter);
    }

    void showBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
}
