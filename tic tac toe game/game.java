import java.util.Scanner;

public class game{
    public static void main(String[] args) {
        char [][] board=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner sc=new Scanner(System.in);
        while(!gameover){
            printBoard(board);
            System.out.println();
            // check for draw
            if(isDraw(board)){
                System.out.println("It's a draw!");
                gameover=true;
                break;
            }
            System.out.println("Player "+player+" turn");
            System.out.println();
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(r<board.length&&c<board.length&&board[r][c]==' '){
                board[r][c]=player;
                gameover=hasWon(board,player);
                if(gameover){
                  System.out.println();
                    System.out.println("Player "+player+" wins");
                }else{
                    if(player=='X'){
                        player='O';
                    }
                    else{
                        player='X';
                    }
                }
            }
            else{
                System.out.println("Position already occupied|| invaild operation");
            }
        }
        System.out.println();
        printBoard(board);


    }
    public static boolean isDraw(char [][]b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                if(b[i][j]==' '){
                    return false;

                }
            }
        }
        return true;
    }
    public static boolean hasWon(char[][] board,char player){
        //check row
        for(int i=0;i<board.length;i++){
            if(board[i][0]==player&&board[i][1]==player&&board[i][2]==player){
                return true;
            }
        }
        //check for col
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]==player&&board[1][i]==player&&board[2][i]==player){
                return true;
            }
        }
        // for diagonal
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return false;
    }
       
    public static void printBoard(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
}