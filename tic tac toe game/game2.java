import java.util.Scanner;

public class game2 {
    public static void main(String[] args) {
        char[][]board=new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        char player ='X';
        boolean gameover=false;
        while(!gameover) {
            printBoard(board);
            if(isdraw(board)){
                System.out.println("It's a draw");
                break;
            }
            Scanner sc=new Scanner(System.in);
            System.out.println("player "+player+" turns ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row>=0&&row<board.length&&col>=0&&col<board.length&&board[row][col]== ' '){

                board[row][col]=player;
                gameover=hasWon(board,player);
                if(gameover){
                    System.out.println();
                    System.out.println("player "+player+" wins");
                }
                else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
            else{
                System.out.println("Invalid input");
            }
        }
        System.out.println();
        printBoard(board);
    }
    public static boolean isdraw(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean hasWon(char [][]board,char player){
        //check row
        for(int i=0;i<board.length;i++){
if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player){
    return true;
}
        }
        //check column
        for(int i=0;i<board.length;i++){
            if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player){
                return true;
            }
        }
        //check diagonal
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
                return true;
            }
            return false;
    }
    public static void printBoard(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
