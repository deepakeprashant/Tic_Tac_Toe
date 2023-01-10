package tictactoegame;

public class TicTacToeGame {
    char[] board = new char[9];
    public static void main(String[] args) {
        System.out.println("::------- WELCOME TO TIC TAC TOE GAME -------::");
        TicTacToeGame mainObject = new TicTacToeGame();
        mainObject.createBoard();
        mainObject.showBoard();
    }
    void createBoard(){
        int length = board.length;
        for (int i = 0; i < length; i++) {
            board[i] = 'N';
        }
    }
    void showBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
}
