package bowling;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BowlingTest {

    @Test

    void testScoreForPerfectGame(){
        Bowling bowling = new Bowling();
        for(int i=1;i<=12;i++){
            bowling.roll(10);
        }

        assertEquals(300,bowling.score());}

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