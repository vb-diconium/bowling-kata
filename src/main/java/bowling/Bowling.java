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

        for (int roll = 0; roll < 10; roll++) {
            if (rolls[roll] == 10) {
                totalRollScore += rolls[roll] + rolls[roll + 1] + rolls[roll + 2];
            } else {
                totalRollScore += rolls[roll];
            }
        }
        return totalRollScore;
    }

}