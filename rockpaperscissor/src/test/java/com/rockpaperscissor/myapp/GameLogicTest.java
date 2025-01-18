package test.java.com.rockpaperscissor.myapp;

import main.java.com.rockpaperscissor.myapp.GameLogic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameLogicTest {

  @Test
    public void testWinningPlayerChecker() {
        GameLogic gameLogic = new GameLogic();

        assertEquals(1, gameLogic.winningPlayerChecker("rock", "scissor"));
        assertEquals(1, gameLogic.winningPlayerChecker("paper", "rock"));
        assertEquals(0, gameLogic.winningPlayerChecker("scissor", "scissor"));
        assertEquals(-1, gameLogic.winningPlayerChecker("rock", "invalid"));
    }

    @Test
    public void testGetRandomValue() {
        GameLogic gameLogic = new GameLogic();
        String value = gameLogic.getRandomValue();
        assertTrue(value.equals("rock") || value.equals("paper") || value.equals("scissor"));
    }
}