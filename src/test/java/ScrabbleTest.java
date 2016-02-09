import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScoreOfLetter_returnsAScrabbleScoreForALetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 1;
    assertEquals(score, testScrabble.scrabbleScoreOfLetter("a"));
  }
  @Test
  public void scrabbleScore_takeInAWordAndReturnTheScore_5() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 5;
    assertEquals(score, testScrabble.scrabbleScore("hi"));
  }
}
