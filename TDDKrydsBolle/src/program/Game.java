package program;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public Game(){
        ComputerPLayer computerPLayer = new ComputerPLayer(tickTackToeBoard);
    }

    private void start(){
        System.out.println("Welcome. ");
        System.out.println("To continue as player press: P" +
                "for computer press: c");
        String svar = scanner.nextLine();
        if(svar.equalsIgnoreCase("p")){
            playerGoesFirst();

        } else if(svar.equalsIgnoreCase("c")){


        }
    }

    private TickTackToeBoard tickTackToeBoard = new TickTackToeBoard();
    public void playerGoesFirst(){



        // 1 tage imod bruger input
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Piece piece = new Piece("X");
        boolean result = tickTackToeBoard.setPiece(piece,x,y);

        // 2 sætte en Piece på den angivne position
        // 3 cumputer laver sit træk
        // 4 test om 2) og 3) er opfyldt
        throw new NotImplementedException();
    }


}
