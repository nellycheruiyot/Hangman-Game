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

  public int getWrongLetterCount() {
    return wrongLetterCount;
  }

  public void playGame(String letter) {
    if (word.indexOf(letter.charAt(0)) == -1) {
      hang = true;
      wrongLetterCount += 1;
    } else {
      hang = false;
      playerLetters.add(letter);
      String tempStr = "";
      for (int i=0; i<word.length(); i++) {
        if (word.charAt(i) == letter.charAt(0)) {
          tempStr += letter;
        } else if (answer.charAt(i) != '-') {
          tempStr += answer.charAt(i);
        } else {
          tempStr += '-';
        }
      }
      answer = tempStr;
    }
  }
}
