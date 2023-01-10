package tictactoegame;

import java.util.Scanner;

public class Repositories {
    char userChoiceLetter;
    char cpuAllocateLetter;
    Scanner scan = new Scanner(System.in);

    void createBoard() {
        int length = TicTacToeGame.board.length;
        for (int i = 0; i < length; i++) {
            TicTacToeGame.board[i] = 'N';
        }
    }

    void choiceLetter() {
        System.out.println("\nPLEASE CHOICE ONE LETTER \n ENTER 1] CHOOSE 'X'\n ENTER 2] CHOOSE 'O'");
        int choice = scan.nextInt();
        if (choice == 1) {
            userChoiceLetter = 'X';
            cpuAllocateLetter = 'O';
            System.out.println("USER CHOOSE LETTER : " + userChoiceLetter + "\n ::--- Start Game ::");
            showBoard();
            return;
        }
        userChoiceLetter = '0';
        cpuAllocateLetter = 'X';
        System.out.println("USER CHOOSE LETTER : " + userChoiceLetter + "\n ::--- Start Game ::");
    }

    void showBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + TicTacToeGame.board[0] + " | " + TicTacToeGame.board[1] + " | " + TicTacToeGame.board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + TicTacToeGame.board[3] + " | " + TicTacToeGame.board[4] + " | " + TicTacToeGame.board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + TicTacToeGame.board[6] + " | " + TicTacToeGame.board[7] + " | " + TicTacToeGame.board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public void playGame() {
        System.out.println("START GAME::");
        System.out.println("CHOOSE POSITION 1 TO 9");
        int location = scan.nextInt();
        if (TicTacToeGame.board[location - 1] == 'N') {
            TicTacToeGame.board[location - 1] = userChoiceLetter;
            return;
        }
        System.out.println("index already Full choose another Location");
    }

    public void tossWhoWinFirst() {
        System.out.println("TOSS ::\nCHOOSE 1] HEAD \nCHOOSE 2] TAILS");
        int userTossChoose = scan.nextInt();
        int toss = (int) (Math.random() * 2) + 1;
        if (toss == userTossChoose){
            System.out.println("USER WIN THE TOSS \n PLAY USER");
            return;
        }
        System.out.println("SORRY ! LOSS THE TOSS \n PLAY CPU");
    }
}
