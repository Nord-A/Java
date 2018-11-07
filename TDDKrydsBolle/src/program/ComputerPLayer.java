package program;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ComputerPLayer {

    TickTackToeBoard tickTackToeBoard;

    public ComputerPLayer(TickTackToeBoard tickTackToeBoard) {
        this.tickTackToeBoard = tickTackToeBoard;
    }

    public void makeMove(){

    for (int col=0; col<3; col++){
        for(int row=0; row<3;row++){
            if(tickTackToeBoard.setPiece(new Piece("O",col,row)){
return;
            }
        }
    }


    }
}
