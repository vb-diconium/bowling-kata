package bowling;

public class Bowling {

    private int totalRollScore = 0;
    int[] rolls = new int[21];
    int rollIndex = 0;

    public void roll(int pins) {

        rolls[rollIndex] = pins;
        rollIndex++;
    }

    public int score() {
        int index=0;
        for (int roll = 0; roll < 10; roll++) {
            if (isStrike(index)) {
                totalRollScore += 10 + strikeBonus(index);
                index++;
            } else if (isSpare(index)) {
                totalRollScore += 10 + spareBonus(index);
                index +=2;
            } else {
                totalRollScore += rolls[index] +rolls[index+1];
                index +=2;
            }
        }

        return totalRollScore;
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