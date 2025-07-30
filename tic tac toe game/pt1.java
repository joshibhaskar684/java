import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char [][] board=new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=' ';
            }
        }
        char player ='X';
        boolean gameover=false;
        while(!gameover){
            System.out.println( );
            print(board);
            System.out.println();
            System.out.println("Player "+player+" turn");
           
            int r=sc.nextInt();
            int c=sc.nextInt();
            if(check(r,c,board)){
                board[r][c]=player;
                if(checkwin(board,player)){
                    System.out.println();
                    System.out.println("Player "+player+" wins");
                    System.out.println( );
                    print(board);
                    gameover=true;
                }
                else if(checkdraw(board)){
                    System.out.println();
                    System.out.println("It's a draw");
                    System.out.println( );
                    print(board);
                    gameover=true;
                }
                else if(player=='X'){
                    player='O';
                }else{
                    player='X';
                }
            }
            else{
                System.out.println("Invalid move");
            }
        }
        sc.close();
    }
    public  static boolean checkdraw (char b[][]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                if(b[i][j]==' '){
                    return false;
                }
            }
        }
        
        return true;
    }
    public static boolean checkwin(char b[][],char p){
        for(int i=0;i<b.length;i++){
            if(b[i][0]==p && b[i][1]==p && b[i][2]==p){
                return true;
            }
            if(b[0][i]==p && b[1][i]==p && b[2][i]==p){
                return true;
            }
        }
        // for diagonal
       if(b[0][0]==p&&b[1][1]==p&&b[2][2]==p){
        return true;
       }
       if(b[0][2]==p&&b[1][1]==p&&b[2][0]==p){
            return true;
        }
        return false;
    }
    public static boolean check(int r,int c,char b[][]){
        if(r<0||r>2||c<0||c>2){
            return false;
        }
        if(b[r][c]!=' '){
            return false;
        }
        return true;
    }
    public  static void print(char b[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" | ");

            }
            System.out.println( );
        }
    }
}

