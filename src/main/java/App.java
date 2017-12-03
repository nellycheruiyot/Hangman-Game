import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Hangman hangman = new Hangman();
    String word = hangman.getWord();
    String answer = hangman.getAnswer();
    while (!word.equals(answer)) {
      System.out.println("Guess a letter: ");
      String letter = myConsole.readLine();
      hangman.playGame(letter);
      answer = hangman.getAnswer();
      System.out.println(word);
      System.out.println(answer);

    }

  }
}
