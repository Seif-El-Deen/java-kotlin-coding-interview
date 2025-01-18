package main.java.com.rockpaperscissor.myapp;
import java.util.Random;

public class GameLogic {
  private String[] playOptions;
  private Random random = null;

  public GameLogic() {
    this.playOptions = new String[]{"rock", "paper", "scissor"};
  }

  public String getRandomValue() {
    // Lazy Intiallization
    if (this.random == null) {
      this.random = new Random();
    }
    int randomValue = random.nextInt(3);
    return playOptions[randomValue];
  }

  public int winningPlayerChecker(String playerAChoice, String playerBChoice) {
    // Same choice, means draw
    // rock --> rock (draw)
    // rock --> paper 2
    // rock --> scissor 1
    // paper --> rock 1
    // paper --> paper (draw)
    // paper --> scissor 2
    // scissor --> rock 2
    // scissor --> paper 1
    // scissor --> scissor (draw)
    if (playerAChoice.equals(playerBChoice)) {
      return 0;
    } else if (playerAChoice.equals("rock") && playerBChoice.equals("paper")) {
      return 2;
    } else if (playerAChoice.equals("rock") && playerBChoice.equals("scissor")) {
      return 1;
    } else if (playerAChoice.equals("paper") && playerBChoice.equals("rock")) {
      return 1;
    } else if (playerAChoice.equals("paper") && playerBChoice.equals("scissor")) {
      return 2;
    } else if (playerAChoice.equals("scissor") && playerBChoice.equals("rock")) {
      return 2;
    } else if (playerAChoice.equals("scissor") && playerBChoice.equals("paper")) {
      return 1;
    } else {
      return -1;
    }
  }

  public String[] getPlayOptions() {
    return this.playOptions;
  }

  public void setPlayOptions(String[] playOptions) {
    this.playOptions = playOptions;
  }

}
