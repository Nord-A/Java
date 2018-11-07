package program;

public class TickTackToeBoard {

    Piece [][] board = new Piece[3][3];

    public boolean WinnerFound(){

        return false;
    }


    public boolean isBoardFull(){

        return false;
    }

    public boolean setPiece(Piece piece, int x, int y){
if (board[x][y] !=0){
    return false;
}else {
    board[x][y] = piece;
    return true;
}

        return false;
    }


    public void showBoard(){
        // udskriv hele board arrayet

    }



}
