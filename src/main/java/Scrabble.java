import static spark.Spark.*;
import java.util.HashMap;
import java.util.ArrayList;

public class Scrabble {
  public static void main(String[] args) {}


  public Integer scrabbleScoreOfLetter(String letter) {
    HashMap<String, Integer> letterValues = new HashMap();
    letterValues.put("a", 1);
    letterValues.put("e", 1);
    letterValues.put("i", 1);
    letterValues.put("o", 1);
    letterValues.put("u", 1);
    letterValues.put("l", 1);
    letterValues.put("n", 1);
    letterValues.put("r", 1);
    letterValues.put("s", 1);
    letterValues.put("t", 1);
    letterValues.put("d", 2);
    letterValues.put("g", 2);
    letterValues.put("b", 3);
    letterValues.put("c", 3);
    letterValues.put("m", 3);
    letterValues.put("p", 3);
    letterValues.put("f", 4);
    letterValues.put("h", 4);
    letterValues.put("v", 4);
    letterValues.put("w", 4);
    letterValues.put("y", 4);
    letterValues.put("k", 5);
    letterValues.put("j", 8);
    letterValues.put("x", 8);
    letterValues.put("q", 10);
    letterValues.put("z", 10);
    Integer value = letterValues.get(letter);
    return value;
  }
  public Integer scrabbleScore(String word) {
    String[] lettersArray = word.split("");
    Integer wordScore = 0;
    for(Integer i = 0; i < lettersArray.length; i++) {
      Integer letterScore = scrabbleScoreOfLetter(lettersArray[i]);
      wordScore = wordScore + letterScore;
    }

    return wordScore;
  }
}
