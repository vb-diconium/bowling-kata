package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    @Test
    void test() {
        assertEquals(0, 0);
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