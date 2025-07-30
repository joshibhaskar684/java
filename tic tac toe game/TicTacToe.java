import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize the board with empty spaces
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            System.out.println();
            printBoard(board);
            System.out.println();
            System.out.println("Player " + player + ", enter your move (row and column: 0-2):");

            int r = sc.nextInt();
            int c = sc.nextInt();

            if (isValidMove(r, c, board)) {
                board[r][c] = player;

                if (checkWin(board, player)) {
                    System.out.println();
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    gameOver = true;
                } else if (isDraw(board)) {
                    System.out.println();
                    printBoard(board);
                    System.out.println("It's a draw!");
                    gameOver = true;
                } else {
                    player = (player == 'X') ? 'O' : 'X';  // Switch turn
                }
            } else {
                System.out.println("Invalid move, try again.");
            }
        }

        sc.close(); // Close the Scanner to prevent resource leak
    }

    public static boolean isDraw(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;

        return false;
    }

    public static boolean isValidMove(int r, int c, char[][] board) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ';
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}
