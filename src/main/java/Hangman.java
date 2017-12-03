import java.util.*;

public class Hangman {
  private static String[] words = {"money", "laptop", "bottle", "book"};
  private String word;
  private String answer;
  private List<String> playerLetters = new ArrayList<String>();
  private boolean hang = false;
  private int wrongLetterCount = 0;

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

  public boolean getHang() {
    return hang;
  }

  public void playGame(String letter) {
    if (word.indexOf(letter.charAt(0)) == -1) {
      hang = true;
      wrongLetterCount += 1;
    }else {
      
    }
  }

}
