package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    void testBowlingForFirstStrickAndRestAllAreZeroScore(){
        Bowling bowling = new Bowling();
        bowling.roll(10);
        for (int i = 1; i <= 18; i++) {
            bowling.roll(0);
        }
        assertEquals(10,bowling.score());
    }

}