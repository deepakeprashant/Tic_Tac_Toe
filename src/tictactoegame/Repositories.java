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
            System.out.println("USER CHOOSE LETTER : " + userChoiceLetter);
            return;
        }
        userChoiceLetter = '0';
        cpuAllocateLetter = 'X';
        System.out.println("USER CHOOSE LETTER : " + userChoiceLetter);
    }
    void tossWhoFirstPay(){
        System.out.println("Toss ::\n Choose 1] HEAD \n Choose 2] TAIL");
        int tossChoose = scan.nextInt();
        int tossWin = (int) (Math.random()*2)+1;
        if (tossWin == tossChoose){
            System.out.println("USER WIN THE TOSS\n USER PLAY");
            return;
        }
        System.out.println("SORRY ! LOSS THE TOSS USER\n CPU PLAY");
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
}
