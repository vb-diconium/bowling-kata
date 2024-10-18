package bowling;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BowlingTest {

  Bowling bowling;

  @BeforeEach
  void setUp() {

    bowling = new Bowling();
  }

  @Test
  void testScoreForPerfectGame() {
    rollingPins(12, 10);
    assertEquals(300, bowling.score());
  }

  @Test
  void bowlingRollZeroTest() {
    rollingPins(20, 0);
    assertEquals(0, bowling.score());
  }

  @Test
  void testBowlingForFirstStrickAndRestAllAreZeroScore() {
    bowling.roll(10);
    rollingPins(18, 0);
    assertEquals(10, bowling.score());
  }

  @Test
  void testBowlingForOneSpare(){
    bowling.roll(5);
    bowling.roll(5);
    rollingPins(18, 0);
    assertEquals(10,bowling.score());
  }

  @Test
  void testSpare() {
    bowling.roll(5);
    bowling.roll(5);
    bowling.roll(4);
    rollingPins(17, 0);
    assertEquals(18,bowling.score());
  }

  private void rollingPins(int noOfRolls, int pins) {
    for (int i = 1; i <= noOfRolls; i++) {
      bowling.roll(pins);
    }
  }


}
