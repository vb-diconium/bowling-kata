package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    @Test
    void bowlingRollZeroTest() {
        Bowling bowling = new Bowling();
        for (int i = 1; i <= 20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.score());
    }

}