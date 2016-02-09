import static spark.Spark.*;
import java.util.HashMap;
import java.util.ArrayList;

public class Scrabble {
  public static void main(String[] args) {}


  public Integer scrabbleScoreOfLetter(String letter) {
    HashMap<String, Integer> letterValues = new HashMap();
    letterValues.put("a", 1);
    Integer value = letterValues.get(letter);
    return value;
  }
}
