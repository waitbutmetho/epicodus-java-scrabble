import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScoreOfLetter_returnsAScrabbleScoreForALetter_1() {
    Integer score = 1;
    assertEquals(score, Scrabble.scrabbleScoreOfLetter("a"));
  }
  @Test
  public void scrabbleScore_takeInAWordAndReturnTheScore_5() {
    Integer score = 5;
    assertEquals(score, Scrabble.scrabbleScore("hi"));
  }
}
