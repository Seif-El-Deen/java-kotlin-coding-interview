package main.java.com.rockpaperscissor.myapp;

public class App {

  public static void main(String[] args) throws Exception {

    GameLogic gameLogic = new GameLogic();

    Player playerA = new Player();
    Player playerB = new Player("rock");
    int numOfRounds = 100;

    for (int i = 0; i < numOfRounds; i++) {

      playerA.setInputChoice(gameLogic.getRandomValue());
      int value = gameLogic.winningPlayerChecker(playerA.getInputChoice(), playerB.getInputChoice());
      switch (value) {
        case 1:
          playerA.incrementWinCount();
          break;
        case 2:
          playerB.incrementWinCount();
          break;
        case -1:
          System.out.print("!!!Invalid input is given!!!, PlayerA: " + playerA.getInputChoice() + ", PlayerB: "
              + playerB.getInputChoice());
      }
    }

    System.out.println("Player A wins: " + playerA.getWinCount() + " of " + numOfRounds + " games");
    System.out.println("Player B wins: " + playerB.getWinCount() + " of " + numOfRounds + " games");
    System.out.println(
        "Draws: " + (numOfRounds - (playerA.getWinCount() + playerB.getWinCount())) + " of " + numOfRounds + " games");

  }

}
