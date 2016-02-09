import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/result.vtl");

      String userWord = request.queryParams("word");
      Integer totalScore = scrabbleScore(userWord);

      model.put("totalScore", totalScore);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

public static HashMap<String, Integer> createAndPopulateHashMap() {
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
  return letterValues;
}

  public static Integer scrabbleScoreOfLetter(String letter) {
    HashMap<String, Integer> letterValues = createAndPopulateHashMap();
    Integer value = letterValues.get(letter);
    return value;
  }

  public static Integer scrabbleScore(String word) {
    String lowerCaseWord = word.toLowerCase();
    String[] lettersArray = lowerCaseWord.split("");
    Integer wordScore = 0;
    for(Integer i = 0; i < lettersArray.length; i++) {
      Integer letterScore = scrabbleScoreOfLetter(lettersArray[i]);
      wordScore += letterScore;
    }

    return wordScore;
  }
}
