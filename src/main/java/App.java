import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Hangman hangman = new Hangman();
    System.out.println("Guess a letter: ");
    String letter = myConsole.readLine();
    hangman.playGame(letter);
    System.out.println(hangman.getAnswer());
  }
}
