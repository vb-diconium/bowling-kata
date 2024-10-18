package bowling;

public class Bowling {

  int[] rolls = new int[21];
  int rollIndex = 0;

  public void roll(int pins) {
    rolls[rollIndex] = pins;
    rollIndex++;
  }

  public int score() {
    var index = 0;
    var score = 0;
    for (int roll = 0; roll < 10; roll++) {
      if (isStrike(index)) {
        score += 10 + strikeBonus(index);
        index++;
      } else if (isSpare(index)) {
        score += 10 + spareBonus(index);
        index += 2;
      } else {
        score += getFrameScore(index);
        index += 2;
      }
    }

    return score;
  }

  private int getFrameScore(int index) {
    return rolls[index] + rolls[index + 1];
  }

  private int spareBonus(int index) {
    return rolls[index + 2];
  }

  private boolean isSpare(int roll) {
    return rolls[roll] + rolls[roll + 1] == 10;
  }

  private int strikeBonus(int roll) {
    return rolls[roll + 1] + rolls[roll + 2];
  }

  private boolean isStrike(int roll) {
    return rolls[roll] == 10;
  }
}