import java.util.*;

public class Hangman {
  private static String[] words = {"nelly", "money", "java", "laptop", "bottle", "book"};
  private String word;
  private String answer;
  private List<String> playerLetters = new ArrayList<String>();
  private Boolean hang;
  private int wrongLetterCount;

  public Hangman() {
    Random myRandomGenerator = new Random();
    word = words[myRandomGenerator.nextInt(words.length)];
    answer = new String(new char[word.length()]).replace("\0", "-");
  }

  public String getWord() {
    return word;
  }

  public String getAnswer() {
    return answer;
  }

  /*public void playGame() {

  }*/

}
