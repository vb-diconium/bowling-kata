package bowling;

public class Bowling {

    private int totalRollScore = 0;

    public void roll(int pins) {
        this.totalRollScore = this.totalRollScore+pins;
    }

    public int score() {
        return this.totalRollScore;
    }

}