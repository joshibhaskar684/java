import java.util.Scanner;

public class finalgame {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Initialize the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'X';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);

        while (!gameover) {
            printBoard(board);
            System.out.println("\nPlayer " + player + "'s turn. Enter row and column (0-2):");

            int r, c;
            while (true) {
                r = sc.nextInt();
                c = sc.nextInt();

                // Check if input is within bounds and position is free
                if (r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == ' ') {
                    break; // Valid input
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }

            // Place player's move
            board[r][c] = player;

            // Check if the player has won
            if (hasWon(board, player)) {
                printBoard(board);
                System.out.println("\nPlayer " + player + " wins!");
                gameover = true;
            } else if (isDraw(board)) {
                printBoard(board);
                System.out.println("\nIt's a draw!");
                gameover = true;
            } else {
                // Switch players
                player = (player == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    // Check if the game is a draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false; // Board is not full yet
                }
            }
        }
        return true; // No empty spaces left
    }

    // Check if the current player has won
    public static boolean hasWon(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    // Print the board with better formatting
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | "); // Column separators
            }
            System.out.println();
            if (i < 2) System.out.println("--+---+--"); // Row separator
        }
    }
}
