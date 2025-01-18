package main.java.com.rockpaperscissor.myapp;


public class Player {
  private String inputChoice;
  private int winCount;

  public Player(String inputChoice) {
    this.winCount = 0;
    this.inputChoice = inputChoice;
  }

  public Player() {
    this.winCount = 0;
  }

  public void incrementWinCount() {
    this.winCount++;
  }

  public String getInputChoice() {
    return this.inputChoice;
  }

  public void setInputChoice(String inputChoice) {
    this.inputChoice = inputChoice;
  }

  public int getWinCount() {
    return this.winCount;
  }

  public void setWinCount(int winCount) {
    this.winCount = winCount;
  }

}
