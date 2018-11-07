package test;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import program.Game;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {


    Game game;

    @Before
    public void setup(){
        game = new Game();
    }


    @Test
    public void testWhenPlayerGoesFirst(){

        game.playerGoesFirst();

        assertEquals(true, false);
    }
}
